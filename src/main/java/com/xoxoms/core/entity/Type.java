package com.xoxoms.core.entity;

import java.util.List;

/**
 * Created by ms on 2018. 1. 27..
 */
public interface Type extends Card {
    String getName();
    void setName(String name);
    Integer getCost();
    void setCost(Integer cost);
    SubType getSubType();
    void setSubType(SubType subType);
    List<Attribute> getAttributes();
    void setAttributes(List<Attribute> attributes);
}
