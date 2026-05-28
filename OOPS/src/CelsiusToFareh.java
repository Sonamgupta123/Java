import java.util.Scanner;
class Temperature{
	double c;
	void getData(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the degree celsius");
		c = s.nextDouble();
		
	} 
	void calculate() {
		double f;
		f=((9/5)*c)+32;
	   System.out.println("result is "+f);
	}
}

public class CelsiusToFareh {

	public static void main(String[] args) {
		Temperature obj = new Temperature();
		obj.getData();
		obj.calculate();
	}

}
