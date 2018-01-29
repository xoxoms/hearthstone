package com.xoxoms.core.game.card.minion;

import com.xoxoms.core.game.card.Card;

/**
 * Created by ms on 2018. 1. 29..
 */
public class Minion implements Card {
    private Long id;
    private String name;
    private Integer cost;
    private Integer healthPoint;
    private Integer attackPoint;
    private String rarity;
    private String description;
    private boolean canAttack = false;

    public void playACard() {

    }

    public void destroy() {
        this.healthPoint = 0;
    }

    public Minion build(com.xoxoms.core.entity.Minion minion) {
        Minion newOne = new Minion();
        newOne.setId(minion.getId());
        newOne.setName (minion.getName());
        newOne.setCost (minion.getCost());
        newOne.setHealthPoint (minion.getHealthPoint());
        newOne.setAttackPoint (minion.getAttackPoint());
        newOne.setRarity (minion.getRarity());
        newOne.setDescription (minion.getTextMarkDown());

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
    public Integer getHealthPoint() {
        return healthPoint;
    }
    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }
    public Integer getAttackPoint() {
        return attackPoint;
    }
    public void setAttackPoint(Integer attackPoint) {
        this.attackPoint = attackPoint;
    }
    public String getRarity() {
        return rarity;
    }
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCanAttack() {
        return canAttack;
    }
    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }
}
