package com.cg.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;



//import org.hibernate.validator.constraints.Range;


import lombok.Data;


@Data
public class PersonDto {
	@NotBlank(message="Name should not be blank")
	private String name;
	//@NotEmpty
	//@Size(min=2,max=50,message="age should be lessthan or equal to 50")
	private int age;
	@NotEmpty
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	/*public PersonDto( @NotBlank(message = "Name should not be blank") String name, int age,
			@NotEmpty String city) {
		super();
		
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public PersonDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PersonDto [name=" + name + ", age=" + age + ", city=" + city + "]";
	}*/
	
	
	
	
}
