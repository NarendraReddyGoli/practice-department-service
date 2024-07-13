package com.microservices.department.model;

import lombok.Data;

@Data
public class DepartmentModel {
	private Long deptId;
	private String deptName;
	private String location;
}
