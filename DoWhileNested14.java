class DoWhileNested14{
    public static void main(String args[]){
        int i,j,k;
        i=1;
        do{
            j=i;
            do{
          System.out.print(" ");
          j++;
            }while(j<=5);
            k=1;
            do{
                System.out.print("* ");
                k++;
            }while(k<=i);
            i++;
            System.out.println();
        }while(i<=5);
    }
}