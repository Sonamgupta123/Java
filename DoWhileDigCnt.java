// reverse a digit
import java.util.Scanner;
class DoWhileDigCnt{
    public static void main(String args[]){
        int num, cnt=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num :");
        num = s.nextInt();
     do{
        num = num /10;
        cnt++;
     }while(num>0);
     System.out.println("digit count  of a number is : "+cnt);
    }
}