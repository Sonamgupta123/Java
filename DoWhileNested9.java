/* pattern to print 
111
222
333 */
class DoWhileNested9{
    public static void main(String args[]){
        int i,j;
        i=1;
        do{
            j=1;
            while(j<=5){
                System.out.print(i);
                j++;
            }
            System.out.println();
        i++;
        }while(i<=5);
        
    }
}