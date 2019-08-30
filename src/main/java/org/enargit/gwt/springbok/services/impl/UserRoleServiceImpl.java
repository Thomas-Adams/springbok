package org.enargit.gwt.springbok.services.impl;


import org.enargit.gwt.springbok.data.entities.UserRole;
import org.enargit.gwt.springbok.data.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserRoleServiceImpl extends BaseServiceImpl<UserRole, Long, UserRoleRepository> {

    private UserRoleRepository repository;

    @Override
    public UserRoleRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(UserRoleRepository repository) {
        this.repository = repository;
    }
}
