import java.util.Scanner;
class DoWhileOddEve{
    public static void main(String args[]){
        int i,n ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num:");
        n=s.nextInt();
        i=1;
        System.out.println("Even Num:");
    do{
        if(i%2==0){
            System.out.println(i);
        }
        i++;
    }while(i<=n);
    i=1;
    System.out.println("Odd Num:");
    do{
        if(i%2!=0){
            System.out.println(i);
        }
        i++;
    }while(i<=n);

    }
}