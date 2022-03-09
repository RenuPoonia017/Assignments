package day2assignment.ques1;

public class Duck extends Eagle {
	public Duck(String name) {
		super(name);
	}
	public void fly() {
		System.out.println("Duck "+super.name+" can fly");
		
	};

}
