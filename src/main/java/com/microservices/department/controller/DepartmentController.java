package com.microservices.department.controller;

import com.microservices.department.entity.Department;
import com.microservices.department.model.DepartmentModel;

public interface DepartmentController {
	String getName();
	Department saveDepartment(DepartmentModel dept);
	DepartmentModel getDepartmentDetails(Long deptId);
}
