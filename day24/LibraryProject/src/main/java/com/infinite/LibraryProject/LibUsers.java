package com.infinite.LibraryProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LibUsers")
public class LibUsers {
	@Id
	@Column(name="userName")
	private String userName;
	
	@Column(name="passWord")
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public LibUsers(String userName, String passWord) {
		
		this.userName = userName;
		this.passWord = passWord;
	}

	public LibUsers() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LibUsers [userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	

}
