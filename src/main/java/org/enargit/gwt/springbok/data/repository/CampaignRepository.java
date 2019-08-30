package org.enargit.gwt.springbok.data.repository;


import org.enargit.gwt.springbok.data.entities.Campaign;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends BaseRepository<Campaign, Long> {
}
