package com.day1assignmentques.ques6;
public class OverloadingTest {
    public void addString() {
    	System.out.println("No strings passed as argument");
    }
    public void addString(String s1,String s2) {
    	System.out.println(s1+" "+s2);
    }
    public void addString(String s1,String s2,String s3) {
    	System.out.println(s1+" "+s2+" "+s3);
    }
    public void addString(String...strings) {
    	for(String s:strings) {
    		System.out.print(s+" ");
    	}
    }
	public static void main(String[] args) {
		OverloadingTest olt=new OverloadingTest();
		olt.addString();
		olt.addString("Renu", "Poonia");
		olt.addString("Renu","Yashi","Ekta");
		olt.addString("Renu","Yashi","Ekta","Himanshu","Deepak","Pankaj");
	}

}
