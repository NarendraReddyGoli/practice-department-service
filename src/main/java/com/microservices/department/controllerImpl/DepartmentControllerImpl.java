package com.microservices.department.controllerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.department.client.EmployeeClient;
import com.microservices.department.controller.DepartmentController;
import com.microservices.department.entity.Department;
import com.microservices.department.model.DepartmentModel;
import com.microservices.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentControllerImpl implements DepartmentController {
	@Autowired
	EmployeeClient empClient;
	@Autowired
	DepartmentService deptService;

	@Override
	@GetMapping("/getName")
	public String getName() {
		System.out.println("Enters into the department getName() :: ");
		return "Enters into the getName Method name :: " + empClient.getValue();
	}

	@Override
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody DepartmentModel dept) {

		return deptService.saveDepartment(dept);
	}

	@Override
	@GetMapping("/getDepartment/{deptId}")
	public DepartmentModel getDepartmentDetails(@PathVariable Long deptId) {
		System.out.println("enters into the getdepartmentdetails :: "+deptId);
		return deptService.getDepartmentDetails(deptId);
	}

}
