package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Application;

public interface ApplicationRepository extends MongoRepository<Application, String> {
	 
}
