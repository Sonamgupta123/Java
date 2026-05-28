import java.util.Scanner;
class DoWhileArmstrong{
public static void main(String args[]){
int n,cnt=0,p=1,sum=0,rem;
Scanner s = new Scanner(System.in);
System.out.println("enter the num : ");
n=s.nextInt();
int i=n;
do{
     i=i/10;
     cnt++;
}while(i>0);
int temp=n;
do{
     rem= temp%10;
      p=1;
    int j=1;
     while(j<=cnt){
     p=p*rem;
     j++;
     }
     sum = sum+p;
         
    temp=temp/10; 
}while(temp>0);
if(sum==n){
System.out.println(n+"num is armstrong "+sum);
}else{
    System.out.println(n+"num is not an armstrong"+sum);
}
}
}