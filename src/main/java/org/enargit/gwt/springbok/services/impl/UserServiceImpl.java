package org.enargit.gwt.springbok.services.impl;


import org.enargit.gwt.springbok.data.entities.User;
import org.enargit.gwt.springbok.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepository> {

    private UserRepository repository;

    @Override
    public UserRepository getRepository() {
        return null;
    }

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }
}
