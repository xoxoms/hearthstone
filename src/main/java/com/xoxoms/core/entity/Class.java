package com.xoxoms.core.entity;

import javax.persistence.*;

/**
 * Created by ms on 2018. 1. 28..
 */
@Entity
@Table(name = "CLASS_M")
public class Class {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
