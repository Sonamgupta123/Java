import java.util.Scanner;
class ArrayTranspose{
    public static void main(String args[]){
        int i,j,r,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row");
        r = s.nextInt();
        System.out.println("Enter the coloumn");
        c = s.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the values in a array:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j]=s.nextInt();
            }
        }
         int b[][] = new int[r][c];
        System.out.println("Transpose is");
        for(j=0;j<c;j++){
            for(i=0;i<r;i++){
               b[i][j]= a[i][j];
            }
        }
        for(j=0;j<c;j++){
            for(i=0;i<r;i++){
               System.out.print(" "+b[i][j]);
            }
            System.out.println();
        }

    }
}