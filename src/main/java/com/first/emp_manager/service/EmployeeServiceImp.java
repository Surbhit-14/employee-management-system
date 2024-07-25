package com.first.emp_manager.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.emp_manager.entity.EmployeeEntity;
import com.first.emp_manager.model.Employee;
import com.first.emp_manager.repository.EmpRepo;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    EmpRepo empRepository;
    
    @Override
    public String createEmployee(Employee emp) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(emp,  employeeEntity);
        empRepository.save(employeeEntity);
        return "Added Succesfully";
    }

    @Override
    public List<EmployeeEntity> readEmployee() {
        return empRepository.findAll();
    }

    @Override
    public boolean deleteEmployee(Long id) {
        empRepository.deleteById(id);
        return true;

    }
}
