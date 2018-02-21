package com.xoxoms.core.game.card.weapon;

import com.xoxoms.core.game.card.Card;

/**
 * Created by ms on 2018. 2. 21..
 */
public class Weapon implements Card {
    private Long id;
    private String name;
    private Integer cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public void playACard() {

    }
}
