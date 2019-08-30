package org.enargit.gwt.springbok.services.impl;

import org.enargit.gwt.springbok.data.entities.Role;
import org.enargit.gwt.springbok.data.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl extends BaseServiceImpl<Role, Long, RoleRepository> {

    private RoleRepository repository;

    @Override
    public RoleRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }
}
