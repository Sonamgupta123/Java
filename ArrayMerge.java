import java.util.Scanner;

class ArrayMerge {
    public static void main(String args[]) {
        int i, size,j;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the arrays:");
        size = s.nextInt();

        int a[] = new int[size];
        int b[] = new int[size];

        System.out.println("Enter " + size + " values for the first array:");
        for (i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Enter " + size + " values for the second array:");
        for (i = 0; i < size; i++) {
            b[i] = s.nextInt();
        }

        // Merged array with length = size of a + size of b
        int c[] = new int[size * 2];

        // Copy first array into c
        for (i = 0; i < size; i++) {
            c[i] = a[i];
        }

        // Copy second array into c
        for (j= 0; j < size; j++) {
            c[i]=b[j];
            i++;
        }

        System.out.println("Merged array:");
        for (i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

       
    }
}
