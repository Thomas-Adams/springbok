package org.enargit.gwt.springbok.data.api;

import java.io.Serializable;
import java.util.Date;

public interface IBaseEntity<ID extends Serializable> extends Serializable {
    ID getId();

    void setId(ID id);

    long getVersion();

    void setVersion(long version);

    Date getCreated();

    void setCreated(Date created);

    Date getModified();

    void setModified(Date modified);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    String getModifiedBy();

    void setModifiedBy(String modifiedBy);
}
