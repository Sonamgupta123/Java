// find the sum of row of 4by4 array
import java.util.Scanner;
class ArrayTwoDRowSum{
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
     for(i=0;i<row;i++){
        int sum = 0;
     for(j=0;j<col;j++){
        sum = sum + a[i][j];
     }
     System.out.println("sum of  row "+i+ "="+sum);
     }
     
    }
}