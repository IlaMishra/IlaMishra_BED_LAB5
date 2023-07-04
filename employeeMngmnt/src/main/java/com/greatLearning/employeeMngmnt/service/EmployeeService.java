package com.greatLearning.employeeMngmnt.service;

import java.util.List;

import com.greatLearning.employeeMngmnt.entity.Employee;
public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public void saveEmployee(Employee emp); 
	public int deleteEmpById(int id);
	public Employee findEmpById(int id);
}
