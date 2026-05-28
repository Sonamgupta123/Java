/* pattern to print 
12345
12345
12345
12345
12345*/
class WhileNested11{
    public static void main(String args[]){
        int i,j;
        i=5;
        while(i>=1){
            j=1;
            while(j<=5){
                System.out.print(j);
                j++;
            }
            System.out.println();
        i--;
        }
        
    }
}