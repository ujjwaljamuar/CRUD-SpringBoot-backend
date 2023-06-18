package com.crudapplication.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity      // creates a table in database using class name
public class User {

	@Id            // making a primary key
	@GeneratedValue(strategy = GenerationType.AUTO)  // auto generating unique id
	private long id;
	private String name;
	private String username;
	private String email;
	private String mobile;

	// default constructor
	public User() {
	}

	// parameterized constructor
	public User(long id, String name, String username, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.mobile = mobile;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", mobile="
				+ mobile + "]";
	}

}
