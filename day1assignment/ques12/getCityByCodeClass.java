package com.day1assignmentques.ques12;
import java.util.Scanner;

public class getCityByCodeClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		getCityByCodeClass gc=new getCityByCodeClass();
		gc.getCityByCode(i);
		
		

	}
	public void getCityByCode(int i){
		switch(i) {
		   case 1:
			   System.out.println("Number value :"+i+" return “DELHI”");
			   break;
		   case 2:
			   System.out.println("Number value :"+i+" return “NOIDA”");
			   break;
		   case 3:
			   System.out.println("Number value :"+i+" return “GUARGAON”");
			   break;
		   case 4:
			   System.out.println("Number value :"+i+" return “BANGLORE”");
			   break;
		   default:
			   System.out.println("Any other number return “INVALIDCODE”");
			   break;
		
	}

}
}

