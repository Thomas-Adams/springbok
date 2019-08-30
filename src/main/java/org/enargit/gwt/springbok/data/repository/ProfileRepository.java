package org.enargit.gwt.springbok.data.repository;


import org.enargit.gwt.springbok.data.entities.Profile;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends BaseRepository<Profile, Long> {
}
