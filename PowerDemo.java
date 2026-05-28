import java.util.Scanner;
class PowerDemo{
public static void main(String args[]){
    int n , i,m ,pow=1;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the num n");
    n = s.nextInt();
    System.out.println("enter the num m");
    m = s.nextInt();
    for(i=1;i<=n;i++){
          pow = pow*m;
    }
    System.out.println("power is "+pow);
}
}