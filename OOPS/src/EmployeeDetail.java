import java.util.Scanner;

class Employee{
	int empid ,exp;
	String name;
	double salary;
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the employee id:");
		empid = s.nextInt();
		System.out.println("Enter the experience :");
		exp = s.nextInt();
		System.out.println("Enter the employee name:");
		name = s.next();
		System.out.println("Enter the employee salary:");
		salary = s.nextDouble();
	}
	void showData() {
		System.out.println("Employee id is "+empid);
		System.out.println("Experience is "+exp);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}
	void increament() {
		double newsalary;
		Scanner s = new Scanner(System.in);
		if(exp<5) {
			System.out.println("Increameny salary by 5 %");
			newsalary = salary + (salary*0.05);
			System.out.println("Increament salary is "+newsalary);
		}else if(exp<10) {
			System.out.println("Increameny salary by 10 %");
			newsalary = salary + (salary*0.1);
			System.out.println("Increament salary is "+newsalary);
		}else if (exp>=10) {
			System.out.println("Increameny salary by 15 %");
			newsalary = salary + (salary*0.15);
			System.out.println("Increament salary is "+newsalary);
		}else {
			System.out.println("No experience hence no increamentation");
		}
	}
}
public class EmployeeDetail {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.getData();
		obj.showData();
		obj.increament();
	}

}
