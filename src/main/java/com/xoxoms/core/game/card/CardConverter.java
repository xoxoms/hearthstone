package com.xoxoms.core.game.card;

import com.xoxoms.core.game.card.minion.Minion;
import com.xoxoms.core.game.card.weapon.Weapon;
import com.xoxoms.core.game.card.spell.Spell;

/**
 * Created by ms on 2018. 2. 21..
 */
public class CardConverter {
    public static Card convertEntityToCard(com.xoxoms.core.entity.Card entityCard) {
        Card convertedCard;
        switch (entityCard.getType()) {
            case MINION:
                break;
            case WEAPON:
                break;
            case SPELL:
                break;
        }

        return null;
    }
}
