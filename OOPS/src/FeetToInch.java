import java.util.Scanner;
class Measurement{
	double feet;
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of feet:");
		feet = s.nextDouble();
	}
	void calculate(){
		double inches ;
		inches = 12*feet;
		System.out.println("area is ="+inches);
	}
}
public class FeetToInch {

	public static void main(String[] args) {
		Measurement obj = new Measurement();
		obj.getData();
		obj.calculate();

	}

}
