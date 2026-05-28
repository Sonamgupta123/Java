//factorial of given num
import java.util.Scanner;
class WhileFactorial{
    public static void main(String args[]){
        int n ,i ,fact=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num :");
        n = s.nextInt();
     i=1;
     while(i<=n){
        fact=fact*i;
        i++;
     }
     System.out.println("factorial is "+fact);
    }

}