/* pattern to print 
55555
4444
333
22
1*/
class DoWhileNested8{
    public static void main(String args[]){
        int i,j;
        i=5;
        do{
            j=1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
        i--;
        }while(i>=1);
        
    }
}