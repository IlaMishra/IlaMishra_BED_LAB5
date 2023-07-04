package com.greatLearning.employeeMngmnt.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.greatLearning.employeeMngmnt.dao.EmployeeRepository;

import com.greatLearning.employeeMngmnt.entity.Employee;

@Service

public class EmployeeServiceImpl implements EmployeeService {

@Autowired

EmployeeRepository repository;

@Override

public List<Employee> getAllEmployees() {

return repository.findAll();

}

@Override

public void saveEmployee(Employee emp) {

repository.save(emp);

}

@Override

public int deleteEmpById(int id) {

repository.deleteById(id);

return id;

}

@Override

public Employee findEmpById(int id) {

Optional<Employee> optEmp=repository.findById(id);

if(optEmp.isPresent()) {

return optEmp.get();

}else {

throw new RuntimeException("Employee not Present for id" +id);

}

}

}

