package com.xoxoms.core.game.player;

import com.xoxoms.core.game.card.Card;
import com.xoxoms.core.game.card.minion.Minion;

import java.util.List;

/**
 * Created by ms on 2018. 1. 29..
 */
public class Player {
    private PlayerClass playerPlayerClass;
    private List<Minion> minions;
    private List<Card> deck;
    private List<Card> hand;
    private List<Card> died;

    public void playACard(Card card) {
        card.playACard();
    }
}
