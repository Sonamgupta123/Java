/* pattern to print 
111
222
333 */
class WhileNested9{
    public static void main(String args[]){
        int i,j;
        i=1;
        while(i<=5){
            j=1;
            while(j<=5){
                System.out.print(i);
                j++;
            }
            System.out.println();
        i++;
        }
        
    }
}