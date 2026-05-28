//while counting from 1to 10 and sum also
class WhileCount{
    public static void main(String args[]){
        int sum=0,i;
        i=1;
        while(i<=10){
            System.out.println(i);
            sum=sum+i;
            i++;  
        }
        System.out.println("sum of 1 to 10 is "+sum);
        System.out.println(" ");
        System.out.println("reverse counting is:");
        i=10;
        while(i>=1){
     System.out.println(i);
     i--;
        }
    }
}