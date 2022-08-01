package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.service.RestHelperService;

@RestController
public class RestHelperController {
	@Autowired
	RestHelperService service;
	
	
	
	@GetMapping(path="/template/get")
	public String getPersonsDetails(){
		return service.getPersonsDetails();
	}
	
	
	@GetMapping(path="/feigngetpersons")
	public String getAllPersons() {
		return service.getAllPersons();
		
	}
	

}
