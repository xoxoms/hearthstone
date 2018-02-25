package com.xoxoms.core.domain.deck;

import com.xoxoms.exception.ApiException;
import com.xoxoms.repository.UserCardMapRepository;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by ms on 2018. 2. 25..
 */
@Component
public class DeckValidator {
    private UserCardMapRepository userCardMapRepository;

    @Inject
    public DeckValidator(UserCardMapRepository userCardMapRepository) {
        this.userCardMapRepository = userCardMapRepository;
    }

    public void validateCards(Long userId, List<Long> cardIds) {
        if (userCardMapRepository.countByUserIdAndCardIdIn(userId, cardIds) != cardIds.size()) {
            throw new ApiException("유저가 소유하지 않은 카드가 사용되었습니다.");
        }
    }
}
