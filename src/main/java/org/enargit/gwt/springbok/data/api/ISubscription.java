package org.enargit.gwt.springbok.data.api;



import org.enargit.gwt.springbok.data.entities.Campaign;
import org.enargit.gwt.springbok.data.entities.SubscriptionAttributes;
import org.enargit.gwt.springbok.data.entities.User;

import java.util.Set;

public interface ISubscription extends IBaseEntity<Long> {
    Campaign getCampaign();

    void setCampaign(Campaign campaign);

    User getUser();

    void setUser(User user);

    Set<SubscriptionAttributes> getAttributes();

    void setAttributes(Set<SubscriptionAttributes> attributes);
}
