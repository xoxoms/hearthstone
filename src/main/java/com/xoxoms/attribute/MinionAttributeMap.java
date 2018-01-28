package com.xoxoms.attribute;

import javax.persistence.*;

/**
 * Created by ms on 2018. 1. 27..
 */
@Entity
@Table(name = "MINION_ATTRIBUTE_MAP")
public class MinionAttributeMap {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "MINION_ID")
    private Long minionId;
    @Column(name = "ATTRIBUTE_ID")
    private Long attributeId;
    @Column(name = "TEMP")
    private String temp;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getMinionId() {
        return minionId;
    }
    public void setMinionId(Long minionId) {
        this.minionId = minionId;
    }
    public Long getAttributeId() {
        return attributeId;
    }
    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }
    public String getTemp() {
        return temp;
    }
    public void setTemp(String temp) {
        this.temp = temp;
    }
}
