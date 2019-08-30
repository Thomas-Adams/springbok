package org.enargit.gwt.springbok.web.rest;


import org.enargit.gwt.springbok.data.entities.Role;
import org.enargit.gwt.springbok.services.impl.RoleServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@CrossOrigin({"http://localhost:4200","http://localhost:8888","http://127.0.0.1:8888"})
@RequestMapping("/api/roles")
public class RoleController extends BaseController<RoleServiceImpl, Role, Long> {


    private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);

    private RoleServiceImpl roleService;

    @Autowired
    @Override
    public void setService(RoleServiceImpl service) {
        this.roleService = service;
    }

    @Override
    public RoleServiceImpl getService() {
        return roleService;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Role> findAll() {
        return this.roleService.findAll();
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Role save(@RequestBody Role role, HttpServletRequest request) {
        LOGGER.info(role.toString());
        return this.roleService.save(role);
    }
}
