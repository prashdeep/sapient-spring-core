package com.sapient.springdemo.dao;

import com.sapient.springdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository(value = "mysqlDAOImpl")
public class MySQLEmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public MySQLEmployeeDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Employee save(Employee employee) {
        System.out.println("Came inside the save method of MySQLEmployeeDAOImpl");
        jdbcTemplate.execute("insert into employee(name) values ('"+employee.getName()+"')");
        return employee;
    }

    public List<Employee> listAll() {
        return null;
    }

    public Employee findById(long id) {
        return null;
    }

    public void deleteEmployee(long id) {

    }
}