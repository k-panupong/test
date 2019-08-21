package com.example.springposgres.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "microservice")
public class Microservice implements Serializable {
 
	private static final long serialVersionUID = -2343243243242432341L;
	@Id
	@Column(name = "service_id")
	private int id;
 
	@Column(name = "service_name")
	private String serviceName;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
 
}