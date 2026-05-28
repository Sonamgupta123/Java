import java.util.Scanner;

class Time{
	int h,m;
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the hour:");
		h = s.nextInt();
		
		
	}
	void showData() {
		System.out.println("Hour is "+h);

	}
	void calculation() {
		m = h*60;
		System.out.println("Convertion from hour to minute is "+m);
	}
}
public class TimeCalc {

	public static void main(String[] args) {
		Time obj = new Time();
		obj.getData();
		obj.showData();
		obj.calculation();

	}

}
