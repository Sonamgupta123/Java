// palindrome num
//program to reverse a num
import java.util.Scanner;
class WhilePalindrome
{
    public static void main(String args[]){
        int n,rev=0,rem;
        Scanner s = new Scanner(System.in);
     System.out.println("enter the num");
     n=s.nextInt();
     int temp=n;
       
        while(n>0){
     rem= n%10;
     rev= rev*10 + rem;
     n=n/10;
        }
        System.out.println("rev is "+rev);
    if(rev==temp){
        System.out.println("num is palindrome");
    }else{
        System.out.println("num is not  a palindrome");
    }
    }
}