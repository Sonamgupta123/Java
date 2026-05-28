/* pattern to print 
333
222
111 */
class WhileNested12{
    public static void main(String args[]){
        int i,j;
        i=1;
        while(i<=5){
            j=5;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.println();
        i++;
        }
        
    }
}