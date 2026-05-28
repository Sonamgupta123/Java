// reverse input print
import java.util.Scanner;
class Array{
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
System.out.println("output:");
 for(i=size-1;i>=0;i--){
         System.out.println(a[i]);
        }
    }
}