package com.xoxoms.core.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ms on 2018. 1. 24..
 */
@Entity
@Table(name = "SPELL_M")
@DiscriminatorValue("SPELL")
public class Spell extends Card {

}
