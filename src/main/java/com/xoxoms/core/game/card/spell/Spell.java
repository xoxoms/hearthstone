package com.xoxoms.core.game.card.spell;

import com.xoxoms.core.game.card.Card;

/**
 * Created by ms on 2018. 2. 21..
 */
public class Spell implements Card {
    private Long id;
    private String name;
    private Integer cost;

    public static Spell build(com.xoxoms.core.entity.Spell spell) {
        Spell newOne = new Spell();
        newOne.setId(spell.getId());
        newOne.setName(spell.getName());
        newOne.setCost(spell.getCost());

        return newOne;
    }

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
