package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.feignclient.FeignClient;
import com.cg.restHelper.RestHelper;
import com.cg.vo.Person;
@Service
public class RestHelperServiceImpl implements RestHelperService {
	@Autowired
	RestHelper restHelper;
	
	@Autowired
	FeignClient feignClient;
	
	@Override
	public String getPersonsDetails() {
		// TODO Auto-generated method stub
		return restHelper.getPersonDetails();
	}

	@Override
	public String getAllPersons() {
		// TODO Auto-generated method stub
		return feignClient.getAllPersons();
	}
	
	

}
