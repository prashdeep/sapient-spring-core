package com.sapient.springdemo.client;

import com.sapient.springdemo.model.Employee;
import com.sapient.springdemo.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeCRUDClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
        Employee pavan = new Employee(23, "Pavan");

        employeeService.saveEmployee(pavan);

    }
}