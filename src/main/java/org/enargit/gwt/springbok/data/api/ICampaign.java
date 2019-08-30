package org.enargit.gwt.springbok.data.api;



import org.enargit.gwt.springbok.data.entities.CampaignAttributes;

import java.util.Set;

public interface ICampaign extends IBaseEntity<Long> {
    String getName();

    void setName(String name);

    String getCode();

    void setCode(String code);

    String getDescription();

    void setDescription(String description);

    boolean isNeedsLogin();

    void setNeedsLogin(boolean needsLogin);

    boolean isHasMailings();

    void setHasMailings(boolean hasMailings);

    Set<CampaignAttributes> getAttributes();

    void setAttributes(Set<CampaignAttributes> attributes);
}
