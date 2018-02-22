package com.xoxoms.core.entity;

import com.xoxoms.core.game.card.*;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by ms on 2018. 2. 21..
 */
public class DeckCardMapTest {
    private EntityManagerFactory emf;

    @Before
    public void setup() {
        emf = Persistence.createEntityManagerFactory("jpa");
    }

    @Test
    public void test_덱을불러올수있다() {
        EntityManager em = emf.createEntityManager();
        // G
        User user = em.find(User.class, 1L);
        // W
        Deck deck = user.getUserDeckMaps().get(0).getDeck();
        List<DeckCardMap> deckCardMaps = deck.getDeckCardMaps();
        List<com.xoxoms.core.game.card.Card> cards = Lists.newArrayList();

        deckCardMaps.forEach(deckCardMap -> {
            com.xoxoms.core.game.card.Card convertedCard = CardConverter.convertEntityToCard(deckCardMap.getCard());
            cards.add(convertedCard);
        });

        // T
        assertNotNull(user);
        assertNotNull(user.getUserDeckMaps());
        assertThat(user.getUserDeckMaps().size(), is(2));
        assertNotNull(deck);
        assertNotNull(deckCardMaps);
        assertThat(deckCardMaps.size(), is(30));
        assertThat(cards.size(), is(30));

        cards.forEach(card -> assertTrue(card instanceof com.xoxoms.core.game.card.Card));
    }

    @Test
    public void test_미니언카드를불러올수있다() {
        EntityManager em = emf.createEntityManager();
        Minion minion = em.find(Minion.class, 10L);
        assertEquals(minion.getName(), "위습");
    }
}