package org.enargit.gwt.springbok.data.api;

public interface IRole extends IBaseEntity<Long> {

    String getRole();

    void setRole(String role);

    String getDescription();

    void setDescription(String description);
}
