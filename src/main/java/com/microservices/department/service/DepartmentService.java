package com.microservices.department.service;

import com.microservices.department.entity.Department;
import com.microservices.department.model.DepartmentModel;

public interface DepartmentService {
	
	Department saveDepartment(DepartmentModel dept);
	DepartmentModel getDepartmentDetails(Long deptId);

}
