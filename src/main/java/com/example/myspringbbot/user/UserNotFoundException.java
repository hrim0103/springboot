package com.example.myspringbbot.user;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String msg) {
		super(msg);
	}
}
