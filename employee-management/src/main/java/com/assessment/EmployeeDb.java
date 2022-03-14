package com.assessment;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDb {
	public static Map<Integer,Employee> db;
    static {
    	db=new HashMap<>();
    	db.put(100,new Employee(100,"John","Ambala"));
    	db.put(101,new Employee(101,"Renu","Bhiwani"));
    	db.put(102,new Employee(102,"Neha","Hisar"));
    	db.put(103,new Employee(103,"Ekta","Karnal"));
    	db.put(104,new Employee(104,"Yashi","Bhiwani"));
    	db.put(105,new Employee(105,"Pankaj","Hisar"));
    	db.put(106,new Employee(106,"Deepak","Bhiwani"));
    	db.put(107,new Employee(107,"Himanshu","Bhiwani"));
    	db.put(108,new Employee(108,"Darshan","Faridabad"));
    	db.put(109,new Employee(109,"Kirti","Hisar"));
    }
    }
