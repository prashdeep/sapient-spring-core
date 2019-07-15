package com.sapient.springdemo.service;

import com.sapient.springdemo.dao.EmployeeDAO;
import com.sapient.springdemo.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    public Employee saveEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }

    public List<Employee> fetchAllEmployees() {
        return null;
    }

    public Employee findById(long id) {
        return null;
    }

    public void deleteEmployee(long id) {

    }
}