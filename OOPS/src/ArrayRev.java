import java.util.Scanner;

class Reverse{
	int i,size;
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
	void RevValue() {
		System.out.println("Reversed array is:");
		for(i=size-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	
}
public class ArrayRev {

	public static void main(String[] args) {
		Reverse obj = new Reverse();
		obj.getSize();
		obj.getValue();
		obj.RevValue();
	}

}
