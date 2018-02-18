package com.xoxoms.repository;

import com.xoxoms.core.entity.Card;
import com.xoxoms.type.PackCode;
import com.xoxoms.type.Rarity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by ms on 2018. 2. 15..
 */
public interface CardRepository extends JpaRepository<Card, Long> {
    int countAllByUseYnAndPackCodeAndRarity(String useYn, PackCode packCode, Rarity rarity);
    List<Card> findByPackCode(PackCode packCode, Pageable pageable);
}
