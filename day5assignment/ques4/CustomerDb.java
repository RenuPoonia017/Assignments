package assignment.ques4;
import java.util.HashMap;
import java.util.Map;
public class CustomerDb {
	static Map<Integer,BankCustomer> db;
	static {
	db=new HashMap<>();
	db.put(100,new BankCustomer(100,"John","Ambala",65677));
	db.put(101,new BankCustomer(101,"Renu","Bhiwani",66768));
	db.put(102,new BankCustomer(102,"Neha","Hisar",67887));
	db.put(103,new BankCustomer(103,"Ekta","Karnal",54556));
	db.put(104,new BankCustomer(104,"Yashi","Bhiwani",43546));
	db.put(105,new BankCustomer(105,"Pankaj","Hisar",34435));
	db.put(106,new BankCustomer(106,"Deepak","Bhiwani",33543));
	db.put(107,new BankCustomer(107,"Himanshu","Bhiwani",23345));
	db.put(108,new BankCustomer(108,"Darshan","Faridabad",46666));
	db.put(109,new BankCustomer(109,"Kirti","Hisar",55677));
}
}
