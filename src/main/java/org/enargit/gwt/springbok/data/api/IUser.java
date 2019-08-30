package org.enargit.gwt.springbok.data.api;

import java.util.Date;

public interface IUser extends IBaseEntity<Long> {

    String getUsername();

    void setUsername(String username);

    String getPassword();

    void setPassword(String password);

    String getEmail();

    void setEmail(String email);

    String getMobile();

    void setMobile(String mobile);

    boolean isEnabled();

    void setEnabled(boolean enabled);

    boolean isLocked();

    void setLocked(boolean locked);

    boolean isExpired();

    void setExpired(boolean expired);

    String getAccessToken();

    void setAccessToken(String accessToken);

    String getRefreshToken();

    void setRefreshToken(String refreshToken);

    Date getLastChangeCredentials();

    void setLastChangeCredentials(Date lastChangeCredentials);

    Date getLastLogin();

    void setLastLogin(Date lastLogin);
}
