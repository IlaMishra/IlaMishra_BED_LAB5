package com.greatLearning.employeeMngmnt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greatLearning.employeeMngmnt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}
