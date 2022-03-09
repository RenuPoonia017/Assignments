package assignment.ques2;
import java.util.List;
public interface CustomerDao { 
		public Customer findCustomerById(int id);
		public String save(Customer c);
		public String delete(int customerId);
		public List<Customer> listAll();
		public String update(int id, Customer c);

	}

