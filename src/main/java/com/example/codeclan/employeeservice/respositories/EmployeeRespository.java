package com.example.codeclan.employeeservice.respositories;

import com.example.codeclan.employeeservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface EmployeeRespository extends JpaRepository<Employee, Long>{

    }