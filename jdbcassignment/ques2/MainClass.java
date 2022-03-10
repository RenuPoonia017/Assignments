package assignment.ques2;
import java.util.List;

import assignment.ques3.*;
public class MainClass {
	public static void main(String[] args) {
		CustomerDao c=new CustomerDaoImp();
		//insert one customer data in db
		Customer cus=new Customer(100,"Yashi","Bhiwani",54236534,53267);
		c.save(cus);
		
		//insert five customer data in db
		cus=new Customer(101,"Renu","Bhiwani",5476763,53656);
		c.save(cus);
		
		cus=new Customer(102,"Neha","Hisar",5465655,53654);
		c.save(cus);
		
		cus=new Customer(103,"Ekta","Bhiwani",5423654,53787);
		c.save(cus);
		
		cus=new Customer(104,"Riya","Delhi",5425467,53000);
		c.save(cus);
		
		cus=new Customer(105,"Yamni","Bhiwani",5425655,55000);
		c.save(cus);
		
		//Update balance
		cus=new Customer(100,"Yashi","Bhiwani",54236534,57888);
		c.update(100, cus);
		
		//delete a customer
		c.delete(105);
		
		//List of all Customers
		List<Customer> lis=c.listAll();
		for(Customer cs:lis) {
		System.out.println(cs);
			
		}
		
		//List a customer with a particular customerId
		System.out.println(c.findCustomerById(102));
		
		
		

	}

}
