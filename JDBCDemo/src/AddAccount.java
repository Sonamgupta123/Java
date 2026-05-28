import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddAccount {

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
			int x =stmt.executeUpdate("insert into Account values(1,'Shrushti',2344125366)");
x = x+stmt.executeUpdate("insert into Account values(2,'Sonam',2535677373)");
x = x+stmt.executeUpdate("insert into Account values(3,'Monika',5007845627)");
x = x+stmt.executeUpdate("insert into Account values(4,'Shivani',4004662282)");
x = x+stmt.executeUpdate("insert into Account values(5,'Shrivya',1203452220)");
			System.out.println(x+"Record Inserted Successfully");
			
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