package com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import javax.xml.validation.*;
import com.work.model.employee;
import com.work.repository.employeeRepository;
@RestController
@RequestMapping("/api")
public class webController {
	@Autowired
	private employeeRepository employeerepository;
	
	@CrossOrigin
	@RequestMapping(value="/create", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody employee create(@RequestBody employee e){
		employee employee=employeerepository.save(e);
		return employee;
	}
	@CrossOrigin
	@RequestMapping("/select")
	public Page<employee> show(Pageable p) {
		return employeerepository.findAll(p);
	}
}
