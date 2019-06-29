package dev.abel.springbootazurecosmosdb.repository;

import dev.abel.springbootazurecosmosdb.domain.Attendee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AttendeeRepository extends MongoRepository<Attendee, String> {

}
