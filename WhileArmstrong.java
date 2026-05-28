import java.util.Scanner;
class WhileArmstrong{
public static void main(String args[]){
int n,cnt=0,p=1,sum=0,rem;
Scanner s = new Scanner(System.in);
System.out.println("enter the num : ");
n=s.nextInt();
int i=n;
while(i>0){
     i=i/10;
     cnt++;
}
int temp=n;
while(temp>0){
     rem= temp%10;
      p=1;
    int j=1;
     while(j<=cnt){
     p=p*rem;
     j++;
     }
     sum = sum+p;
         
    temp=temp/10; 
}
if(sum==n){
System.out.println(n+"num is armstrong "+sum);
}else{
    System.out.println(n+"num is not an armstrong"+sum);
}
}
}