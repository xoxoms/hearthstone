package com.xoxoms.repository;

import com.xoxoms.core.entity.UserCardMap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by ms on 2018. 2. 15..
 */
public interface UserCardMapRepository extends JpaRepository<UserCardMap, Long> {
    List<UserCardMap> findByUserId(Long userId);
    UserCardMap findByUserIdAndCardId(Long userId, Long cardId);
}
