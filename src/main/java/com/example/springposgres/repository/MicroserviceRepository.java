package com.example.springposgres.repository;

import java.util.List;

import com.example.springposgres.model.Microservice;

import org.springframework.data.repository.CrudRepository;

public interface MicroserviceRepository extends CrudRepository<Microservice, Long>{
	List<Microservice> findAll();
}