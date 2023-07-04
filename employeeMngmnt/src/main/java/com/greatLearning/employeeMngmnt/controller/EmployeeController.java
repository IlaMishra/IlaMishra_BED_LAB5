package com.greatLearning.employeeMngmnt.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.greatLearning.employeeMngmnt.entity.Employee;

import com.greatLearning.employeeMngmnt.service.EmployeeService;

@Controller

@RequestMapping("/employees")

public class EmployeeController {

@Autowired

EmployeeService service;

/*

* /employees/--GET

* /employees/new--GET

* /employees/edit/{id}--GET

* /employees/delete/{id}--GET

* /employees/save--POST

* /employees/save/{id}--POST

*/

@GetMapping("/")

public String getAllEmployees(Model model) {

model.addAttribute("employees",service.getAllEmployees());

return "employees";

}

@GetMapping("/new")

public String addEmployee(Model model) {

model.addAttribute("employee",new Employee());

return "create_emp";

}

@GetMapping("/edit/{id}")

public String editEmployee(@PathVariable(name="id") Integer id,Model model ) {

model.addAttribute("employee",service.findEmpById(id));

return "edit_emp";

}

@GetMapping("/delete/{id}")

public String deleteEmployee(@PathVariable(name="id") Integer id ) {

service.deleteEmpById(id);

return "redirect:/employees/";

}

@PostMapping("/save")

public String createEmployee(@ModelAttribute(name="employee") Employee emp ) {

service.saveEmployee(emp);

return "redirect:/employees/";

}

@PostMapping("/save/{id}")

public String createEmployee(@PathVariable(name="id") Integer id ,@ModelAttribute(name="employee") Employee emp ) {

emp.setEmpId(id);

service.saveEmployee(emp);

return "redirect:/employees/";

}

}