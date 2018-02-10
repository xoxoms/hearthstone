package com.xoxoms.core.entity;

import javax.persistence.*;

/**
 * Created by ms on 2018. 2. 10..
 */
@Entity
@Table(name = "USER_CARD_MAP")
public class UserCardMap {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;
    @OneToOne
    @JoinColumn(name = "CARD_ID")
    private Card card;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
}
