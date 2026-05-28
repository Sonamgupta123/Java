/* pattern to print 
54321
5432
543
54
5 */
class NestedWhilePattern{
    public static void main(String args[]){
        int i,j;
        i=1;
        while(i<=5){
            j=5;
            while(j>=i){
                System.out.print(j);
                j--;
            }
            System.out.println();
        i++;
        }
        
    }
}