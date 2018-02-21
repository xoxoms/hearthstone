package com.xoxoms.type;

import com.xoxoms.core.entity.Minion;
import com.xoxoms.core.entity.UserCardMap;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.*;

/**
 * Created by ms on 2018. 1. 28..
 */
public class MinionTest {
    private EntityManagerFactory emf;

    @Before
    public void setup() {
        emf = Persistence.createEntityManagerFactory("jpa");
    }

    @Test
    public void test() {
        EntityManager em = emf.createEntityManager();

        Minion minion = em.find(Minion.class, 203L);
        com.xoxoms.core.game.card.minion.Minion parsed = com.xoxoms.core.game.card.minion.Minion.build(minion);

        assertTrue(minion.getName().equals("티리온 폴드링"));
        System.out.println(minion.getMinionAttributeMaps());
    }

    @Test
    public void test_getCards() {
        EntityManager em = emf.createEntityManager();
        UserCardMap userCardMap = em.find(UserCardMap.class, 1L);

        System.out.println(userCardMap.getUser().getNickname());
        System.out.println(userCardMap.getCard());
    }

    @Test
    public void test_getCard() {
        EntityManager em = emf.createEntityManager();
        Minion minion = em.find(Minion.class, 215L);
    }
}