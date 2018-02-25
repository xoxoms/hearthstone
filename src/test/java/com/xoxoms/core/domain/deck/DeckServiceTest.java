package com.xoxoms.core.domain.deck;

import com.xoxoms.exception.ApiException;
import com.xoxoms.service.DeckService;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ms on 2018. 2. 25..
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DeckServiceTest {
    @Inject
    private DeckValidator deckValidator;
    @Inject
    private DeckService deckService;

    private Long userId;
    private NewDeckRequest newDeckRequest;


    @Before
    public void setup() {
        userId = 1L;
        List<Long> cardIds = Lists.newArrayList(51L,9L,127L,137L,45L,36L,25L,23L,82L,20L,114L,4L,83L,8L,61L,65L,46L,49L,117L,92L,155L,80L,55L,42L,146L,105L,97L,19L,112L,13L);

        newDeckRequest = new NewDeckRequest();
        newDeckRequest.setDeckName("어드민_테스트_덱");
        newDeckRequest.setCardIds(cardIds);
    }

    @Test
    public void test_덱을등록할수있다() {
        deckValidator.validateCards(userId, newDeckRequest.getCardIds());
        deckService.save(userId, newDeckRequest);
    }

    @Test(expected = ApiException.class)
    public void test_유저가소유하지않은카드는덱에사용할수없다() {
        newDeckRequest.getCardIds().remove(0);
        newDeckRequest.getCardIds().add(0, -1L);

        deckValidator.validateCards(userId, newDeckRequest.getCardIds());
    }
}