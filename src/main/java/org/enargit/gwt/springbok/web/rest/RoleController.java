package org.enargit.gwt.springbok.web.rest;


import org.enargit.gwt.springbok.data.entities.Role;
import org.enargit.gwt.springbok.domain.OffsetLimitRequest;
import org.enargit.gwt.springbok.services.impl.RoleServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
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

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, params = {"page", "size"})
    public List<Role> findAllByPage(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return this.roleService.findAllByPageAsList(pageable);
    }


    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, params = {"offset", "limit"})
    public List<Role> findAll(@RequestParam(value = "offset", defaultValue = "0") long offset, @RequestParam(value = "limit", defaultValue = "10") int limit) {
        Pageable pageable = OffsetLimitRequest.of(offset, limit);
        return this.roleService.findAllByPageAsList(pageable);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, params = {"offset", "limit"})
    public List<Role> findAllSorted(@RequestParam(value = "offset", defaultValue = "0") long offset, @RequestParam(value = "limit", defaultValue = "10") int limit) {
        Pageable pageable = OffsetLimitRequest.of(offset, limit);
        return this.roleService.findAllByPageAsList(pageable);
    }
}
