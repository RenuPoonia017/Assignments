package assignment.ques3;

import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		CustomerDaoImp cd=new CustomerDaoImp();
		Customer c=new Customer(101,"Ekta","Hisar",656788,45000);
		//cd.save(c);//data insert
		//System.out.println(cd.findCustomerById(100));//fetch data from db
		//cd.update(101, c);//update data on db
		//cd.delete(101);//delete data from db
		List<Customer> lis=cd.listAll();
		for(Customer cus:lis) {
			System.out.println(cus);
			
		}
	}

}































































































































