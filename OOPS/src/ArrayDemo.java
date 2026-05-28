import java.util.Scanner;

class Array{
	int a[] = new int[10],i;
	void getData() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value in array:");
	for(i=0;i<=9;i++) {
		a[i]=s.nextInt();
	}
	}
	void showData() {
		System.out.println("the value present in array is:");
		for(i=0;i<=9;i++) {
		System.out.println(a[i]);
	}
	}
}
public class ArrayDemo {

	public static void main(String[] args) {
		Array a = new Array();
		a.getData();
		a.showData();
	}

}
