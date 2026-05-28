import java.util.Scanner;
class GreaterNum{
public static void main(String args[]){
int num1 , num2;
Scanner s = new Scanner(System.in);
System.out.println("enter the num 1:");
num1 = s.nextInt();
System.out.println("enter the num 2:");
num2 = s.nextInt();
if(num1>num2){
System.out.println(" num1 is greater than: num2");
}else{
System.out.println("num1 is less than :num2");
}
}
}

