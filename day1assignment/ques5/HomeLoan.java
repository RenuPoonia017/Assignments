package com.day1assignmentques.ques5;
public class HomeLoan {
	private double loanPercentage;
	private double loanAmount;
	private int numberOfMonths;
	private Person personDetails;
	public HomeLoan(double loanPercentage,double loanAmount,int numberOfMonths,String name,String city,long phoneNo,String dob) {
	     this.loanPercentage=loanPercentage;
	     this.loanAmount=loanAmount;
	     this.numberOfMonths=numberOfMonths;
	     this.personDetails=new Person(name,city,phoneNo,dob);
	}
	public double getLoanPercentage() {
		return loanPercentage;
	}
	public void setLoanPercentage(double loanPercentage) {
		this.loanPercentage = loanPercentage;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getNumberOfMonths() {
		return numberOfMonths;
	}
	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}
	public Person getPersonDetails() {
		return this.personDetails;
	}
}

