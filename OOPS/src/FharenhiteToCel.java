import java.util.Scanner;
class Degree{
	double f;
	void getData(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the degree farehenhite");
		f = s.nextDouble();
		
	} 
	void calculate() {
		double c;
		c = ((5/9)*f )-32;
	   System.out.println("result is "+c);
	}
}
public class FharenhiteToCel {

	public static void main(String[] args) {
		Degree obj = new Degree();
		obj.getData();
		obj.calculate();
	}

}
