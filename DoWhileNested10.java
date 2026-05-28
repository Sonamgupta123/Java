/* pattern to print 
55555
44444
33333
22222
11111*/
class DoWhileNested10{
    public static void main(String args[]){
        int i,j;
        i=5;
        do{
            j=1;
            while(j<=5){
                System.out.print(i);
                j++;
            }
            System.out.println();
        i--;
        }while(i>=1);
        
    }
}