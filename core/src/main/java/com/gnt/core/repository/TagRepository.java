package com.gnt.core.repository;

import com.gnt.core.domain.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TagRepository extends MongoRepository<Tag, String> {
}
