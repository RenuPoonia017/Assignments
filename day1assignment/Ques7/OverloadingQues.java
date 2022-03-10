package com.day1AssignmentQues.Ques7;
/*Here overloading based on the datatypes of variable if in any case we pass 
  any argument in hello method and that data type is 
  not declared in overloading functions then java compiler do java internal type promotion*/
public class OverloadingQues {
    /*public void hello(int i) {
    	System.out.println(i);   //if i will comment this function and pass argument like 5678 
    	                         in hello method then here internal type promotion happened and this value
    	                         promoted as long value and function that accept long value execute
    }*/
	public void hello(int i) {
		System.out.println(i);
	}
	
    public void hello(byte i) {
    	System.out.println("byte "+i);
    }
    public void hello(short i) {
    	System.out.println("short "+i);
    }
    public void hello(long i) {
    	System.out.println("long "+i);
    }
	public static void main(String[] args) {
		OverloadingQues oq=new OverloadingQues();
		//oq.hello();--> in this case it will generate error because we have not  passed any argument
		oq.hello(5667);  
		oq.hello(45);
		oq.hello(456);
		oq.hello(54657676);
		
	}

}
