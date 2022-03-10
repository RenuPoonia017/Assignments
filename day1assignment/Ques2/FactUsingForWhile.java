package com.day1AssignmentQues.Ques2;

import java.util.Scanner;

public class FactUsingForWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int f=1;
		int i=1;
		while(i<=num) {
			f*=i;
			i++;
		}
		System.out.println("Output using while loop--"+f);
		f=1;
		for(int j=1;j<=num;j++) {
			f*=j;
		}
		System.out.println("Output using for loop--"+f);
		

	}

}
