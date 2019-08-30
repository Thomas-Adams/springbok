package org.enargit.gwt.springbok.data.api;



import org.enargit.gwt.springbok.data.entities.ProfileAttributes;

import java.util.Date;
import java.util.Set;

public interface IProfile extends IBaseEntity<Long> {

    String getGivenName();

    void setGivenName(String givenName);

    String getSurName();

    void setSurName(String surName);

    Date getBirthday();

    void setBirthday(Date birthday);

    Set<ProfileAttributes> getAttributes();

    void setAttributes(Set<ProfileAttributes> attributes);
}
