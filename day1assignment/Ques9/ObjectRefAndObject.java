package com.day1AssignmentQues.Ques9;
import java.util.*;
import java.util.ArrayList;


public class ObjectRefAndObject {

	public static void main(String[] args) {
		int[] arr=new int[5];// arr containing the reference of continuous memory allocation
        List<Integer> n= new ArrayList<Integer>(); //n also reference
        ObjectRefAndObject obj=new ObjectRefAndObject(); //object 
        obj.add(7,8);
	}
    public void add(int n1,int n2) {
    	System.out.println(n1+n2);
    }
}
