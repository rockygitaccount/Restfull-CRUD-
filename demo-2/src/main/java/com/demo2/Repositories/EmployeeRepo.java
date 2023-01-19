package com.demo2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo2.Entity.Employee;

@Repository
@Transactional
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
