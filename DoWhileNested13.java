/* pattern to print 
11111
11111
11111 */
class DoWhileNested13{
    public static void main(String args[]){
        int i,j;
        i=1;
        do{
            j=5;
            while(j>=1){
                System.out.print("1");
                j--;
            }
            System.out.println();
        i++;
        }while(i<=5);
        
    }
}