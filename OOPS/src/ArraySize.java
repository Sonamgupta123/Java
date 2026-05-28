// this program is for taking array size from user as well as value

import java.util.Scanner;

class Size{
	int s,i;
	int a[];
	void getSize() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array:");
		s = sc.nextInt();
		a = new int [s];
		}
	
	void getArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in array of size "+s);
		for(i=0;i<s;i++) {
      a[i]= sc.nextInt();
			
		}
	}
	void showData() {
		System.out.println("the values are:");
		for(i=0;i<s;i++) {
			System.out.println(a[i]);
		}
	}
	}

public class ArraySize {

	public static void main(String[] args) {
		Size obj = new Size();
		obj.getSize();
		obj.getArray();
		obj.showData();

	}

}
