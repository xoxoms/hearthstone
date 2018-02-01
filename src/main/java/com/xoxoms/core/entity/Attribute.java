package com.xoxoms.core.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ms on 2018. 1. 24..
 */
@Entity
@Table(name = "ATTRIBUTE_M")
public class Attribute {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "CODE")
    private String code;
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "attribute")
    private List<MinionAttributeMap> minionAttributeMaps;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<MinionAttributeMap> getMinionAttributeMaps() {
        return minionAttributeMaps;
    }
    public void setMinionAttributeMaps(List<MinionAttributeMap> minionAttributeMaps) {
        this.minionAttributeMaps = minionAttributeMaps;
    }
}
