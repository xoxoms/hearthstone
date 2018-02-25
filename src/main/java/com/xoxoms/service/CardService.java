package com.xoxoms.service;

import com.xoxoms.core.entity.Card;
import com.xoxoms.core.entity.UserCardMap;
import com.xoxoms.repository.CardRepository;
import com.xoxoms.repository.UserCardMapRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ms on 2018. 2. 25..
 */
@Service
public class CardService {
    private CardRepository cardRepository;
    private UserCardMapRepository userCardMapRepository;

    @Inject
    public CardService(CardRepository cardRepository,
                       UserCardMapRepository userCardMapRepository) {
        this.cardRepository = cardRepository;
        this.userCardMapRepository = userCardMapRepository;
    }

    public List<Card> findByUserId(Long userId) {
        return userCardMapRepository.findByUserId(userId).stream()
                .map(UserCardMap::getCard)
                .collect(Collectors.toList());
    }
}
