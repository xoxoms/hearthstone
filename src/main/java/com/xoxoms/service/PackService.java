package com.xoxoms.service;

import com.xoxoms.core.domain.pack.CardUnpacker;
import com.xoxoms.core.domain.pack.Pack;
import com.xoxoms.core.entity.UserCardMap;
import com.xoxoms.repository.CardRepository;
import com.xoxoms.repository.UserCardMapRepository;
import com.xoxoms.type.PackCode;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.transaction.Transactional;
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

    @Transactional
    public void applyPack(Long userId, Pack pack) {
        pack.getCards().forEach(card -> {
            UserCardMap userCardMap = userCardMapRepository.findByUserIdAndCardId(userId, card.getId());
            if (userCardMap == null) {
                userCardMap = new UserCardMap();
                userCardMap.setUserId(userId);
                userCardMap.setCardId(card.getId());
                userCardMap.setCount(1);
            } else {
                userCardMap.setCount(userCardMap.getCount() + 1);
            }

            userCardMapRepository.save(userCardMap);
        });
    }
}
