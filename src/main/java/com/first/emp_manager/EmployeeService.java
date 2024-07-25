package com.first.emp_manager;

import java.util.List;

public interface EmployeeService {

    public String createEmployee(Employee emp);
    public List<EmployeeEntity> readEmployee();
    public boolean deleteEmployee(Long id);

}
