package com.xoxoms.service;

import com.google.common.collect.Lists;
import com.xoxoms.core.domain.pack.CardUnpacker;
import com.xoxoms.core.domain.pack.Pack;
import com.xoxoms.core.entity.UserCardMap;
import com.xoxoms.repository.CardRepository;
import com.xoxoms.repository.UserCardMapRepository;
import com.xoxoms.type.PackCode;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by ms on 2018. 2. 10..
 */
@Service
public class PackService {
    CardRepository cardRepository;
    private final UserCardMapRepository userCardMapRepository;
    private final CardUnpacker unpacker;

    @Inject
    public PackService(CardRepository cardRepository,
                       UserCardMapRepository userCardMapRepository,
                       CardUnpacker unpacker) {
        this.cardRepository = cardRepository;
        this.userCardMapRepository = userCardMapRepository;
        this.unpacker = unpacker;
    }

    public List<UserCardMap> getUserCards(Long userId) {
        return userCardMapRepository.findByUserId(userId);
    }

    public Pack unpack(PackCode packCode) {
        Pack pack = new Pack(packCode);
        unpacker.unpack(pack);

        return pack;
    }

    public void applyPack(Long userId, Pack pack) {
        List<UserCardMap> userCardMaps = Lists.newArrayList();
        pack.getCards().forEach(card -> {
            UserCardMap userCardMap = new UserCardMap();
            userCardMap.setUserId(userId);
            userCardMap.setCardId(card.getId());
            userCardMaps.add(userCardMap);
        });

        userCardMapRepository.save(userCardMaps);
    }
}
