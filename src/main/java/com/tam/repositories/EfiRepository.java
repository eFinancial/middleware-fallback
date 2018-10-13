package com.tam.repositories;

import com.tam.model.InvoiceDataResource;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EfiRepository extends MongoRepository<InvoiceDataResource, String> {
}
