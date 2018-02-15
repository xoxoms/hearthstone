package com.xoxoms.service;

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
public class DeckService {
    CardRepository cardRepository;
    private final UserCardMapRepository userCardMapRepository;
    private final CardUnpacker unpacker;

    @Inject
    public DeckService(CardRepository cardRepository,
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
}
