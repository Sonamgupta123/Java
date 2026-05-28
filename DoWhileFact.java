import java.util.Scanner;
class DoWhileFact{
    public static void main(String args[]){
        int i , num ,fact=1;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the num");
    num = s.nextInt();
    i= 1;
    do{
        fact = fact*i;
        i++;
    }while(i<=num);
    System.out.println("factorial of  the num is "+fact);
    }
}