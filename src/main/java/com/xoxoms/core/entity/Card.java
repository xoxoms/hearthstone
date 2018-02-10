package com.xoxoms.core.entity;

import com.xoxoms.type.CardType;

import javax.persistence.*;

/**
 * Created by ms on 2018. 1. 24..
 */
@Entity
@Table(name = "CARD_M")
public class Card {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private CardType type;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public CardType getType() {
        return type;
    }
    public void setType(CardType type) {
        this.type = type;
    }
}
