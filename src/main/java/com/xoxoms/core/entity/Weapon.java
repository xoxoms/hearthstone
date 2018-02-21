package com.xoxoms.core.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ms on 2018. 2. 21..
 */
@Entity
@Table(name = "WEAPON_M")
@DiscriminatorValue("WEAPON")
public class Weapon extends Card {
}
