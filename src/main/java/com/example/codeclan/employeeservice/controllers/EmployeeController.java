package com.example.codeclan.employeeservice.controllers;

import com.example.codeclan.employeeservice.models.Employee;
import com.example.codeclan.employeeservice.respositories.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRespository employeeRespository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){
        return employeeRespository.findAll();
    }

}
