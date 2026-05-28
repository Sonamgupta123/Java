/* pattern to print 
11111
1111
111
11
1 */
class WhileNested4{
    public static void main(String args[]){
        int i,j;
        i=5;
        while(i>=1){
            j=1;
            while(j<=i){
                System.out.print("1");
                j++;
            }
            System.out.println();
        i--;
        }
        
    }
}