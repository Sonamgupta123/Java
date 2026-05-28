import java.util.Scanner;
class Person{
	String name;
	String address;
	
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		name = s.nextLine();
		System.out.println("Enter the address");
		address = s.nextLine();
	}
	void showData() {
		System.out.println("Name of person "+name);
		System.out.println("Adress is "+address);
	}
}
class Employee extends Person{
	int empid;
	double salary;
	void getData1() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the empid");
		empid = s1.nextInt();
		System.out.println("Enter the salary");
		salary = s1.nextDouble();		
	}
	void showData1() {
		System.out.println("Empid is "+empid);
		System.out.println("Salary is "+salary);
	}
}
public class HwInheritance {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.getData();
		e.showData();
		e.getData1();
		e.showData1();

	}

}
