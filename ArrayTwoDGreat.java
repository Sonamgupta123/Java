// find greatest num in each row
import java.util.Scanner;
class ArrayTwoDGreat{
    public static void main(String args[]){
         int row,col,i,j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row");
        row = s.nextInt();
        System.out.println("Enter the coloumn");
        col = s.nextInt();
        int a[][] = new int[row][col];
        System.out.println("enter the values:");
        for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            a[i][j]=s.nextInt();
        }
        }
        System.out.println("Greater num in each row");
      
        for ( i = 0; i < row; i++) {
              int max = a[i][0];
            for ( j = 1; j < col; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println("Row " + (i + 1) + ": " + max);
        }
    }
}