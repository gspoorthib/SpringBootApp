package com.cg.vo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	@NotNull
	private String name;
	@NotNull
	@Min(value=10,message="Age should be greater than or equal to 10")
	@Max(value=50,message="Age should be lessthan or equal to 50")
	private int age;
	@NotBlank(message="Should mention city")
	private String city;
	
}
	