package org.enargit.gwt.springbok.data.api;



import org.enargit.gwt.springbok.data.entities.Attribute;

import java.util.Date;

public interface ISelectionList extends IBaseEntity<Long> {
    String getName();

    void setName(String name);

    Attribute getAttribute();

    void setAttribute(Attribute attribute);

    Date getDateValue();

    void setDateValue(Date dateValue);

    Float getFloatValue();

    void setFloatValue(Float floatValue);

    Long getLongValue();

    void setLongValue(Long longValue);

    String getStringValue();

    void setStringValue(String stringValue);

    Boolean getBooleanValue();

    void setBooleanValue(Boolean booleanValue);
}
