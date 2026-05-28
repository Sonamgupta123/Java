/* pattern to print 
12345
1234
123
12
1 */
class NestedWhilePattern3{
    public static void main(String args[]){
        int i,j;
        i=5;
        while(i>=1){
            j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
        i--;
        }
        
    }
}