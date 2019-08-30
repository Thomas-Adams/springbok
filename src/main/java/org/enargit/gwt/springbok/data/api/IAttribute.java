package org.enargit.gwt.springbok.data.api;




import org.enargit.gwt.springbok.data.entities.SelectionList;
import org.enargit.gwt.springbok.data.enums.ObjectTypes;
import org.enargit.gwt.springbok.data.enums.ValueTypes;

import java.util.Set;

public interface IAttribute extends IBaseEntity<Long> {
    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    ObjectTypes getType();

    void setType(ObjectTypes type);

    ValueTypes getDataType();

    void setDataType(ValueTypes dataType);

    Set<SelectionList> getSelectionLists();

    void setSelectionLists(Set<SelectionList> selectionLists);
}
