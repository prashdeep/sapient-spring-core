package com.sapient.springdemo.service;

import com.sapient.springdemo.dao.EmployeeDAO;
import com.sapient.springdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
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