package day2assignment.ques5.org.demo.tools;
public class Calculator {
	public double num1;
	public double num2;
	public Calculator(double num1,double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public void add() {
		System.out.println(this.num1+this.num2);
	}
	public void sub() {
		System.out.println(this.num1-this.num2);
	}
	public  void mul() {
		System.out.println(this.num1*this.num2);
	}
	public void div() {
		System.out.println((double)(this.num1/this.num2));
	}
}
