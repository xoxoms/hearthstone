package com.xoxoms.controller;

import com.xoxoms.core.entity.Card;
import com.xoxoms.service.CardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by ms on 2018. 2. 25..
 */
@RestController
@RequestMapping("/api/v1/cards")
public class CardApiController {
    private CardService cardService;

    @Inject
    public CardApiController(CardService cardService) {
        this.cardService = cardService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Card> cards() {
        Long userId = 1L;
        return cardService.findByUserId(userId);
    }
}
