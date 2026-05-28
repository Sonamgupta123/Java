
public class StringBufferExample
{  
public static void main(String args[])
{  
StringBuffer sb=new StringBuffer("Hello ");  
System.out.println(sb);
System.out.println(sb.hashCode());
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java
System.out.println(sb.hashCode());
StringBuffer sb1 = new StringBuffer("Hello");
sb1.insert(1, "java");
System.out.println("sb1:"+sb1);
System.out.println(sb1.hashCode());


}  
}