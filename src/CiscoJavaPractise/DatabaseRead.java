package CiscoJavaPractise;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseRead {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qatest", "root", "hanuman@2024");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employee where id='101'");
		rs.next();
		System.out.println(rs.getString("name"));
		 
	}

}
