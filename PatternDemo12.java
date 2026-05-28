/*
//pattern for printing
11111
1111
111
11
1 
like wise*/ 
class PatternDemo12{
  public static void main(String args[]){
    int i,j;
    for(i=5;i>=1;i--){
        for(j=1;j<=i;j++){
            System.out.print("1");
        }
   System.out.println();
  }  
}
}