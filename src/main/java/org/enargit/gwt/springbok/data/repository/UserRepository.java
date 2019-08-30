package org.enargit.gwt.springbok.data.repository;

import org.enargit.gwt.springbok.data.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User,Long>{
}
