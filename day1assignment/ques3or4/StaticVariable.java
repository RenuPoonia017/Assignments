package com.day1assignmentques.ques3or4;

public class StaticVariable {
    static int x=10;//static variable
    int y=10;//non static variable
	public static void main(String[] args) {
		System.out.println(x);
		StaticVariable s1=new StaticVariable();
		s1.incrementTest();
		s1.incrementTest();
		s1.method1();
		System.out.println("Value of x after increment "+x +" "+s1.y);	
		StaticVariableClass2 access=new StaticVariableClass2();
		System.out.println("Value of name and roll no "+access.name+" "+access.Rollno+" "+access.name2);
	}
    public void method1() {  //instance method
    	x=20;
    	System.out.println(x);
    	StaticVariable n1=new StaticVariable();
    	n1.x=70;
    	System.out.println("accessing of x after object creation "+x);
    }
    public void incrementTest() {
    	x++;
    	y++;
    }
    
    
}
