import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchStudent {

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
			stmt.executeQuery("select * from Student where S_id = 2");
	
			if(rs.next()==true)
			{
				System.out.println("S-Id = "+rs.getInt("S_id"));
				System.out.println("S-Name = "+rs.getString("S_name"));
				System.out.println("Marks = "+rs.getDouble("S_marks"));
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