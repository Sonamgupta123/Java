import java.util.Scanner;

class Greatest{
	int i,size;
	int a[],max;
	
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
			 a[0]=max;
		}	
	}
	
	void FindGreat() {
		
		for(i=0;i<=size;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("The greatest value in array is"+max);
	}
}
public class ArrayGreatest {

	public static void main(String[] args) {
		Greatest obj = new Greatest();
		obj.getSize();
		obj.getValue();
		
		obj.FindGreat();

	}

}
