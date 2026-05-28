import java.util.Scanner;
class CountNum{
public static void main(String args[]){
    int n , i, r=0,cnt=0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the num");
    n = s.nextInt();
    for(i=n; i>0;i=i/10){
        r=r*10;
        r= r+(i%10);
        cnt++;
    }
 System.out.println("total digit present in  num is "+cnt);
}
}