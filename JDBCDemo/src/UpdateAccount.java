import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAccount {

	public static void main(String[] args) {
		
		try {
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Error in loading driver :"+e);
		}
		
		try 
		{
			//step2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/25aug25ad?user=root&password=root");
			//step3
			Statement stmt = con.createStatement();
			//step 4
			int x =stmt.executeUpdate("update Account set A_Name = 'Shivani', A_num = 3333454535 where A_Id = 4");

			System.out.println(x+" record updated");
			//step 5
			con.close();
			stmt.close();
		}
		catch (SQLException e) 
		{
			System.out.println("Error in sql query");
		}
	}
}