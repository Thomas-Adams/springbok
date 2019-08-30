package org.enargit.gwt.springbok.data.entities;


import org.enargit.gwt.springbok.data.api.IProfile;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "profile")
public class Profile extends BaseEntity<Long> implements IProfile {


    @Column(nullable = false, length=50)
    private String givenName;

    @Column(nullable = false, length=50)
    private String surName;

    @Column(nullable = true)
    private Date birthday;

    @OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
    private Set<ProfileAttributes> attributes = new HashSet<>(0);

    @Override
    public String getGivenName() {
        return givenName;
    }

    @Override
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @Override
    public String getSurName() {
        return surName;
    }

    @Override
    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public Date getBirthday() {
        return birthday;
    }

    @Override
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public Set<ProfileAttributes> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(Set<ProfileAttributes> attributes) {
        this.attributes = attributes;
    }
}
