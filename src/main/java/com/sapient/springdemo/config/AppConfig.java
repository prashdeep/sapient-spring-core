package com.sapient.springdemo.config;

import com.sapient.springdemo.dao.EmployeeDAOImpl;
import com.sapient.springdemo.service.EmployeeService;
import com.sapient.springdemo.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public EmployeeService getEmployeeService(){
        return new EmployeeServiceImpl(new EmployeeDAOImpl());
    }
}