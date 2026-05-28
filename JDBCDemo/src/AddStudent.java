import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AddStudent {

	public static void main(String[] args) {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	System.out.println("Error in loading driver" +e);
}

   try {
	//step2
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/25aug25ad?user=root&password=root"); 
	 //step3
	 Statement stmt = con.createStatement();
	 //step4
	 int x = stmt.executeUpdate("insert into Student values(1,'Sona',89)");
	 x = x+stmt.executeUpdate("insert into Student values(2,'Son',69)");
	 x = x+stmt.executeUpdate("insert into Student values(3,'Soniya',59)");
	 x = x+stmt.executeUpdate("insert into Student values(4,'Sam',79)");
	 x = x+stmt.executeUpdate("insert into Student values(5,'Sneha',49)");
	 System.out.println("Data inserted successfully");
	 //step5
	 stmt.close();
	 con.close();
	
} catch (SQLException e) {
	System.out.println("Error in Sql query");
     }
	}

}
