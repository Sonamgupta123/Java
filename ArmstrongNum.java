import java.util.Scanner;
class ArmstrongNum{
public static void main(String args[]){
    int n , i, rem,cnt=0,j,sum=0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the num");
    n = s.nextInt();
    int temp=n;
    for(i=n; i>0;i=i/10){
        cnt++;
    }
    for(i=n; i>0;i=i/10){
        rem =  i%10;
        int pow=1;
        for(j=0;j<cnt;j++){
            pow= pow*rem;
        }
        sum= sum+pow;
    }
 if(sum==temp){
    System.out.println("num is armstrong num");
 }else{
  System.out.println("num is not an armstrong num");
 }
}
}