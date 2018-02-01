package com.xoxoms.core.game.action;

import com.xoxoms.core.game.card.minion.Minion;

import java.util.List;

/**
 * Created by ms on 2018. 1. 29..
 */
public class Heal implements Action {
    private List<Minion> minions;
    private List<Condition> conditions;
    private int value;

    public Heal(List<Minion> minions) {
        this.minions = minions;
    }

    @Override
    public void execute() {
        minions.forEach(minion -> {
            minion.updateHealthPoint(value);
        });
    }
}
