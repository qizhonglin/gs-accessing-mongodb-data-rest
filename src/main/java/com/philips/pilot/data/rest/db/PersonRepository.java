package com.philips.pilot.data.rest.db;

import com.philips.pilot.data.rest.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by 310031267 on 2016/4/13.
 */
public interface PersonRepository extends MongoRepository<Person, String>{
    List<Person> findByLastName(@Param("name") String name) ;
}
