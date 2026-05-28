// reverse the order of input and print
import java.util.Scanner;
class ArrayTwoD{
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
        System.out.println("output is:");
        for(i=row-1;i>=0;i--){
        for(j=col-1;j>=0;j--){
        System.out.print(a[i][j]+" ");    
        }
        System.out.println();
        }

    }
}