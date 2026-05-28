import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicUpdateEmployee{

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
			("update Employee set emp_name = ?,emp_salary = ? where emp_id = ?");
			//step 4
			int emp_id=0;
			double emp_salary;
			String emp_name;
			int x=0;
			Scanner s = new Scanner(System.in);
				System.out.println("Enter E-Id :");
				emp_id = s.nextInt();
				System.out.println("Enter E-Name :");
				emp_name = s.next();
				System.out.println("Enter E-salary :");
				emp_salary = s.nextDouble();
			
				ps.setString(1, emp_name);
				ps.setDouble(2, emp_salary);
				ps.setInt(3, emp_id);
				x =x+ps.executeUpdate();
			System.out.println(x+"Record Updated Successfully");
			
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