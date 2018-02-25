package com.xoxoms.core.entity;

import com.xoxoms.type.CardType;
import com.xoxoms.type.PackCode;
import com.xoxoms.type.Rarity;

import javax.persistence.*;

/**
 * Created by ms on 2018. 1. 24..
 */
@Entity
@Table(name = "CARD_M")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE")
public class Card {
    public Card() { }
    public Card(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private CardType type;
    @Column(name = "COST")
    private Integer cost;
    @Column(name = "RARITY")
    @Enumerated(EnumType.STRING)
    private Rarity rarity;
    @Column(name = "PACK_CODE")
    @Enumerated(EnumType.STRING)
    private PackCode packCode;
    @Column(name = "USE_YN")
    private String useYn;

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

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public PackCode getPackCode() {
        return packCode;
    }

    public void setPackCode(PackCode packCode) {
        this.packCode = packCode;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }
}
