package com.day1assignmentques.ques5;

public class Main {

		public static void main(String[] args) {
			PersonalLoan percLoan=new PersonalLoan(8.6, 500000.00, 36, "Renu Poonia","Bhiwani",  9988665544L,"17-02-1999");
			HomeLoan homeLoan=new HomeLoan(12.4, 4800000.00, 240, "Yashi","Hisar", 9987545543L,"27-03-1999");
			
			System.out.println("Personal Loan details-");
			System.out.println("Percentage: "+percLoan.getLoanPerc()+"%");
			System.out.println("Amount: "+percLoan.getLoanAmount());
			System.out.println("Duration: "+percLoan.getLoanDuration());
			System.out.println("Name: "+percLoan.getPersonDetails().getName());
			System.out.println("Address: "+percLoan.getPersonDetails().getCity());
			System.out.println("Address: "+percLoan.getPersonDetails().getPhoneNo());
			System.out.println("Contact No.- "+percLoan.getPersonDetails().getDob());
			System.out.println("================================");
			System.out.println("Home Loan details-");
			System.out.println("Percentage: "+homeLoan.getLoanPercentage()+"%");
			System.out.println("Amount: "+homeLoan.getLoanAmount());
			System.out.println("Duration: "+homeLoan.getNumberOfMonths());
			System.out.println("Name: "+homeLoan.getPersonDetails().getName());
			System.out.println("Address: "+percLoan.getPersonDetails().getPhoneNo());
			System.out.println("Address: "+homeLoan.getPersonDetails().getPhoneNo());
			System.out.println("Contact No.- "+homeLoan.getPersonDetails().getDob());
		}

}
