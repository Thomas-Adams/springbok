package org.enargit.gwt.springbok.data.entities;



import org.enargit.gwt.springbok.data.api.IUserRole;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "user_role")
public class UserRole extends BaseEntity<Long> implements IUserRole {


    @ManyToOne(optional = false)
    private Role role;


    @ManyToOne(optional = false)
    private User user;


    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }
}
