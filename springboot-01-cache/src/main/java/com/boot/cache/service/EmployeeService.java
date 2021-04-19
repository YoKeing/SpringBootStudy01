package com.boot.cache.service;

import com.boot.cache.bean.Employee;
import com.boot.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Cacheable(cacheNames = {"emp"}, keyGenerator = "mykeyGenerator")
    public Employee getEmp(Integer id){
        System.out.println("查询员工");
        return employeeMapper.getEmpById(id);
    }

    @CachePut(value = "emp", key = "#employee.id")
    public Employee updateEmp(Employee employee){
        employeeMapper.updateEmp(employee);
        return employee;
    }

}
