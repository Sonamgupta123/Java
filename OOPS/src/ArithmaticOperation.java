import java.util.Scanner;
class Operations{
	int a,b;
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a= s.nextInt();
		System.out.println("Enter the value of b:");
		b = s.nextInt();
		
	}
	void sum() {
		int c;
		c = a+b;
		System.out.println("Sum is ="+c);
	}
	void sub() {
		int d;
		d= a-b;
		System.out.println("Sub is ="+d);
	}
	void mul() {
		int e;
		e = a*b;
		System.out.println("Multiplication is ="+e);
	}
	void div() {
		double f ;
		f = (double)a/b;
		System.out.println("division is ="+f);
		
	}
}
public class ArithmaticOperation {

	public static void main(String[] args) {
		Operations obj = new Operations();
		obj.getData();
		obj.sum();
		obj.sub();
		obj.mul();
		obj.div();

	}

}
