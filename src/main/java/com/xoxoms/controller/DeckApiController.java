package com.xoxoms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ms on 2018. 2. 10..
 */
@Controller
@RequestMapping("/api/v1/decks")
public class DeckApiController {

    @RequestMapping(method = RequestMethod.GET)
    public void list() {

    }

    @RequestMapping(method = RequestMethod.PUT)
    public void save() {

    }

    @RequestMapping(value = "/{deckId}", method = RequestMethod.DELETE)
    public void delete() {

    }
}
