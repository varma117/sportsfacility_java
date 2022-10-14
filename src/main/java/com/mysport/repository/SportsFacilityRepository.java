package com.mysport.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mysport.model.SportsFacility;
@Repository
public interface SportsFacilityRepository  extends MongoRepository<SportsFacility, String>{

	

}
