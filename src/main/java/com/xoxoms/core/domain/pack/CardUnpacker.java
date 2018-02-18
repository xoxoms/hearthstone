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

    @Inject
    public CardUnpacker(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
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
        Random random = new Random();
        int number = random.nextInt(bound);
        Pageable pageable = new PageRequest(number, 1);

        return cardRepository.findByPackCode(packCode, pageable);
    }
}
