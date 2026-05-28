// input jo h uska right angled triangle ek baar left mai aaye ek right mai
import java.util.Scanner;
class ArrayInput{
    public static void main(String args[]){
        int i,j,r,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Rows:");
        r= s.nextInt();
        System.out.println("Enter the Coloumns:");
        c= s.nextInt();
     int a[][] = new int [r][c];
        System.out.println("Enter the value of A array:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Output 1:");
        for(i=0;i<r;i++){
            for(j=0;j<=i;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Output 2:");
        
        for(i=0;i<r;i++){
            for(j=i;j<c;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}