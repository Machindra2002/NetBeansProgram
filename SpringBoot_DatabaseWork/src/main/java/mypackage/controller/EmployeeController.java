package mypackage.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mypackage.model.Employee;
import mypackage.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empservice;
	
	@GetMapping("api/employee")
	public List<Employee> GetAll() {
		return empservice.GetEmployee();
	}
	
	@GetMapping("api/employee/{id}")
	public Employee GetEmployeeById(@PathVariable("id")int eid) {
		return empservice.GetEmployee(eid);
	}
	
	@PostMapping("api/employee")
	public Employee AddEmployee(@RequestBody Employee e) {
		return empservice.AddEmployee(e);
	}
	@PutMapping("api/employee")
	public Employee UpdateEmployee(@RequestBody Employee e) {
		return empservice.UpdateEmployee(e);
	}
	
	@DeleteMapping("api/employee/{id}")
	public Employee DeleteEmployee(@PathVariable("id")int eid) {
		return empservice.DeleteEmployee(eid);
	}
}







