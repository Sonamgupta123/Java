import java.util.Scanner;
class WhilePrime{
    public static void main(String args[]){
        int n ,cnt=0,i;
        Scanner s= new Scanner(System.in);
        System.out.println("enter num ");
        n=s.nextInt();
        i=1;
        while(i< n){
            if(n%i==0){
                cnt++;
            }
            i++;
        }
        if(cnt==2){
            System.out.println("num is not a  prime");
        }else{
         System.out.println("num is  prime");   
        }
    }
}