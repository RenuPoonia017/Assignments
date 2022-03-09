package day2assignment.ques2;

public class FigureMain {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(3,4);
		Triangle t=new Triangle(4,4);
		double ra=r.area();
		double ta=t.area();
		System.out.println("Area of Recangle "+ra);
		System.out.println("Area of Triangle "+ta);

	}

}
