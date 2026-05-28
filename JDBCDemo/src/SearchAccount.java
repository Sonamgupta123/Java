import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchAccount {

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
			ResultSet rs = 
			stmt.executeQuery("select * from Account where A_Id = 2");
	
			if(rs.next()==true)
			{
				System.out.println("A-Id = "+rs.getInt("A_Id"));
				System.out.println("A-Name = "+rs.getString("A_Name"));
				System.out.println("Account_Num = "+rs.getDouble("A_num"));
			}
			else
			{
				System.out.println("Record Not Found");
			}

			
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