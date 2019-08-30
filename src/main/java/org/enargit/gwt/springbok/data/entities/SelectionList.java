package org.enargit.gwt.springbok.data.entities;


import org.enargit.gwt.springbok.data.api.ISelectionList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;



@Entity
@Table(name = "selection_list")
public class SelectionList extends BaseEntity<Long> implements ISelectionList {





    @Column(nullable = false, length = 50)
    private String name;


    @ManyToOne
    Attribute attribute;

    @Column(nullable = true)
    private Date dateValue;

    @Column(nullable = true)
    private Float floatValue;

    @Column(nullable = true)
    private Long longValue;

    @Column(nullable = true)
    private String stringValue;

    @Column(nullable = true)
    private Boolean booleanValue;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Attribute getAttribute() {
        return attribute;
    }

    @Override
    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public Date getDateValue() {
        return dateValue;
    }

    @Override
    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    @Override
    public Float getFloatValue() {
        return floatValue;
    }

    @Override
    public void setFloatValue(Float floatValue) {
        this.floatValue = floatValue;
    }

    @Override
    public Long getLongValue() {
        return longValue;
    }

    @Override
    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    @Override
    public String getStringValue() {
        return stringValue;
    }

    @Override
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    @Override
    public Boolean getBooleanValue() {
        return booleanValue;
    }

    @Override
    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }
}
