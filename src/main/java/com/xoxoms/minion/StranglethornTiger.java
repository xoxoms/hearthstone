package com.xoxoms.minion;

import com.xoxoms.type.AbstractMinion;

/**
 * Created by ms on 2018. 1. 24..
 */
public class StranglethornTiger extends AbstractMinion {
    private final String NAME = "가시덤불 호랑이";
    private final Integer COST = 5;
    private final Integer HEALTH_POINT = 5;
    private final Integer ATTACK_POINT = 5;

    public StranglethornTiger() {
        this.setName(NAME);
        this.setCost(COST);
        this.setHealthPoint(HEALTH_POINT);
        this.setAttackPoint(ATTACK_POINT);
    }
}
