/* pattern to print 
1
11
111 */
class DoWhileNested5{
    public static void main(String args[]){
        int i,j;
        i=1;
        do{
            j=1;
            while(j<=i){
                System.out.print("1");
                j++;
            }
            System.out.println();
        i++;
        }while(i<=5);
        
    }
}