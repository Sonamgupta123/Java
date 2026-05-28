import java.util.Scanner;

class Addition{
	int a;// data members of class 
	int b;
	
	void getData() { //member methods of class
		Scanner s = new Scanner (System.in);
		System.out.println("enter first value");
		a=s.nextInt();
		System.out.println("Enter second value");
		b = s.nextInt();
		
	}
	void calculate(){
		int c ;
		c=a+b;
		System.out.println("sum = "+c);
	}
}

public class AddDemo {

	public static void main(String[] args) {
		System.out.println("Start...");
		Addition a1 = new Addition();
		a1.getData();
		Addition a2 = new Addition();
		a2.getData();
		
		a1.calculate();
		a2.calculate();
		System.out.println("Stop....");

	}

}
