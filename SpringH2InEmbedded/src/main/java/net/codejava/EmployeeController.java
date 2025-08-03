package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired EmployeeRepository repo;
	
	@GetMapping("/employee")
	public List<Employee> listAll(){
		return repo.findAll();
	}

}
