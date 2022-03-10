package day2assignment.ques2;

public class Triangle extends Rectangle {
	public Triangle(int dim1,int dim2) {
		super(dim1,dim2);
	}
	public double area() {
		double a=(1/2.0)*(super.dim1*super.dim2);
		return a;
}
}
