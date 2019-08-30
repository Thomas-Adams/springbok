package org.enargit.gwt.springbok.services.impl;


import org.enargit.gwt.springbok.data.entities.SelectionList;
import org.enargit.gwt.springbok.data.repository.SelectionListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SelectionListServiceImpl extends BaseServiceImpl<SelectionList, Long, SelectionListRepository> {


    private SelectionListRepository repository;

    @Override
    public SelectionListRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(SelectionListRepository repository) {
        this.repository = repository;
    }
}
