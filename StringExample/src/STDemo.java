import java.util.StringTokenizer;

public class STDemo {

	public static void main(String[] args) {
		
		String s = "Yashaswini:B-Tech;Monika:B-Tech;Sonam:B-Tech;Abhshek:BCA;Vijendra:BCA;Krishna:B-Tech";
		StringTokenizer st = new StringTokenizer(s,":;");
		System.out.println("st.countTokens() :"+st.countTokens());

		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken()+"\t"+st.nextToken());
		}
	}

}