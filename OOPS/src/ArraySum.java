import java.util.Scanner;

class Sum{
	int i, size,add=0;
	int a[];
	void getSize() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size = sc.nextInt();
		a = new int[size];
	}
	void getValue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in array of size "+size);
		for(i=0;i<size;i++) {
			a[i] = sc.nextInt(); 
		}	
	}
	void addition() {
		
		for(i=0;i<size;i++) {
			add += a[i];
		}
		System.out.println("sum of array value is "+add);
	}
}
public class ArraySum {

	public static void main(String[] args) {
		Sum obj = new Sum();
		obj.getSize();
		obj.getValue();
		obj.addition();

	}

}
