package com.teng.bean;

public class User {
	//name,password,sex,hobby,email,other,userclass,date
	private String name;
	private String password;
	private String sex;
	private String hobby;
	private String email;
	private String other;//自我介绍
	private String userclass;
	private String date;
	
	public User() {
		super();
	}

	public User(String name, String password, String sex, String hobby, String email, String other, String userclass,
			String date) {
		super();
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.hobby = hobby;
		this.email = email;
		this.other = other;
		this.userclass = userclass;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getUserclass() {
		return userclass;
	}

	public void setUserclass(String userclass) {
		this.userclass = userclass;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", sex=" + sex + ", hobby=" + hobby + ", email="
				+ email + ", other=" + other + ", userclass=" + userclass + ", date=" + date + "]";
	}

}
