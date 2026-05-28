import java.util.Scanner;
class Volume{
	int l,b,h;
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length");
		l = s.nextInt();
		System.out.println("Enter breadth");
		b = s.nextInt();
		System.out.println("Enter height");
		h = s.nextInt();
		
	}
	void calculate() {
		int vol;
		vol = l*b*h;
		System.out.println("volume is "+vol);
	}
}
public class VolumeDemo {

	public static void main(String[] args) {
		Volume obj = new Volume();
		obj.getData();
		obj.calculate();

	}

}
