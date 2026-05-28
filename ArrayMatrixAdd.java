import java.util.Scanner;
class ArrayMatrixAdd{
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
        System.out.println("Enter the values in b array:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                b[i][j]=s.nextInt();
            }
        }
         int sum[][] = new int[r][c];
        
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        
         System.out.println("Output:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
               System.out.print(" "+sum[i][j]);
            }
            System.out.println();
        }

    }
}