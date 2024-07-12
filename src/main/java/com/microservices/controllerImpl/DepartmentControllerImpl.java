package com.microservices.controllerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.client.EmployeeClient;
import com.microservices.controller.DepartmentController;
@RestController
@RequestMapping("/department")
public class DepartmentControllerImpl implements DepartmentController {
	@Autowired
	EmployeeClient empClient;
	@Override
	@GetMapping("/getName")
	public String getName() {
		System.out.println("Enters into the department getName() :: ");
		return "Enters into the getName Method name :: "+empClient.getValue();
	}

}
