package com.yunuspektas.springboot.cruddemo.service;

import com.yunuspektas.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmplpyee);

    void deleteById(int theId);
}
