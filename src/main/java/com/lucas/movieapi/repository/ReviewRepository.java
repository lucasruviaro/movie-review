package com.lucas.movieapi.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucas.movieapi.model.Review;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
    
}
