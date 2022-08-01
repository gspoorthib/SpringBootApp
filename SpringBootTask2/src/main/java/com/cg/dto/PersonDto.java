package com.cg.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class PersonDto {
	@NotBlank(message="Name should not be blank")
	private String name;
//	@NotEmpty
	//@Size(min=2,max=50,message="age should be lessthan or equal to 50")
	private int age;
	@NotEmpty
	private String city;
	
	
}

