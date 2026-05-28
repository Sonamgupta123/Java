import java.util.Scanner;
class SwapDemo{
public static void main(String args[]){
int a, b;
Scanner obj = new Scanner(System.in);
System.out.println("enter the a :");
a = obj.nextInt();
System.out.println("enter the b :");
b = obj.nextInt();
System.out.println("before swapping value is " +a+" "+b);

 a= a+b;
 b= a-b;
 a= a-b;
System.out.println("after swapping value is " +a+" "+b);
}
}
