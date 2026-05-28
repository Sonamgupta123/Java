/* pattern to print 
1
11
111 */
class WhileNested5{
    public static void main(String args[]){
        int i,j;
        i=1;
        while(i<=5){
            j=1;
            while(j<=i){
                System.out.print("1");
                j++;
            }
            System.out.println();
        i++;
        }
        
    }
}