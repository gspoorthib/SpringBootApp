package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.PersonDto;
import com.cg.service.PersonService;
import com.cg.vo.Person;

@RestController
@Validated
public class PersonController {
	Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@Autowired
	private PersonService service;
	
	@PostMapping(path="/addperson")
	public Person addPerson(@Valid @RequestBody Person person) {
		logger.info("Person details saved in controller");
		return service.insertPerson(person);
	}
	
	@GetMapping(path="/getpersons")
	public List<Person> getAllPersons(){
		logger.info("Retrieving the details of person from controller");
		return service.getPersons();
	}
	
	@GetMapping(path="/getpersons/{age}")
	public Person getPersonByAge(@PathVariable int age) {
		logger.info("Fetch the details of person by age from controller");
		return service.getPersonByAge(age);
		
	}
	
	@GetMapping(path="/getperson/{name}")
	public Person getPersonByName(@PathVariable String name) {
		logger.info("Fetch the details of person by name from controller");
		return service.getPersonByName(name);
	}
	
}
