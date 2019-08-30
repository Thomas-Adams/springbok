package org.enargit.gwt.springbok.data.entities;


import org.enargit.gwt.springbok.data.api.ISubscription;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "subscription")
public class Subscription extends BaseEntity<Long> implements ISubscription {


    @ManyToOne(optional = false)
    private Campaign campaign;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "subscription")
    private Set<SubscriptionAttributes> attributes = new HashSet<>(0);

    @Override
    public Campaign getCampaign() {
        return campaign;
    }

    @Override
    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public Set<SubscriptionAttributes> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(Set<SubscriptionAttributes> attributes) {
        this.attributes = attributes;
    }
}
