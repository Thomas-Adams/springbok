package org.enargit.gwt.springbok.services.impl;


import org.enargit.gwt.springbok.data.entities.CampaignAttributes;
import org.enargit.gwt.springbok.data.repository.CampaignAttributesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CampaignAttributesServiceImpl extends BaseServiceImpl<CampaignAttributes, Long, CampaignAttributesRepository> {


    private CampaignAttributesRepository repository;

    @Override
    public CampaignAttributesRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(CampaignAttributesRepository repository) {
        this.repository = repository;
    }
}
