/*
//pattern for printing 
5
54
543
 like wise*/ 
class PatternDemo13{
  public static void main(String args[]){
    int i,j;
    for(i=5;i>=1;i--){
        for(j=5;j>=i;j--){
            System.out.print(j);
        }
    System.out.println(" ");
    }
  }  
}