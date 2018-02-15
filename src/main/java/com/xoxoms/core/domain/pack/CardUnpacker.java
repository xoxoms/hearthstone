package com.xoxoms.core.domain.pack;

import com.xoxoms.core.entity.Card;
import com.xoxoms.repository.CardRepository;
import com.xoxoms.support.util.Yn;
import com.xoxoms.type.PackCode;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.Random;

/**
 * Created by ms on 2018. 2. 15..
 */
@Component
public class CardUnpacker {
    private CardRepository cardRepository;
    private Random randomGenerator;

    @Inject
    public CardUnpacker(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
        this.randomGenerator = new Random();
    }

    public void unpack(Pack pack) {
        int bound = getBound(pack.getPackCode());

        pack.getCards().forEach(card -> {
            card = findCardByRandomNumber(bound);
        });
    }

    private int getBound(PackCode packCode) {
        return cardRepository.countAllByUseYnAndPackCode(Yn.Y.name(), packCode);
    }

    private int getRandomNumber(int limit) {
        return randomGenerator.nextInt(limit);
    }

    private Card findCardByRandomNumber(int bound) {
        int number = randomGenerator.nextInt(bound);
        Pageable pageable = new PageRequest(number, 1);

        return cardRepository.findTopBy(pageable);
    }
}
