import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicSearchEmployee {

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
			("select * from Employee where emp_id = ?");
			//step 4
			int emp_id=0;
			
			Scanner s = new Scanner(System.in);
				System.out.println("Enter E-Id :");
				emp_id = s.nextInt();
			
				ps.setInt(1, emp_id);
				ResultSet rs = ps.executeQuery();
			if(rs.next()==true)
			{
				System.out.println("E-Id = "+rs.getInt("emp_id"));
				System.out.println("E-Name = "+rs.getString("emp_name"));
				System.out.println("E-salary = "+rs.getDouble("emp_salary"));
			}
			else
			{
				System.out.println("Record Not Found");
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