//serach the value
import java.util.Scanner;
class ArraySearch
{
    public static void main(String args[]){
        int i=0, size ,num;
       
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size");
        size = s.nextInt();
        int a[]= new int[size];
        System.out.println("enter "+size+"value");
        for(i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        System.out.println("enter the num want to search:");
        num= s.nextInt();
        int cnt=0;
        for(i=0;i<size;i++){
            if(a[i]==num){
                System.out.println("value found at "+i+" index");
                cnt++;
                
            }
        }
        if(cnt<=0){
            System.out.println(num+" value not found  ");
        }
        
    }
}