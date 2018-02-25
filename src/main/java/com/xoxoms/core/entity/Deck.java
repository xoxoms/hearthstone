package com.xoxoms.core.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ms on 2018. 2. 21..
 */
@Entity
@Table(name = "DECK_M")
public class Deck {
    public Deck() {}
    public Deck(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "deck")
    private List<DeckCardMap> deckCardMaps;

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

    public List<DeckCardMap> getDeckCardMaps() {
        return deckCardMaps;
    }

    public void setDeckCardMaps(List<DeckCardMap> deckCardMaps) {
        this.deckCardMaps = deckCardMaps;
    }
}
