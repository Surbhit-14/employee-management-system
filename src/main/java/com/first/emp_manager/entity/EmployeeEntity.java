package com.first.emp_manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "emp_db")
public class EmployeeEntity {

    @Id
    @GeneratedValue
    private Long id;


    private String name;
    private String email;
    private int phone;
}
