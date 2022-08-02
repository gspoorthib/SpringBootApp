package com.cg.eo;

import java.util.List;

import com.cg.dto.PersonDto;
import com.cg.vo.Person;

public interface PersonEo {

	public PersonDto insertPerson(PersonDto persondto);

	public List<PersonDto> getPersons();
	
	public PersonDto getPersonById(int id);

	public PersonDto getPersonByAge(int age);

	public PersonDto getPersonByName(String name);

	

}
