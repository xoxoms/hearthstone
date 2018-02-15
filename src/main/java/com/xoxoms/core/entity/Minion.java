package com.xoxoms.core.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ms on 2018. 1. 24..
 */
@Entity
@Table(name = "MINION_M")
public class Minion implements Type {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "CARD_ID")
    private Card card;
    @Column(name = "NAME")
    private String name;
    @Column(name = "COST")
    private Integer cost;
    @Column(name = "HEALTH_POINT")
    private Integer healthPoint;
    @Column(name = "ATTACK_POINT")
    private Integer attackPoint;
    @Column(name = "RARITY")
    private String rarity;
    @Column(name = "RACE")
    private String race;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "FLAVOR")
    private String flavor;
    @Column(name = "TARGETING_ARROW_TEXT")
    private String targetingArrowText;
    @Column(name = "TEXT_MARK_DOWN")
    private String textMarkDown;
    @OneToOne
    @JoinColumn(name = "SUBTYPE_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    private SubType subType;
    @OneToMany(mappedBy = "minion")
    private List<MinionAttributeMap> minionAttributeMaps;
    @Transient
    private List<Attribute> attributes;

    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTargetingArrowText() {
        return targetingArrowText;
    }

    public void setTargetingArrowText(String targetingArrowText) {
        this.targetingArrowText = targetingArrowText;
    }

    public String getTextMarkDown() {
        return textMarkDown;
    }

    public void setTextMarkDown(String textMarkDown) {
        this.textMarkDown = textMarkDown;
    }

    @Override
    public SubType getSubType() {
        return subType;
    }

    @Override
    public void setSubType(SubType subType) {
        this.subType = subType;
    }

    public List<MinionAttributeMap> getMinionAttributeMaps() {
        return minionAttributeMaps;
    }

    public void setMinionAttributeMaps(List<MinionAttributeMap> minionAttributeMaps) {
        this.minionAttributeMaps = minionAttributeMaps;
    }

    @Override
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
}
