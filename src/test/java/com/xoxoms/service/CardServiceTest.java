package com.xoxoms.service;

import com.xoxoms.core.entity.Card;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

/**
 * Created by ms on 2018. 2. 25..
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CardServiceTest {
    @Inject
    private CardService cardService;
    private Long userId = 1L;

    @Before
    public void setup() {
    }

    @Test
    public void test_유저의카드를조회할수있다() {
        List<Card> cards = cardService.findByUserId(userId);
        assertNotNull(cards);
        assertThat(cards.size(), greaterThan(0));
    }
}