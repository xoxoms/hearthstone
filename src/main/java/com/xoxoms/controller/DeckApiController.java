package com.xoxoms.controller;

import com.xoxoms.core.domain.deck.DeckValidator;
import com.xoxoms.core.domain.deck.NewDeckRequest;
import com.xoxoms.service.DeckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by ms on 2018. 2. 10..
 */
@RestController
@RequestMapping("/api/v1/decks")
public class DeckApiController {
    private DeckValidator deckValidator;
    private DeckService deckService;

    @Inject
    public DeckApiController(DeckValidator deckValidator,
                             DeckService deckService) {
        this.deckValidator = deckValidator;
        this.deckService = deckService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public void list() {

    }

    @RequestMapping(method = RequestMethod.PUT)
    public void saveAndUpdate(@RequestBody NewDeckRequest newDeckRequest) {
        Long userId = 1L;
        newDeckRequest.validate();
        deckValidator.validateCards(userId, newDeckRequest.getCardIds());

        deckService.save(userId, newDeckRequest);
    }

    @RequestMapping(value = "/{deckId}", method = RequestMethod.DELETE)
    public void delete() {

    }
}
