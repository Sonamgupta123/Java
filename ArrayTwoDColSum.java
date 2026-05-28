// find the sum of coloumn of 4by4 array
import java.util.Scanner;
class ArrayTwoDColSum{
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
     for(j=0;j<col;j++){
        int sum = 0;
     for(i=0;i<row;i++){
        
        sum = sum + a[i][j];
     }
      System.out.println("sum of  col "+j+ "="+sum);
     }
     
    }
}