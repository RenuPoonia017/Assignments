package com.day1assignmentques.ques1011;

public class ComputerMain {

	public static void main(String[] args) {
		Computer[] c=new Computer[3];
		c[0]=new Computer("Touch Screen Monitors","Wired","Wireless","Intel i5","yes","yes",4);
		c[1]=new Computer("LED Monitors","Wireless","Wireless","Intel i7","yes","No",8);
		c[2]=new Computer("OLED Monitors","Wired","Wired","Ryzen 7","No","Yes",16);
	
		for (Computer computer : c) {
			System.out.println(computer.getComputer());
		}

	}

}
