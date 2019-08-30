package org.enargit.gwt.springbok.services.impl;


import org.enargit.gwt.springbok.data.entities.Profile;
import org.enargit.gwt.springbok.data.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProfileServiceImpl extends BaseServiceImpl<Profile, Long, ProfileRepository> {


    private ProfileRepository repository;

    @Override
    public ProfileRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(ProfileRepository repository) {
        this.repository = repository;
    }
}
