package com.greatLearning.employeeMngmnt.entity;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

@Table(name="Employee")

@Entity

public class Employee {

@GeneratedValue(strategy =GenerationType.IDENTITY )

@Id

@Column(name="emp_Id")

int empId;

@Column(name="emp_First_Name")

String empFirstName;

@Column(name="emp_Last_Name")

String empLastName;

@Column(name="emp_Email")

String empEmail;

public int getEmpId() {

return empId;

}

public void setEmpId(int empId) {

this.empId = empId;

}

public String getEmpFirstName() {

return empFirstName;

}

public void setEmpFirstName(String empFirstName) {

this.empFirstName = empFirstName;

}

public String getEmpLastName() {

return empLastName;

}

public void setEmpLastName(String empLastName) {

this.empLastName = empLastName;

}

public String getEmpEmail() {

return empEmail;

}

public void setEmpEmail(String empEmail) {

this.empEmail = empEmail;

}

}