package com.xoxoms.core.game.player;

import com.xoxoms.core.entity.User;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.*;

/**
 * Created by ms on 2018. 2. 21..
 */
public class PlayerTest {
    private Player player;
    private EntityManagerFactory emf;

    @Before
    public void setup() {
        emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        User user = em.find(User.class, 1L);
    }

    @Test
    public void test_덱을갖는다() {

    }

    @Test
    public void test_마나를갖는다() {

    }

    @Test
    public void test_카드를낼수있다() {

    }
}