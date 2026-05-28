// Adding two num 
import java.util.Scanner;
class ArrayAdd{
    public static void main(String args[]){
        int i=0, size;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size");
        size = s.nextInt();
        int a[]= new int[size];
        System.out.println("enter "+size+"value");
        for(i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        int b[]=new int[size];
        System.out.println("enter "+size+"value");
        for(i=0;i<size;i++){
            b[i]=s.nextInt();
        }
        int c[] = new int[size];
     System.out.println("C values:");
        for(i=0;i<size;i++){
            c[i] = a[i]+b[i];
        }
        System.out.println("value in c is:");
        for(i=0;i<size;i++){
            System.out.println(c[i]);
        }
    }
}