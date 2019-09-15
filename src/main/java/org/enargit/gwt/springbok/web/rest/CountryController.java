package org.enargit.gwt.springbok.web.rest;

import org.enargit.gwt.springbok.data.entities.Country;
import org.enargit.gwt.springbok.domain.OffsetLimitRequest;
import org.enargit.gwt.springbok.services.impl.CountryServiceImpl;
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
@RequestMapping("/api/countries")
public class CountryController extends BaseController<CountryServiceImpl, Country, Long> {


    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    private CountryServiceImpl countryService;


    @Override
    @Autowired
    public void setService(CountryServiceImpl service) {
        this.countryService = service;
    }

    @Override
    public CountryServiceImpl getService() {
        return countryService;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Country> findAll() {
        return this.countryService.findAll();
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Country save(@RequestBody Country country, HttpServletRequest request) {
        LOGGER.info(country.toString());
        return this.countryService.save(country);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, params = {"page", "size"})
    public List<Country> findAllByPage(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return this.countryService.findAllByPageAsList(pageable);
    }


    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, params = {"offset", "limit"})
    public List<Country> findAll(@RequestParam(value = "offset", defaultValue = "0") long offset, @RequestParam(value = "limit", defaultValue = "10") int limit) {
        Pageable pageable = OffsetLimitRequest.of(offset, limit);
        return this.countryService.findAllByPageAsList(pageable);
    }


}
