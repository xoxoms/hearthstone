package com.xoxoms.core.entity;

import javax.persistence.*;

/**
 * Created by ms on 2018. 2. 21..
 */
@Entity
@Table(name = "USER_DECK_MAP")
public class UserDeckMap {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "USER_ID", insertable = false, updatable = false)
    private Long userId;
    @Column(name = "DECK_ID", insertable = false, updatable = false)
    private Long deckId;
    @ManyToOne
    private User user;
    @OneToOne
    private Deck deck;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDeckId() {
        return deckId;
    }

    public void setDeckId(Long deckId) {
        this.deckId = deckId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }
}
