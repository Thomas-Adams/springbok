package org.enargit.gwt.springbok.data.repository;

import org.enargit.gwt.springbok.data.entities.Subscription;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends BaseRepository<Subscription, Long> {
}
