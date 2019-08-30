package org.enargit.gwt.springbok.data.api;




import org.enargit.gwt.springbok.data.entities.Attribute;
import org.enargit.gwt.springbok.data.entities.SelectionList;
import org.enargit.gwt.springbok.data.entities.Subscription;

import java.util.Date;

public interface ISubscriptionAttributes extends IBaseEntity<Long> {

    Subscription getSubscription();

    void setSubscription(Subscription subscription);

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
