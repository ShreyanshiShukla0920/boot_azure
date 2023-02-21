package com.azurespring.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Employee;

@RestController
public class HomeController {
	List<Employee> lst =new ArrayList<>();
	//lst.add(new Employee(1,"abc","IT",500000));
	@GetMapping("/workers")
	public List<Employee> greeting() {
		lst.add(new Employee(1,"abc","IT",500000));
		lst.add(new Employee(2,"ranju","QA",800000));
		lst.add(new Employee(3,"rani","Business",600000));
		lst.add(new Employee(4,"raja","Software",1000000));
   
    
  
		return lst;
	}

}
