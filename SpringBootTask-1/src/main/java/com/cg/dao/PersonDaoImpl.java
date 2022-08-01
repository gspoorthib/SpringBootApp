package com.cg.dao;


import java.sql.ResultSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cg.dto.PersonDto;
@Repository
public class PersonDaoImpl implements PersonDao {
	
	Logger logger = LoggerFactory.getLogger(PersonDaoImpl.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<PersonDto> rowMapper =(ResultSet rs, int rowNumber)->{
		PersonDto persondto = new PersonDto();
		persondto.setName(rs.getString("name"));
		persondto.setAge(rs.getInt("age"));
		persondto.setCity(rs.getString("city"));
		return persondto;
};
	
	//@Autowired
	//private PersonMapper personMapper;
	
	//private static final String INSERT_PERSON_QUERY="Insert into Person(NAME,AGE,CITY) values(?,?,?)";
	//private static final String GET_PERSON_QUERY="Select * from Person";
	//private static final String GET_PERSON_BY_AGE_QUERY="Select * from Person where AGE=?";
	//private static final String GET_PERSON_BY_NAME_QUERY="Select * from Person where Name=?";

	@Override
	public PersonDto insertPerson(PersonDto persondto) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("Insert into Person(NAME,AGE,CITY) values(?,?,?)",persondto.getName(),persondto.getAge(),persondto.getCity());	
		return  persondto;
		
	}
	@Override
	public List<PersonDto> getPersons() {
		return jdbcTemplate.query("Select * from Person", rowMapper);
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public PersonDto getPersonByAge(int age) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("Select * from Person where AGE=?",rowMapper/*new BeanPropertyRowMapper<PersonDto>(PersonDto.class)*/,age);
	}
	@Override
	public PersonDto getPersonByName(String name) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("Select * from Person where Name=?",/*new BeanPropertyRowMapper<PersonDto>(PersonDto.class)*/rowMapper,name);
	}
	
	
	
}
