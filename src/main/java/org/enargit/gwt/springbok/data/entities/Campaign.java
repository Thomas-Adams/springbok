package org.enargit.gwt.springbok.data.entities;




import org.enargit.gwt.springbok.data.api.ICampaign;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "campaign")
public class Campaign extends BaseEntity<Long> implements ICampaign {



    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String code;


    @Column(nullable = true, length = 10485760)
    private String description;

    @Column(nullable = false)
    private boolean needsLogin;

    @Column(nullable = false)
    private boolean hasMailings;


    @OneToMany(mappedBy = "campaign",fetch = FetchType.LAZY)
    private Set<CampaignAttributes> attributes = new HashSet<>(0);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean isNeedsLogin() {
        return needsLogin;
    }

    @Override
    public void setNeedsLogin(boolean needsLogin) {
        this.needsLogin = needsLogin;
    }

    @Override
    public boolean isHasMailings() {
        return hasMailings;
    }

    @Override
    public void setHasMailings(boolean hasMailings) {
        this.hasMailings = hasMailings;
    }

    @Override
    public Set<CampaignAttributes> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(Set<CampaignAttributes> attributes) {
        this.attributes = attributes;
    }
}
