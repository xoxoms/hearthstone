package com.xoxoms.service;

import com.xoxoms.core.domain.deck.NewDeckRequest;
import com.xoxoms.core.entity.*;
import com.xoxoms.repository.DeckCardMapRepository;
import com.xoxoms.repository.DeckRepository;
import com.xoxoms.repository.UserDeckMapRepository;
import com.xoxoms.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ms on 2018. 2. 25..
 */
@Service
public class DeckService {
    private UserRepository userRepository;
    private DeckRepository deckRepository;
    private DeckCardMapRepository deckCardMapRepository;
    private UserDeckMapRepository userDeckMapRepository;

    @Inject
    public DeckService(UserRepository userRepository,
                       DeckRepository deckRepository,
                       DeckCardMapRepository deckCardMapRepository,
                       UserDeckMapRepository userDeckMapRepository) {
        this.userRepository = userRepository;
        this.deckRepository = deckRepository;
        this.deckCardMapRepository = deckCardMapRepository;
        this.userDeckMapRepository = userDeckMapRepository;
    }

    @Transactional
    public void save(Long userId, NewDeckRequest newDeckRequest) {
        User user = userRepository.findById(userId);
        Deck deck = new Deck(newDeckRequest.getDeckName());

        UserDeckMap userDeckMap = new UserDeckMap();
        userDeckMap.setUser(user);
        userDeckMap.setDeck(deck);

        List<DeckCardMap> deckCardMaps = newDeckRequest.getCardIds().stream()
                .map(cardId -> {
                    DeckCardMap deckCardMap = new DeckCardMap();
                    deckCardMap.setDeck(deck);
                    deckCardMap.setCard(new Card(cardId));

                    return deckCardMap;
                }).collect(Collectors.toList());

        deckRepository.save(deck);
        userDeckMapRepository.save(userDeckMap);
        deckCardMapRepository.save(deckCardMaps);
    }
}
