/* pattern to print 
55555
44444
33333
22222
11111*/
class WhileNested10{
    public static void main(String args[]){
        int i,j;
        i=5;
        while(i>=1){
            j=1;
            while(j<=5){
                System.out.print(i);
                j++;
            }
            System.out.println();
        i--;
        }
        
    }
}