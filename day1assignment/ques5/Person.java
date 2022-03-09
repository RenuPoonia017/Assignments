package com.day1assignmentques.ques5;

public class Person {
	private String name;
	private long phoneNo;
	private String dob;
	private String city;
	public Person(String name,String city,long phoneNo,String dob) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.dob=dob;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPersonDetails() {
		return this.name+" "+this.phoneNo+" "+this.dob;
	}
	   

}
