package com.cg.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Same as entity/bean class
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	@NotBlank(message="Name should not be blank")
	private String name;
	//@NotBlank
	//@NotEmpty
	//@Size(min=2, max=50, message="Age should be less than or equal to 50")
	private int age;
	//@NotEmpty(message="City name should not be empty")
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
	/*public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}*/
	
}
