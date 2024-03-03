package com.yunuspektas.springboot.cruddemo.dao;

import com.yunuspektas.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmplpyee);

    void deleteById(int theId);
}
