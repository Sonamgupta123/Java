/* pattern to print 
*
**
*** */
class DoWhileNested6{
    public static void main(String args[]){
        int i,j;
        i=1;
        do{
            j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
        i++;
        }while(i<=5);
        
    }
}