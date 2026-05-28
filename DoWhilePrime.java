import java.util.Scanner;
class DoWhilePrime{
    public static void main(String args[]){
        int i,num,cnt=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the num ");
        num = s.nextInt();
        i = 1;
        do{
            if(num%i==0){
                cnt++;
            }
            i++;
        }while(i<=num);
        if(cnt==2){
            System.out.println("Prime num ");
        }else{
            System.out.println("not a prime num");
        }
    }
}