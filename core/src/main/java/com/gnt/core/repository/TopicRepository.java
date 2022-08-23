package com.gnt.core.repository;

import com.gnt.core.domain.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface TopicRepository extends MongoRepository<Topic, String> {
    public List<Topic> findByName(String name);
}
