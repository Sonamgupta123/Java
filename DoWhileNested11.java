/* pattern to print 
12345
12345
12345
12345
12345*/
class DoWhileNested11{
    public static void main(String args[]){
        int i,j;
        i=5;
        do{
            j=1;
            while(j<=5){
                System.out.print(j);
                j++;
            }
            System.out.println();
        i--;
        }while(i>=1);
        
    }
}