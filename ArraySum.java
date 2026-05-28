// sum of  input print
import java.util.Scanner;
class ArraySum{
    public static void main(String args[]){
        int i=0, size ,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size");
        size = s.nextInt();
        int a[]= new int[size];
        System.out.println("enter "+size+"value");
        for(i=0;i<size;i++){
            a[i]=s.nextInt();
        }

  for(i=0;i<size;i++){
           sum= sum+a[i];
        }
        System.out.println("output:"+sum);
    }
}