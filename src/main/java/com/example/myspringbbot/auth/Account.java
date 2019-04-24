package com.example.myspringbbot.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Account {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name="account_name")
	private String account_name;
	@Column(name="password")
	private String password;
	@Column(name="enabled1")
	private Boolean enabled1;
	@Column(name="enabled2")
	private Boolean enabled2;
	@Column(name="enabled3")
	private Boolean enabled3;
	@Column(name="enabled4")
	private Boolean enabled4;
	
	public Account(Integer id, String account_name, String password, Boolean enabled1, Boolean enabled2,
			Boolean enabled3, Boolean enabled4) {
		super();
		this.id = id;
		this.account_name = account_name;
		this.password = password;
		this.enabled1 = enabled1;
		this.enabled2 = enabled2;
		this.enabled3 = enabled3;
		this.enabled4 = enabled4;
	}

	@Override
	public String toString() {
		return String.format(
				"Account [id=%s, account_name=%s, password=%s, enabled1=%s, enabled2=%s, enabled3=%s, enabled4=%s]", id,
				account_name, password, enabled1, enabled2, enabled3, enabled4);
	}
}







