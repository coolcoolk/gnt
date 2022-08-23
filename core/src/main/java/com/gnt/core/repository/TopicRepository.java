package com.gnt.core.repository;

import com.gnt.core.domain.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface TopicRepository extends MongoRepository<Topic, String> {
}
