/* pattern to print 
333
222
111 */
class DoWhileNested12{
    public static void main(String args[]){
        int i,j;
        i=1;
        do{
            j=5;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.println();
        i++;
        }while(i<=5);
        
    }
}