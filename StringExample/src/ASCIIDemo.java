public class ASCIIDemo {

	    public static void main(String[] args) {
	        byte i;

	        for(i = -128; ; i++) {
	            System.out.print("  " + i + "->" + (char)i);
	            if(i == 127)
	                break;
	        }
	    }
}
