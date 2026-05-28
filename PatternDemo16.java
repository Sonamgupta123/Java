/*
//pattern for printing 
* * *
 * *
  * like wise*/ 
class PatternDemo16{
  public static void main(String args[]){
    int i,j,k;
    for(i=5;i>=1;i--){
        for(j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(k=i;k>=1;k--){
    System.out.print("* ");
    }
    System.out.println();
    }
  }  
}