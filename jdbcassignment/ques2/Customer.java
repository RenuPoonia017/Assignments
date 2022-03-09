package assignment.ques2;

public class Customer {
	private int customerId;
	private String name;
	private String address;
	private int accountNo;
	private double salary;
	public Customer() {
		
	}
	public Customer(int customerId, String name, String address, int accountNo, double salary) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.accountNo = accountNo;
		this.salary = salary;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return customerId+" "+name+" "+address+" "+accountNo+" "+salary;
	}
	

}
