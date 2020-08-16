import java.sql.*;

public class DemoClass {
	
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uname = "root";
		String pass = "nir";
		
		//String query = "select name from student where id = 3";
		
		//String query = "select * from student";
		
		int id = 6;
		
		String name = "Deepali";
		
		//String query = "insert into student values (4, 'Mohini')";    // Inserting data in th etable
		
		// String query = "insert into student values(" + id + ", '" + name + " ')";
		
		String query = "insert into student values (?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		// Statement st = con.createStatement();
		
		PreparedStatement st = con.prepareStatement(query);
		
		st.setInt(1, id);
		st.setString(2,  name);
		
		// ResultSet rs = st.executeQuery(query);   // DDL, DML, DQL
		
		//int count  = st.executeUpdate(query);       // inserting data, int for rows affected.
		
		int count = st.executeUpdate();
		
		System.out.println(count + "row/s affected");
		
		// To fetch the whole table we need to use while loop.
		
		/*while(rs.next()) {
			//String name = rs.getString("name");
			String userData = rs.getInt(1) + " : " + rs.getString(2);
		
			System.out.println(userData);
		
		} */
		
		st.close();
		
		con.close();
		
		
		
		
	}

}
