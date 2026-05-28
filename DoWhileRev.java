// reverse a digit
import java.util.Scanner;
class DoWhileRev{
    public static void main(String args[]){
        int num, rev=0,rem;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num :");
        num = s.nextInt();
     do{
        rem = num%10;
        rev = rev*10 + rem;
        num = num /10;
     }while(num>0);
     System.out.println("reverse of a number is : "+rev);
    }
}