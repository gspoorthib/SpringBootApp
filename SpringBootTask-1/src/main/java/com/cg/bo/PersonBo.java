package com.cg.bo;

import java.util.List;

import com.cg.dto.PersonDto;
import com.cg.vo.Person;


public interface PersonBo {

	public PersonDto insertPerson(PersonDto persondto);

	public List<PersonDto> getPersons();
	
	public PersonDto getPersonByAge(int age);

	public PersonDto getPersonByName(String name);

	

	

}
