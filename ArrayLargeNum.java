// largest num in an array
import java.util.Scanner;
 class ArrayLargeNum {
    public static void main(String args[]){
        int i=0, size ;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size");
        size = s.nextInt();+
        int a[]= new int[size];
        System.out.println("enter "+size+"value");
        for(i=0;i<size;i++){
            a[i]=s.nextInt();
        }
       
        int max = a[0]; // Assume first element is the largest initially

        for ( i = 1; i < size; i++) {
            if (a[i] > max) {
                max = a[i]; // Update max if current element is greater
            }
        }

        System.out.println("The largest number is: " + max);
    }
}