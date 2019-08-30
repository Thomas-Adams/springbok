package org.enargit.gwt.springbok.services.impl;


import org.enargit.gwt.springbok.data.entities.Campaign;
import org.enargit.gwt.springbok.data.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CampaignServiceImpl extends BaseServiceImpl<Campaign, Long, CampaignRepository> {

    private CampaignRepository repository;

    @Override
    public CampaignRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(CampaignRepository repository) {
        this.repository = repository;
    }
}
