/* pattern to print 
5
54
543
5432
54321 */
class NestedWhilePattern2{
    public static void main(String args[]){
        int i,j;
        i=5;
        while(i>=1){
            j=5;
            while(j>=i){
                System.out.print(j);
                j--;
            }
            System.out.println();
        i--;
        }
        
    }
}