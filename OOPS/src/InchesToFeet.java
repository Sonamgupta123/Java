import java.util.Scanner;
class Calculation{
	double inches;
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of inches:");
		inches = s.nextDouble();
	}
	void calculate(){
		double feet ;
		feet = inches/12;
		System.out.println("area is ="+feet);
	}
}
public class InchesToFeet {

	public static void main(String[] args) {
		Calculation obj = new Calculation();
		obj.getData();
		obj.calculate();

	}

}
