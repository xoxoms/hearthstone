package com.xoxoms.core.entity;

import javax.persistence.*;

/**
 * Created by ms on 2018. 2. 10..
 */
@Entity
@Table(name = "USER_M")
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NICKNAME")
    private String nickname;
    @Column(name = "GOLD")
    private Integer gold;

    public Long getId() {
        return id;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Integer getGold() {
        return gold;
    }
    public void setGold(Integer gold) {
        this.gold = gold;
    }
}
