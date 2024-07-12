package com.microservices.client;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange 
public interface EmployeeClient {
	@GetExchange("/employee/getEmployeeName")
	public String getValue();

}
