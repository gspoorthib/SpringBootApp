package com.cg.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cg.dto.PersonDto;
import com.cg.vo.Person;

@Mapper(componentModel="spring")
public interface PersonMapper {
	PersonMapper MAPPER =Mappers.getMapper(PersonMapper.class);
	
 public PersonDto convertToDto(Person person);

public  Person convertToVo(PersonDto persondto);
public List<Person> convertToVoList(List<PersonDto> personList);
}
