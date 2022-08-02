package com.cg.service;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bo.PersonBo;
import com.cg.dto.PersonDto;
import com.cg.mapper.PersonMapper;
import com.cg.vo.Person;
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonBo personBo;
	@Autowired
	PersonMapper personMapper;
	
	Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

	@Override
	public Person insertPerson( Person person) {
		// TODO Auto-generated method stub
	PersonDto persondto = personMapper.convertToDto(person);//converting vo to dto
		logger.info("Person details saved in service layer");
		return personMapper.convertToVo(personBo.insertPerson(persondto));//passing dto object to bo layer
		//n converting dto to vo
	}

	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		
		logger.info("Fetch details of person in service layer");
		return personMapper.convertToVoList(personBo.getPersons());
	}
	
	@Override
	public Person getPersonById(int id) {
		logger.info("Fetch details of person by id in service layer");
		return personMapper.convertToVo(personBo.getPersonById(id));
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person getPersonByAge(int age) {
		// TODO Auto-generated method stub
		logger.info("Fetch details of person by age in service layer");
		return personMapper.convertToVo(personBo.getPersonByAge(age));
	}

	@Override
	public Person getPersonByName(String name) {
		// TODO Auto-generated method stub
		return personMapper.convertToVo(personBo.getPersonByName(name));
	}

}
