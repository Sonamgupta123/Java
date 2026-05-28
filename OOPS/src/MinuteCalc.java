import java.util.Scanner;

class Minute{
	double m;
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the minute");
		m = s.nextDouble();
		
	} 
	void showData() {
		System.out.println("The minute is "+m);
	}
	void calculate() {
		double h , rem;
		h = m/60;
		rem = m%60;
		System.out.println("the hour to minute conversion is "+h+" remaining minutes is"+rem);
	}
}
public class MinuteCalc {

	public static void main(String[] args) {
		Minute obj = new Minute();
		obj.getData();
		obj.showData();
		obj.calculate();

	}

}
