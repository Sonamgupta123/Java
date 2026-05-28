/* pattern to print 
54321
5432
543
54
5 */
class DoWhileNested2{
    public static void main(String args[]){
        int i,j;
        i=1;
        do{
            j=5;
            while(j>=i){
                System.out.print(j);
                j--;
            }
            System.out.println();
        i++;
        }while(i<=5);
        
    }
}