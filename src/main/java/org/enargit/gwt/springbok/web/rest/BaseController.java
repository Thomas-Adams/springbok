package org.enargit.gwt.springbok.web.rest;



import org.enargit.gwt.springbok.data.entities.BaseEntity;
import org.enargit.gwt.springbok.services.impl.BaseServiceImpl;

import java.io.Serializable;

public abstract class BaseController<S extends BaseServiceImpl, E extends BaseEntity, ID extends Serializable> {

    public abstract void setService(S service);

    public abstract S getService();


}
