package com.tam.repositories;

import com.tam.model.ThreatModelResource;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ThreatModelRepository extends MongoRepository<ThreatModelResource, String> {
}
