import java.util.Scanner;
class PrimeNum{
public static void main(String args[]){
int i,n,cnt=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the num");
n=s.nextInt();
for(i=2;i<=n;i++){
if(n%i==0)
cnt++;
}
if(cnt==1){
System.out.println("Number is prime");
}else{
System.out.println("Number is not a  prime");
}
}
}