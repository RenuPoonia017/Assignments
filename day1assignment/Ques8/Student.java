package com.day1AssignmentQues.Ques8;
public class Student { 
	String name;
	int rollno;
	int batchNo;
	String friendName;
	public Student() {
		
	}
	public Student(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	public Student(String name,int rollno,int batchNo) {
		this.name=name;
		this.rollno=rollno;
		this.batchNo=batchNo;
	}
	public Student(String name,int rollno,int batchNo,String friendName) {
		this.name=name;
		this.rollno=rollno;
		this.batchNo=batchNo;
		this.friendName=friendName;
		
	}
    
}
