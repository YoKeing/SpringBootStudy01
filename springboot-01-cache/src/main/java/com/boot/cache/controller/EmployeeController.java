package com.boot.cache.controller;

import com.boot.cache.bean.Employee;
import com.boot.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id){
        return employeeService.getEmp(id);
    }

    @GetMapping("/emp")
    public Employee update(Employee employee){
        Employee employee1 = employeeService.updateEmp(employee);
        return employee1;
    }

}
