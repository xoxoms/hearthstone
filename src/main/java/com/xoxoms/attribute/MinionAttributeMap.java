package com.xoxoms.attribute;

import javax.persistence.*;

/**
 * Created by ms on 2018. 1. 27..
 */
@Entity
public class MinionAttributeMap {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "MINION_ID")
    private Long minionId;
    @Column(name = "ATTRIBUTE_ID")
    private Long attributeId;

}
