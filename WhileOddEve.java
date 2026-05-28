// print num is odd or eve from 1 to n
import java.util.Scanner;
class WhileOddEve{
    public static void main(String args[]){
        int n,i;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the num");
        n= s.nextInt();
        i=1;
        System.out.println("Even Num are :");
        while(i<=n){
        if(i%2==0){
            System.out.println(i);
        }
        i++;
        }
    
    System.out.println(" ");
    System.out.println("Odd num are: ");

        i=1;
        while(i<=n){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}