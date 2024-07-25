package com.first.emp_manager.service;

import java.util.List;

import com.first.emp_manager.entity.EmployeeEntity;
import com.first.emp_manager.model.Employee;

public interface EmployeeService {

    public String createEmployee(Employee emp);
    public List<EmployeeEntity> readEmployee();
    public boolean deleteEmployee(Long id);

}
