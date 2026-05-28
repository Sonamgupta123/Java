import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DynamicGetAllEmployee {

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
			("select * from Employee");
			//step 4
				ResultSet rs = ps.executeQuery();
			while(rs.next()==true)
			{
				System.out.println("E-Id = "+rs.getInt("emp_id"));
				System.out.println("E-Name = "+rs.getString("emp_name"));
				System.out.println("salary = "+rs.getDouble("emp_salary"));
			}
			
			
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