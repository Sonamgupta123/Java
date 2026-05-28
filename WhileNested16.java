class WhileNested16{
    public static void main(String args[]){
        int i,j,k;
        i=5;
        while(i>=1){
            j=i;
            while(j<=5){
          System.out.print(" ");
          j++;
            }
            k=1;
            while(k<=i){
                System.out.print("* ");
                k++;
            }
            i--;
            System.out.println();
        }
    }
}