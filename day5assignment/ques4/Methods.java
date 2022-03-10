package assignment.ques4;
import java.util.*;
public class Methods {
	public void SearchCustomer(int customerId) {
		Set<Integer> customerIds=CustomerDb.db.keySet();
		for(Integer id: customerIds) {
		   if(id==customerId) {
			   System.out.println(CustomerDb.db.get(customerId));
		   }
		 
		}
		}
	public void addNewCustomer(BankCustomer b) {
		if(CustomerDb.db.containsKey(b.getCustomerId())) {
			System.out.println("This user already present ");
		}
		else {
			CustomerDb.db.put(b.getCustomerId(),b);
		}
		
	}
    public List<String> listAll(double salary){
    	List<String> persons=new ArrayList<>();
		for(Integer i:CustomerDb.db.keySet()) {
			BankCustomer p=CustomerDb.db.get(i);
			if(p.getAccountBalance()==salary) {
				persons.add(p.toString());
			}
	    }
		return persons;
    }
}
