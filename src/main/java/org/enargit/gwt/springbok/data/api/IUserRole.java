package org.enargit.gwt.springbok.data.api;


import org.enargit.gwt.springbok.data.entities.Role;
import org.enargit.gwt.springbok.data.entities.User;

public interface IUserRole extends IBaseEntity<Long> {
    Role getRole();

    void setRole(Role role);

    User getUser();

    void setUser(User user);
}
