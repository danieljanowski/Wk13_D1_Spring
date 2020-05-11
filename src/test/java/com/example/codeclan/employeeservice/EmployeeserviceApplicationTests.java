package com.example.codeclan.employeeservice;

import com.example.codeclan.employeeservice.models.Employee;
import com.example.codeclan.employeeservice.respositories.EmployeeRespository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	private EmployeeRespository employeeRespository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveEmployee(){
		Employee employee = new Employee("Donald Duck", 4, 123, "donald@duck.com");
		employeeRespository.save(employee);
		Employee employee2 = new Employee("Micky Mouse", 7, 124, "micky@mouse.com");
		employeeRespository.save(employee2);
		Employee employee3 = new Employee("Mini Mouse", 2, 125, "mini@mouse.com");
		employeeRespository.save(employee3);
	}

}
