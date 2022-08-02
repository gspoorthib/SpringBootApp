package com.cg.eo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.PersonDao;
import com.cg.dto.PersonDto;
import com.cg.vo.Person;
@Service
public class PersonEoImpl implements PersonEo {
	@Autowired
	private PersonDao personDao;
	
	Logger logger = LoggerFactory.getLogger(PersonEoImpl.class);
	
	@Override
	public PersonDto insertPerson(PersonDto persondto) {
		// TODO Auto-generated method stub
		return personDao.insertPerson(persondto);
	}

	@Override
	public List<PersonDto> getPersons() {
		// TODO Auto-generated method stub
		logger.info("Fetch the details of person in eo layer");
		return personDao.getPersons();
	}
	
	@Override
	public PersonDto getPersonById(int id) {
		// TODO Auto-generated method stub
		logger.info("Fetch the details of person by id in eo layer");
		return personDao.getPersonById(id);
	}
	
	@Override
	public PersonDto getPersonByAge(int age) {
		// TODO Auto-generated method stub
		logger.info("Fetch the details of person by age in eo layer");
		return personDao.getPersonByAge(age);
	}

	@Override
	public PersonDto getPersonByName(String name) {
		// TODO Auto-generated method stub
		return personDao.getPersonByName(name);
	}

	
	

}
