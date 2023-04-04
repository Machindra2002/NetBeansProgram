package mypackage.service;
import mypackage.model.*;
import mypackage.repository.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository emprepo;
	
	public List<Employee> GetEmployee(){
		return emprepo.findAll();
	}
	
	public Employee GetEmployee(int eid) {
		Employee e = emprepo.findById(eid).get();
		return e;
	}
	
	public Employee AddEmployee(Employee e) {
		Employee emp = emprepo.save(e);
		return emp;
	}
	
	public Employee UpdateEmployee(Employee e) {
		Employee emp = emprepo.save(e);
		return emp;
	}
	
	public Employee DeleteEmployee(int eid) {
		Employee e = GetEmployee(eid);
		emprepo.delete(e);
		return e;
	}
}

