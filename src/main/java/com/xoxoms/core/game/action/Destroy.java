package com.xoxoms.core.game.action;

import com.xoxoms.core.game.card.minion.Minion;

import java.util.List;

/**
 * Created by ms on 2018. 1. 29..
 */
public class Destroy implements Action {
    private List<Minion> minions;

    public Destroy(List<Minion> minions) {
        this.minions = minions;
    }

    @Override
    public void execute() {
        minions.forEach(Minion::destroy);
    }
}
