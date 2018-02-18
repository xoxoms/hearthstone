package com.xoxoms.core.domain.pack;

import com.xoxoms.core.entity.Card;
import com.xoxoms.repository.CardRepository;
import com.xoxoms.support.util.Yn;
import com.xoxoms.type.PackCode;
import com.xoxoms.type.Rarity;
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
        Rarity rarity = getRarity();
        if (rarity.equals(Rarity.LEGENDARY)) {
            System.out.println("get LEGENDARY!!!");
        }

        return cardRepository.countAllByUseYnAndPackCodeAndRarity(Yn.Y.name(), packCode, rarity);
    }
    private int getRandom(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
    private Rarity getRarity() {
        int random = getRandom(100);
        if (random < 5) return Rarity.LEGENDARY;
        else if (random < 15) return Rarity.EPIC;
        else if (random < 50) return Rarity.RARE;
        else return Rarity.COMMON;
    }

    private List<Card> findCardByRandomNumber(PackCode packCode, int bound) {
        int number = getRandom(bound);
        Pageable pageable = new PageRequest(number, 1);

        return cardRepository.findByPackCode(packCode, pageable);
    }
}
