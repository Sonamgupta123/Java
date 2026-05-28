/* pattern to print 
11111
11111
11111 */
class WhileNested13{
    public static void main(String args[]){
        int i,j;
        i=1;
        while(i<=5){
            j=5;
            while(j>=1){
                System.out.print("1");
                j--;
            }
            System.out.println();
        i++;
        }
        
    }
}