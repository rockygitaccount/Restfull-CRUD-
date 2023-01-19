package com.demo2.Service;

import java.util.List;

import com.demo2.Entity.Employee;

public interface EmployeeService {
	public List<Employee>getEmployee();

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(long parseLong);

}
