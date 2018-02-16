package com.xoxoms.core.domain.pack;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;
import com.xoxoms.core.entity.Card;
import com.xoxoms.type.PackCode;

import java.util.List;

/**
 * Created by ms on 2018. 2. 15..
 */
public class Pack {
    private static final int DEFAULT_PACK_SIZE = 5;
    private PackCode packCode;
    private List<Card> cards;

    public Pack(PackCode packCode) {
        this.packCode = packCode;
        cards = Lists.newArrayList();
    }

    public static int getDefaultPackSize() {
        return DEFAULT_PACK_SIZE;
    }
    public PackCode getPackCode() {
        return packCode;
    }
    public void setPackCode(PackCode packCode) {
        this.packCode = packCode;
    }
    public List<Card> getCards() {
        return cards;
    }
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
    @JsonIgnore
    public void addCard(Card card) {
        this.cards.add(card);
    }
    @JsonIgnore
    public void addCard(List<Card> cards) {
        this.cards.addAll(cards);
    }
}
