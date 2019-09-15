package org.enargit.gwt.springbok.data.entities;


import org.enargit.gwt.springbok.data.api.ICountry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country extends BaseEntity<Long> implements ICountry {


    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "tld", nullable = true)
    private String domain;

    @Column(name = "abbr")
    private String abbreviation;

    @Column(name = "phone", nullable = true)
    private String phone;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDomain() {
        return domain;
    }

    @Override
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String getAbbreviation() {
        return abbreviation;
    }

    @Override
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
