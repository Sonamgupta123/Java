
public class ImmutableDemo {

	public static void main(String[] args) {
  String s1 = "Sonam";
  System.out.println("S1 = "+s1);
  System.out.println("s1.hashcode()"+s1.hashCode());
  s1 = s1+"gupta";
  System.out.println("s1 = "+s1);
  System.out.println("s1.hashcode()"+s1.hashCode());
  
 String s2 = "Rahul";
 System.out.println("s2 = "+s2);
 System.out.println("s2.hashcode()"+s2.hashCode());
	}

}
