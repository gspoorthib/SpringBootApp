package com.cg.service;



import java.util.List;

import com.cg.dto.PersonDto;
import com.cg.vo.Person;

public interface PersonService {

	public Person insertPerson( Person person);

	public List<Person> getPersons();
	
	public Person getPersonByAge(int age);

	public Person getPersonByName(String name);

	

	


	

}
