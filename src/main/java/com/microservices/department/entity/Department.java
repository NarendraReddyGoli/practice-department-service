package com.microservices.department.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Department {
	@Id
	@Column(name = "DEPT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deptId;
	@Column(name = "DEPT_NAME")
	private String deptName;
	@Column(name = "LOCATION")
	private String location;

}
