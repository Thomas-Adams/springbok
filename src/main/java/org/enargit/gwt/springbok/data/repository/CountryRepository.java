package org.enargit.gwt.springbok.data.repository;

import org.enargit.gwt.springbok.data.entities.Country;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends BaseRepository<Country, Long> {
}
