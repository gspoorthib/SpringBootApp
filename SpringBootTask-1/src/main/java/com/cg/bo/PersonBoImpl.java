package com.cg.bo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dto.PersonDto;
import com.cg.eo.PersonEo;
import com.cg.vo.Person;
@Service
public class PersonBoImpl implements PersonBo {
	@Autowired
	private PersonEo personEo;
	
	Logger logger = LoggerFactory.getLogger(PersonBoImpl.class);

	@Override
	public PersonDto insertPerson(PersonDto persondto) {
		// TODO Auto-generated method stub
		logger.info("Person details saved in Bo layer");
		return personEo.insertPerson(persondto);
	}

	@Override
	public List<PersonDto> getPersons() {
		// TODO Auto-generated method stub
		logger.info("Fetch details of person in BO layer");
		return personEo.getPersons();
	}
	
	@Override
	public PersonDto getPersonByAge(int age) {
		// TODO Auto-generated method stub
		logger.info("Fetch the details of person by age in BO layer");
		return personEo.getPersonByAge(age);
	}

	@Override
	public PersonDto getPersonByName(String name) {
		// TODO Auto-generated method stub
		return personEo.getPersonByName(name);
	}

	
	

}

