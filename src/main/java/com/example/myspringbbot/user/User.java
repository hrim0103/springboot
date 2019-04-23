package com.example.myspringbbot.user;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	private int id;
	private String name;
	private Date birthDate;
	
	public User(int id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s]", id, name);
	}
	
	
}