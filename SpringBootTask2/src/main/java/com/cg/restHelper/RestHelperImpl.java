package com.cg.restHelper;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class RestHelperImpl implements RestHelper {
	@Autowired
	private RestTemplate restTemplate ;

	@Override
	public String getPersonDetails() {
		 HttpHeaders headers = new HttpHeaders();
		   headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		   HttpEntity <String> entity = new HttpEntity<String>(headers);
		   return restTemplate.exchange("http://localhost:8086/getpersons", HttpMethod.GET, entity, String.class).getBody();
	}
}


