package org.enargit.gwt.springbok.data.entities;


import org.apache.commons.lang3.StringUtils;
import org.enargit.gwt.springbok.data.api.IBaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
public class BaseEntity<ID extends Serializable> implements IBaseEntity<ID> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected ID id;

    @Version
    protected long version;

    @Column(nullable = false, updatable = false)
    protected Date created;

    @Column(nullable = true, updatable = true)
    protected Date modified;

    @Column(nullable = false, updatable = false)
    protected String createdBy;

    @Column(nullable = true, updatable = true)
    protected String modifiedBy;


    @Override
    public ID getId() {
        return id;
    }

    @Override
    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public long getVersion() {
        return version;
    }

    @Override
    public void setVersion(long version) {
        this.version = version;
    }

    @Override
    public Date getCreated() {
        return created;
    }


    @Override
    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public Date getModified() {
        return modified;
    }

    @Override
    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String getModifiedBy() {
        return modifiedBy;
    }

    @Override
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @PrePersist
    public void prePersist() {
        if (id != null) {
            if (modified == null) {
                modified = new Date();
            }
            if (StringUtils.isEmpty(modifiedBy)) {
                modifiedBy = "admin";
            }
        }
        if (created == null) {
            created = new Date();
        }
        if (StringUtils.isEmpty(createdBy)) {
            createdBy = "admin";
        }
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", version=" + version +
                ", created=" + created +
                ", modified=" + modified +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                '}';
    }
}
