package org.enargit.gwt.springbok.data.api;



import org.enargit.gwt.springbok.data.entities.Attribute;
import org.enargit.gwt.springbok.data.entities.Profile;
import org.enargit.gwt.springbok.data.entities.SelectionList;

import java.util.Date;

public interface IProfileAttributes extends IBaseEntity<Long> {
    IProfile getProfile();

    void setProfile(Profile profile);

    Attribute getAttribute();

    void setAttribute(Attribute attribute);

    SelectionList getSelectionList();

    void setSelectionList(SelectionList selectionList);

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
