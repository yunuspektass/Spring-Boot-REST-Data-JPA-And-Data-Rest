package com.yunuspektas.springboot.cruddemo.service;

import com.yunuspektas.springboot.cruddemo.dao.EmployeeDAO;
import com.yunuspektas.springboot.cruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public  EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmplpyee) {
        return employeeDAO.save(theEmplpyee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
    employeeDAO.deleteById(theId);
    }
}
