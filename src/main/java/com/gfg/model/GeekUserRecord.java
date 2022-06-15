package com.gfg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GeekUserRecord {
	@Id
	private int id;
	private String name;
	private String email;
	private String gender;
	private int numberOfPosts;

public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getNumberOfPosts() {
		return numberOfPosts;
	}

	public void setNumberOfPosts(int numberOfPosts) {
		this.numberOfPosts = numberOfPosts;
	}

	//default constructor
	public GeekUserRecord() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
