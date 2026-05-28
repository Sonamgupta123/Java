class WhileNested15{
    public static void main(String args[]){
        int i,j,k;
        i=1;
        while(i<=5){
            j=i;
            while(j<=5){
          System.out.print(" ");
          j++;
            }
            k=1;
            while(k<=i){
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }
    }
}