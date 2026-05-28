//program to count num of digit in a num
import java.util.Scanner;
class WhileDigCount{
    public static void main(String args[]){
        int n,rev=0,rem,cnt=0;
        Scanner s = new Scanner(System.in);
     System.out.println("enter the num");
     n=s.nextInt();
       
        while(n>0){
     n=n/10;
     cnt++;
        }
        System.out.println("total digit is "+cnt);

    }
}