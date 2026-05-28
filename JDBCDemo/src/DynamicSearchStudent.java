import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicSearchStudent {

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
			PreparedStatement ps = con.prepareStatement
			("select * from Student where S_id = ?");
			//step 4
			int S_id=0;
			
			Scanner s = new Scanner(System.in);
				System.out.println("Enter S-Id :");
				S_id = s.nextInt();
			
				ps.setInt(1, S_id);
				ResultSet rs = ps.executeQuery();
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
			//System.out.println(x+"Record Deleted Successfully");
			
			//step 5
			con.close();
			ps.close();
		}
		catch (SQLException e) 
		{
			System.out.println("Error in sql query");
		}
	}
}