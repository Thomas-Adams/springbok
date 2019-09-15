package org.enargit.gwt.springbok.services.impl;

import org.enargit.gwt.springbok.data.entities.Country;
import org.enargit.gwt.springbok.data.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CountryServiceImpl extends BaseServiceImpl<Country, Long, CountryRepository> {


    private CountryRepository repository;

    @Override
    public CountryRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(CountryRepository repository) {
        this.repository = repository;
    }

}
