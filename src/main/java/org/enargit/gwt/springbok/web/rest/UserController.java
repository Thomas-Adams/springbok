package org.enargit.gwt.springbok.web.rest;


import org.enargit.gwt.springbok.data.entities.User;
import org.enargit.gwt.springbok.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends BaseController<UserServiceImpl, User, Long> {

    private UserServiceImpl service;

    @Autowired
    @Override
    public void setService(UserServiceImpl service) {
        this.service = service;
    }

    @Override
    public UserServiceImpl getService() {
        return service;
    }



}
