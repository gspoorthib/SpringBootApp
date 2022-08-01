package com.cg.feignclient;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(url ="http://localhost:8086",name ="FeignClient")
public interface FeignClient {
	
	@GetMapping(path="/getpersons")
	public String getAllPersons();

}
