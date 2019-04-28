package com.itlike.domain;

import java.util.Arrays;
import java.util.List;

public class User {

	private String user_name;
	private Integer user_age;
	private String hobby[];
	private Pet pet;
	private List<Pet> pets;
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Integer getUser_age() {
		return user_age;
	}
	public void setUser_age(Integer user_age) {
		this.user_age = user_age;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", user_age=" + user_age + ", hobby=" + Arrays.toString(hobby)
				+ ", pet=" + pet + ", pets=" + pets + "]";
	}
	
	
	

}
