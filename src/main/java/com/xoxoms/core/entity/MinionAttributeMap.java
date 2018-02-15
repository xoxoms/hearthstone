package com.xoxoms.core.entity;

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
    @ManyToOne
    @JoinColumn(name = "MINION_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    private Minion minion;
    @ManyToOne
    @JoinColumn(name = "ATTRIBUTE_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    private Attribute attribute;

    public Long getId() {
        return id;
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
    public Minion getMinion() {
        return minion;
    }
    public void setMinion(Minion minion) {
        this.minion = minion;
    }
    public Attribute getAttribute() {
        return attribute;
    }
    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
