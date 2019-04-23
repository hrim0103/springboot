package com.example.myspringbbot.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description="All details about the user. ")
public class User {
	private Integer id;
	@Size(min=2, message="이름은 2글자 이상 입력해 주세요.")
	@ApiModelProperty(notes="Name should have at least 2 characters")
	private String name;

	@Past
	@ApiModelProperty(notes="Birth date should be in the past")
	private Date birthDate;
	
	public User() {
		super();
	}
	
	public User(Integer id, String name, Date birthDate) {
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
