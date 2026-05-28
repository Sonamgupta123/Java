import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateStudentTable {

	public static void main(String[] args) {
		try {
			//step 1: to activate driver
		Class.forName("com.mysql.cj.jdbc.Driver");	
		} catch (ClassNotFoundException e) {
          System.out.println("Error in loading driver: "+e);
		}
		try {
			//step2 : get connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/25aug25ad?user=root&password=root");
			//step3
			Statement stmt = con.createStatement();
			// step4
			stmt.executeUpdate("create table Student (S_id int primary key , S_name varchar(20), S_marks numeric(8,2))");
			System.out.println("Table Created Successfully");
			// step 5
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("Error in sql query");	
		}	

	}

}
