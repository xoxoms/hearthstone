package com.xoxoms.core.entity;

import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        User user = em.find(User.class, 1L);
        assertNotNull(user);
        assertNotNull(user.getUserDeckMaps());
        assertThat(user.getUserDeckMaps().size(), is(2));
    }

    @Test
    public void test_미니언카드를불러올수있다() {
        EntityManager em = emf.createEntityManager();
        Minion minion = em.find(Minion.class, 10L);
        assertEquals(minion.getName(), "위습");
    }
}