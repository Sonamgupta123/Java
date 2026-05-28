
public class StringToByte {

	public static void main(String[] args) {
		String s = "ABCDEFGH";
		byte b[] = s.getBytes() ;
		for(int i=0 ; i<b.length;i++) {
			System.out.println(b[i]);
		}

	}

}
