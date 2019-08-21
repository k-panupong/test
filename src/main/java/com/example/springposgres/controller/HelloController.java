package com.example.springposgres.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.springposgres.model.Microservice;
import com.example.springposgres.repository.MicroserviceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
@RestController
public class HelloController {
	@Autowired
	MicroserviceRepository repository;
	
	@GetMapping("/hi")
	public List<String> findAll(){
		List<Microservice> microservices = repository.findAll();
		List<String> data = new ArrayList<String>();
		for(Microservice microservice: microservices ){
			data.add(microservice.getServiceName());
		}
		return data;
	}
}