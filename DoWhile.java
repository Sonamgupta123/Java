import java.util.Scanner;
class DoWhile{
    public static void main(String args[]){
        int i ,n ,sum=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the num");
        n= s.nextInt();
        System.out.println("printing 1 to n num");
        i=1;
        do{
            System.out.println(i);
            sum = sum+i;
            i++;
        }while(i<=n);
        System.out.println("sum of value from 1 to n is "+sum);
        System.out.println("printing reverse value:");
        i=n;
        do{
            System.out.println(i);
            i--;
        }while(i>=1);
    }
}