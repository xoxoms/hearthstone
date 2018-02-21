package com.xoxoms.core.game.card.minion;

import com.google.common.collect.Lists;
import com.xoxoms.core.game.buff.Buff;
import com.xoxoms.core.game.card.Card;

import java.util.List;

/**
 * Created by ms on 2018. 1. 29..
 */
public class Minion implements Card {
    private Long id;
    private String name;
    private Integer baseCost;
    private Integer cost;
    private Integer baseHealthPoint;
    private Integer healthPoint;
    private Integer baseAttackPoint;
    private Integer attackPoint;
    private String rarity;
    private String description;
    private boolean canAttack = false;
    private List<Buff> buffs;

    public void playACard() {

    }

    public void beforeTurn() {

    }

    public void afterTurn() {

    }

    public void destroy() {
        this.healthPoint = 0;
    }

    public static Minion build(com.xoxoms.core.entity.Minion minion) {
        Minion newOne = new Minion();
        newOne.setId(minion.getId());
        newOne.setName(minion.getName());
        newOne.setBaseCost(minion.getCost());
        newOne.setCost(minion.getCost());
        newOne.setBaseHealthPoint (minion.getHealthPoint());
        newOne.setHealthPoint (minion.getHealthPoint());
        newOne.setAttackPoint (minion.getAttackPoint());
        newOne.setBaseAttackPoint (minion.getAttackPoint());
        newOne.setDescription (minion.getTextMarkDown());
        newOne.setBuffs(Lists.newArrayList());

        return newOne;
    }

    public void updateHealthPoint(int value) {
        this.healthPoint += value;

        if(this.healthPoint > this.baseHealthPoint) {
            this.healthPoint = baseHealthPoint;
        }
    }
    public void updateAttackPoint(int value) {
        this.attackPoint += value;
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
    public Integer getBaseCost() { return baseCost; }
    public void setBaseCost(Integer baseCost) { this.baseCost = baseCost; }
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    public Integer getBaseHealthPoint() {
        return baseHealthPoint;
    }
    public void setBaseHealthPoint(Integer baseHealthPoint) {
        this.baseHealthPoint = baseHealthPoint;
    }
    public Integer getHealthPoint() {
        return healthPoint;
    }
    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }
    public Integer getBaseAttackPoint() { return baseAttackPoint; }
    public void setBaseAttackPoint(Integer baseAttackPoint) { this.baseAttackPoint = baseAttackPoint; }
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
    public List<Buff> getBuffs() {
        return buffs;
    }
    public void setBuffs(List<Buff> buffs) {
        this.buffs = buffs;
    }
}
