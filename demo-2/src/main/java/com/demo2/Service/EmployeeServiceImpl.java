package com.demo2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo2.Entity.Employee;
import com.demo2.Repositories.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public List<Employee> getEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeRepo.save(employee);
		return employee;
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
        employeeRepo.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(long parseLong) {
     Employee entity =employeeRepo.getOne(parseLong);
     employeeRepo.delete(entity);
	}

}
