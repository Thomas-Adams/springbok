package org.enargit.gwt.springbok.services.impl;


import org.enargit.gwt.springbok.data.entities.ProfileAttributes;
import org.enargit.gwt.springbok.data.repository.ProfileAttributesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProfileAttributesServiceImpl extends BaseServiceImpl<ProfileAttributes, Long, ProfileAttributesRepository> {

    private ProfileAttributesRepository repository;

    @Override
    public ProfileAttributesRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(ProfileAttributesRepository repository) {
        this.repository = repository;
    }
}
