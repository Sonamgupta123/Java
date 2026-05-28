import java.util.Scanner;
class Area{
	double r , pi=3.14;
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of radius:");
		r = s.nextDouble();
	}
	void calculate(){
		double ar ;
		ar = pi*r*r;
		System.out.println("area is ="+ar);
	}
}
public class AreaCircle {

	public static void main(String[] args) {
		Area obj = new Area();
		obj.getData();
		obj.calculate();
	}

}
