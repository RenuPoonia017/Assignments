package com.day1assignmentques.ques5;
public class PersonalLoan {
	private double loanPerc;
	private double loanAmount;
	private int loanDuration;
	private Person person;
	
	public PersonalLoan(double loanPerc, double loanAmount, int loanDuration,String name,String city,long phone,String dob) {
		this.loanPerc=loanPerc;
		this.loanAmount=loanAmount;
		this.loanDuration=loanDuration;
		this.person=new Person(name,city,phone,dob);
	}
	
	public double getLoanPerc() {
		return loanPerc;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanPerc(float loanPerc) {
		this.loanPerc = loanPerc;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	
	public Person getPersonDetails() {
		return this.person;
	}
	
}

