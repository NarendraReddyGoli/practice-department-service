package com.microservices.department.serviceImpl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.department.entity.Department;
import com.microservices.department.model.DepartmentModel;
import com.microservices.department.repository.DepartmentRepository;
import com.microservices.department.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentRepository deptRepo;

	@Override
	public Department saveDepartment(DepartmentModel dept) {

		Department deptEntity = new Department();
		BeanUtils.copyProperties(dept, deptEntity);
		System.out.println(deptEntity);
		return deptRepo.save(deptEntity);
	}

	@Override
	public DepartmentModel getDepartmentDetails(Long deptId) {
		DepartmentModel dept = null;
		Optional<Department> opt = deptRepo.findById(deptId);
		if (!opt.isEmpty()) {
			dept = new DepartmentModel();
			System.out.println(dept);
			BeanUtils.copyProperties(opt.get(), dept);
		}
		return dept;
	}

}
