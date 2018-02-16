package com.xoxoms.core.domain.pack;

import com.xoxoms.core.entity.Card;
import com.xoxoms.repository.CardRepository;
import com.xoxoms.support.util.Yn;
import com.xoxoms.type.PackCode;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;
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

        for (int i = 0; i < Pack.getDefaultPackSize(); i++) {
            pack.addCard(findCardByRandomNumber(pack.getPackCode(), bound));
        }
    }

    private int getBound(PackCode packCode) {
        return cardRepository.countAllByUseYnAndPackCode(Yn.Y.name(), packCode);
    }

    private List<Card> findCardByRandomNumber(PackCode packCode, int bound) {
        int number = randomGenerator.nextInt(bound);
        Pageable pageable = new PageRequest(number, 1);

        return cardRepository.findByPackCode(packCode, pageable);
    }
}
