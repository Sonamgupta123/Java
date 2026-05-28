import java.util.Scanner;
class Student{
	int rollno;
	String name;
	double mmarks,pmarks,cmarks;
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the roll num:");
		rollno = s.nextInt();
		s.nextLine();
		System.out.println("Enter the name of student");
		name = s.nextLine();
		System.out.println("Enter the maths marks");
	     mmarks = s.nextDouble();
	     System.out.println("Enter the physics marks");
	     pmarks = s.nextDouble();
	     System.out.println("Enter the chemistry marks");
	     cmarks = s.nextDouble();
	     
	}
	void showData() {
		System.out.println("roll num is "+rollno);
		System.out.println("name is "+name);
		System.out.println("maths marks is "+mmarks);
		System.out.println("physics marks is "+pmarks);
		System.out.println("chemistry marks is "+cmarks);

	}
	void total() {
		double total;
		total = mmarks+pmarks+cmarks;
		System.out.println("Total marks is ="+total);
	}
	void percentage() {
		double perc;
		perc  = ((mmarks+pmarks+cmarks )/ 300)*100;
		System.out.println("Percentage is :"+perc);
	}
	void grade() {
		String grd;
		double perc;
		perc  = ((mmarks+pmarks+cmarks )/ 300)*100;
		if(perc>=60) {
			System.out.println("A grade");
		}else if(perc>=45) {
			System.out.println("B grade");
		}else if(perc>=33) {
			System.out.println("C grade");
		}else {
			System.out.println("Fail");
		}
		
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.getData();
		obj.showData();
        obj.total();  
        obj.percentage();
        obj.grade();
	}

}
