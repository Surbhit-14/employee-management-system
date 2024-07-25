package com.first.emp_manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.first.emp_manager.entity.EmployeeEntity;
import com.first.emp_manager.model.Employee;
import com.first.emp_manager.service.EmployeeService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmpController {

    //Inverion of control create task for IOC container to create object
    @Autowired
    EmployeeService employeeservice;
    
    //private EmployeeService employeeservice = new EmployeeServiceImp();

    @GetMapping("/employees")
    public List<EmployeeEntity> getAllEmployee(){
        return employeeservice.readEmployee();
    }

    @PostMapping("/employees")
    public String createEmployee(@RequestBody Employee emp) {
        return employeeservice.createEmployee(emp);
    }

    @DeleteMapping("/employees/{id}")
    public boolean deleteEmployee(@PathVariable Long id){
        return employeeservice.deleteEmployee(id);
    }
    
}
