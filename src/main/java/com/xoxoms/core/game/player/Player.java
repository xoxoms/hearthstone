package com.xoxoms.core.game.player;

import com.xoxoms.core.game.card.Card;
import com.xoxoms.core.game.card.minion.Minion;
import com.xoxoms.core.game.system.Arena;

import java.util.List;

/**
 * Created by ms on 2018. 1. 29..
 */
public class Player {
    private Arena arena;
    private PlayerClass playerPlayerClass;
    private List<Minion> minions;
    private List<Card> deck;
    private List<Card> hand;
    private List<Card> died;
    private int mana;

    public Player(Arena arena) {
        this.arena = arena;
        mana = 1;
    }

    public void playACard(Card card) {
        card.playACard();
    }

    public void turnStart() {

    }

    public void turnEnd() {
        minions.forEach(Minion::afterTurn);
    }
}
