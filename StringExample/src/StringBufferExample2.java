
class StringBufferExample2
{  
public static void main(String args[])
{  
StringBuffer sb=new StringBuffer("Hello");  
sb.replace(1,3,"Java");  
System.out.println(sb);//prints HJavalo  
StringBuffer sb1=new StringBuffer("Radhemohan");  
sb1.delete(1,5);  
System.out.println(sb1);//prints Rmohan
StringBuffer sb2=new StringBuffer("RAHUL");  
sb2.reverse();  
System.out.println(sb2);//prints luhar 
char ch = sb2.charAt(0);
System.out.println(ch);
sb2.deleteCharAt(2);
System.out.println(sb2);
}  
}  