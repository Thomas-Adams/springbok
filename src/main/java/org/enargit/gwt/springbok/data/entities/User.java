package org.enargit.gwt.springbok.data.entities;

import org.enargit.gwt.springbok.data.api.IUser;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "users")
public class User extends BaseEntity<Long> implements IUser {


    @Column(nullable = false, length = 100, unique = true)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 30)
    private String mobile;

    @Column(nullable = false, columnDefinition = "boolean DEFAULT true")
    private boolean enabled;

    @Column(nullable = false, columnDefinition = "boolean DEFAULT false")
    private boolean locked;

    @Column(nullable = false, columnDefinition = "boolean DEFAULT false")
    private boolean expired;

    @Column(nullable = true, length = 255)
    private String accessToken;

    @Column(nullable = true, length = 255)
    private String refreshToken;


    @Column(nullable = false)
    private Date lastChangeCredentials;

    @Column(nullable = true)
    private Date lastLogin;

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getMobile() {
        return mobile;
    }

    @Override
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean isLocked() {
        return locked;
    }

    @Override
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    @Override
    public boolean isExpired() {
        return expired;
    }

    @Override
    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String getRefreshToken() {
        return refreshToken;
    }

    @Override
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public Date getLastChangeCredentials() {
        return lastChangeCredentials;
    }

    @Override
    public void setLastChangeCredentials(Date lastChangeCredentials) {
        this.lastChangeCredentials = lastChangeCredentials;
    }

    @Override
    public Date getLastLogin() {
        return lastLogin;
    }

    @Override
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}
