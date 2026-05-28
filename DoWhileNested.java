/* pattern to print 
1
12
123 */
class DoWhileNested{
    public static void main(String args[]){
        int i,j;
        i=1;
        do{
            j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
        i++;
        }while(i<=5);
        
    }
}