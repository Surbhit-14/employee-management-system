package com.first.emp_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first.emp_manager.entity.EmployeeEntity;


@Repository
public interface EmpRepo extends JpaRepository<EmployeeEntity, Long>{
}
