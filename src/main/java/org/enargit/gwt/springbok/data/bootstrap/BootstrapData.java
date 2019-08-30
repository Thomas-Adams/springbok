package org.enargit.gwt.springbok.data.bootstrap;


import org.enargit.gwt.springbok.data.entities.Role;
import org.enargit.gwt.springbok.services.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootstrapData implements ApplicationListener<ContextRefreshedEvent> {

    private RoleServiceImpl roleService;

    public RoleServiceImpl getRoleService() {
        return roleService;
    }

    @Autowired
    public void setRoleService(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        loadRoles();
    }

    private void loadRoles() {

        Role roleUser = new Role();
        roleUser.setRole("ROLE_USER");
        roleUser.setDescription("Common user role");
        roleUser.setCreated(new Date());
        roleUser.setCreatedBy("admin");
        roleService.save(roleUser);

        Role roleAdmin = new Role();
        roleAdmin.setRole("ROLE_ADMIN");
        roleAdmin.setDescription("Administrator role");
        roleAdmin.setCreated(new Date());
        roleAdmin.setCreatedBy("admin");
        roleService.save(roleAdmin);
    }
}
