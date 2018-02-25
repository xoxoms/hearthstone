package com.xoxoms.repository;

import com.xoxoms.core.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ms on 2018. 2. 22..
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findById(Long userId);
}
