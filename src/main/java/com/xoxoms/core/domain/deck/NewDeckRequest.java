package com.xoxoms.core.domain.deck;

import com.xoxoms.core.game.system.Common;
import com.xoxoms.exception.ApiException;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Locale;

/**
 * Created by ms on 2018. 2. 25..
 */
public class NewDeckRequest {
    private List<Long> cardIds;
    private String deckName;

    public List<Long> getCardIds() {
        return cardIds;
    }

    public void setCardIds(List<Long> cardIds) {
        this.cardIds = cardIds;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public void validate() {
        if (cardIds.size() != Common.DEFAULT_DECK_SIZE) {
            throw new ApiException(String.format(Locale.KOREAN, "한 덱에 등록할 수 있는 카드는 %d장 입니다.", Common.DEFAULT_DECK_SIZE));
        }

        if(StringUtils.isEmpty(deckName)) {
            throw new ApiException(String.format(Locale.KOREAN, "덱 이름을 등록하셔야합니다."));
        }
    }
}
