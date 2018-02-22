package com.xoxoms.core.game.card;

import com.xoxoms.core.game.card.minion.Minion;
import com.xoxoms.core.game.card.weapon.Weapon;
import com.xoxoms.core.game.card.spell.Spell;
import com.xoxoms.exception.NoCardException;

/**
 * Created by ms on 2018. 2. 21..
 */
public class CardConverter {
    public static Card convertEntityToCard(com.xoxoms.core.entity.Card entityCard) {
        switch (entityCard.getType()) {
            case MINION:
                return Minion.build((com.xoxoms.core.entity.Minion) entityCard);
            case WEAPON:
                return Weapon.build((com.xoxoms.core.entity.Weapon) entityCard);
            case SPELL:
                return Spell.build((com.xoxoms.core.entity.Spell) entityCard);
        }

        throw new NoCardException("잘못된 카드입니다.");
    }
}
