package com.example.springposgres.repository;

import com.example.springposgres.model.Microservice;
import org.springframework.data.repository.CrudRepository;

public interface MicroserviceRepository extends CrudRepository<Microservice, Integer>{

    public Microservice findById(int id);

}