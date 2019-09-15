package org.enargit.gwt.springbok.data.api;

public interface ICountry extends IBaseEntity<Long> {
    String getName();

    void setName(String name);

    String getDomain();

    void setDomain(String domain);

    String getAbbreviation();

    void setAbbreviation(String abbreviation);

    String getPhone();

    void setPhone(String phone);
}
