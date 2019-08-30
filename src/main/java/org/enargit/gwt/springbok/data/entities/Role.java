package org.enargit.gwt.springbok.data.entities;



import org.enargit.gwt.springbok.data.api.IRole;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "role")
public class Role extends BaseEntity<Long> implements IRole {


    @Column(nullable = false, length = 60)
    private String role;

    @Column(nullable = true, length = 10485760)
    private String description;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Role{" +
                "role='" + role + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", version=" + version +
                ", created=" + created +
                ", modified=" + modified +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                '}';
    }
}
