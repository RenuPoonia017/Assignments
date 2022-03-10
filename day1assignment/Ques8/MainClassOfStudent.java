package com.day1AssignmentQues.Ques8;

public class MainClassOfStudent {
		public static void main(String[] args) {
			Student obj=new Student();
	    	Student obj1=new Student("Renu",33);
	    	System.out.println(obj1.name+" "+obj1.rollno);
	    	Student obj2=new Student("Renu",33,67);
	    	System.out.println(obj2.name+" "+obj2.rollno+" "+obj2.batchNo);
	    	Student obj3=new Student("Renu",33 ,68,"Yashi");
	    	System.out.println(obj3.name+" "+obj3.rollno+" "+obj3.batchNo+" "+obj3.friendName);
	    	obj=null; //delete obj
	        System.out.println(obj.batchNo);//throw error because object is deleted from memory
	}


}
