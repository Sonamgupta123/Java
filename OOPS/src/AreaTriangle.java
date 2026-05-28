import java.util.Scanner;
class Triangle{
	double l,b;
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the lenght");
		l=s.nextDouble();
		System.out.println("Enter the breadth");
		b=s.nextDouble();
	}
	void calculate(){
		double area;
		
		area = (l*b)/2;
		System.out.println("Area of triangle is "+area);
	}
}
public class AreaTriangle {

	public static void main(String[] args) {
		Triangle obj = new Triangle();
		obj.getData();
		obj.calculate();

	}

}
