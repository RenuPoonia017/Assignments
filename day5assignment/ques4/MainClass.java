package assignment.ques4;

public class MainClass {
	public static void main(String[] args) {
		for(int i:CustomerDb.db.keySet()) {
			System.out.println(CustomerDb.db.get(i));
		}
		Methods m=new Methods();
		System.out.println("----------");
		m.SearchCustomer(100);
		System.out.println("---------");
		BankCustomer b=new BankCustomer(112,"Nehami","Bhiwani",65576);
		m.addNewCustomer(b);
		for(int i:CustomerDb.db.keySet()) {
			System.out.println(CustomerDb.db.get(i));
		}

	}

}
