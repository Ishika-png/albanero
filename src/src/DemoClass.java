import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

//JDBC

/*
 * 1. import --> java.sql
 * 2. load and register the driver
 * 3. create connection
 * 4. create a statement
 * 5. execute the query
 * 6. process the results
 * 7. close
 */ 
public class DemoClass {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/ishika";
		String uname = "root";
		String pass = "";
		String query = "select username from student where userid=2";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = (ResultSet) st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("username");
		System.out.println(name);
		
		st.close();
		con.close();
	}

}
