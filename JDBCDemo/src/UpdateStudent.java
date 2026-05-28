import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		System.out.println("Error in loading Driver"+e);
		}
		 try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/25aug25ad?user=root&password=root");
			Statement stmt = con.createStatement();
			
			int x =stmt.executeUpdate("update Student set S_name = 'Shivani', S_marks = 67 where S_id = 4");			System.out.println(x+" record updated");
			//step 5
			con.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Error in Sql query");
		}
	}

}
