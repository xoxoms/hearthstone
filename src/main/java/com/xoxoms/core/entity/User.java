package com.xoxoms.core.entity;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(mappedBy = "user")
    private List<UserDeckMap> userDeckMaps;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<UserDeckMap> getUserDeckMaps() {
        return userDeckMaps;
    }

    public void setUserDeckMaps(List<UserDeckMap> userDeckMaps) {
        this.userDeckMaps = userDeckMaps;
    }
}
