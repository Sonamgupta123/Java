// smallest nummin an array
import java.util.Scanner;
 class ArraySmallNum {
    public static void main(String args[]){
        int i=0, size ;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size");
        size = s.nextInt();
        int a[]= new int[size];
        System.out.println("enter "+size+"value");
        for(i=0;i<size;i++){
            a[i]=s.nextInt();
        }
       
        int min = a[0]; // Assume first element is the largest initially

        for ( i = 1; i < size; i++) {
            if (a[i] < min) {
                min = a[i]; // Update max if current element is greater
            }
        }

        System.out.println("The smallest number is: " + min);
    }
}