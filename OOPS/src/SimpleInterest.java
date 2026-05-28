import java.util.Scanner;
class Interest{
	double p,r,t;
	void getData(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the principle");
		p = s.nextDouble();
		System.out.println("Enter the rate");
		r = s.nextDouble();
		System.out.println("Enter the time");
		t = s.nextDouble();
		
	} 
	void calculate() {
		double si;
		si = (p*r*t)/100;
		System.out.println("Simple interest is "+si);
	}
}
public class SimpleInterest {

	public static void main(String[] args) {
		Interest obj = new Interest();
		obj.getData();
		obj.calculate();

	}

}
