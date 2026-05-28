/* pattern to print 
1
22
333 */
class WhileNested7{
    public static void main(String args[]){
        int i,j;
        i=1;
        while(i<=5){
            j=1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
        i++;
        }
        
    }
}