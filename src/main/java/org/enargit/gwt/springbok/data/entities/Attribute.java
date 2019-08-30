package org.enargit.gwt.springbok.data.entities;




import org.enargit.gwt.springbok.data.api.IAttribute;
import org.enargit.gwt.springbok.data.enums.ObjectTypes;
import org.enargit.gwt.springbok.data.enums.ValueTypes;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Entity
@Table(name = "attribute")
public class Attribute extends BaseEntity<Long> implements IAttribute {


    @Column(nullable = false, length=50)
    private String name;


    @Column(nullable = true, length = 10485760)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private ObjectTypes type;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private ValueTypes dataType;


    @OneToMany(mappedBy = "attribute", fetch = FetchType.LAZY)
    private Set<SelectionList> selectionLists = new HashSet<>(0);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public ObjectTypes getType() {
        return type;
    }

    @Override
    public void setType(ObjectTypes type) {
        this.type = type;
    }

    @Override
    public ValueTypes getDataType() {
        return dataType;
    }

    @Override
    public void setDataType(ValueTypes dataType) {
        this.dataType = dataType;
    }

    @Override
    public Set<SelectionList> getSelectionLists() {
        return selectionLists;
    }

    @Override
    public void setSelectionLists(Set<SelectionList> selectionLists) {
        this.selectionLists = selectionLists;
    }
}
