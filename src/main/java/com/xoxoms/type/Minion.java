package com.xoxoms.type;

import com.xoxoms.attribute.Attribute;
import com.xoxoms.subtype.SubType;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ms on 2018. 1. 24..
 */
@Entity
@Table(name = "MINION_M")
public class Minion implements Type {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "CODE")
    private String code;
    @Column(name = "NAME")
    private String name;
    @Column(name = "COST")
    private Integer cost;
    @Column(name = "SUBTYPE")
    private SubType subType;

    private List<Attribute> attributes;
    @Column(name = "HEALTH_POINT")
    private Integer healthPoint;

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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public SubType getSubType() {
        return subType;
    }

    @Override
    public void setSubType(SubType subType) {
        this.subType = subType;
    }

    @Override
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Integer getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(Integer attackPoint) {
        this.attackPoint = attackPoint;
    }

    @Column(name = "ATTACK_POINT")
    private Integer attackPoint;
}
