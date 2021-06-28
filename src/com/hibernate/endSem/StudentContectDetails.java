package com.hibernate.endSem;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ContactDetails")
public class StudentContectDetails {
	@Id
	private int rollNo;
	private String name;
	private String email;
	private String mobileNo;
	private String State;
	private String Country;
	private String localAddress;
	
	public StudentContectDetails(int rollNo, String name, String email, String mobileNo, String state, String country,
			String localAddress) {
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		State = state;
		Country = country;
		this.localAddress = localAddress;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getLocalAddress() {
		return localAddress;
	}
	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}
}
