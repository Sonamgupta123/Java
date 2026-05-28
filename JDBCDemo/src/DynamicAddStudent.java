import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicAddStudent {

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
				("insert into Student values(?,?,?)");
			//step 4
			int S_id=0;
			double S_marks;
			String S_name;
			int x=0;
			Scanner s = new Scanner(System.in);
			for(int i=1; i<=3; i++)
			{
				System.out.println("Enter S-Id :");
				S_id = s.nextInt();
				System.out.println("Enter S-Name :");
				S_name = s.next();
				System.out.println("Enter Marks :");
				S_marks = s.nextDouble();
				ps.setInt(1, S_id);
				ps.setString(2, S_name);
				ps.setDouble(3, S_marks);
				x =x+ps.executeUpdate();
			}
	
			System.out.println(x+"Record Inserted Successfully");
			
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