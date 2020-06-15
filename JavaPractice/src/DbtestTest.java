import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DbtestTest {

  @Test
  public void dbTestTest() throws SQLException {
 // TODO Auto-generated method stub
 		String host="TRVL3567PN2\\MSSQL2016";
 		int port=53256;
 		String dbname="SERVICE";
 		String ConnectionURL= "jdbc:mssql://"+host+":"+port+"/"+dbname;
 		String query="select * from BorrowerEmailAddress where LoanID='0000000021'";
 		Connection con=DriverManager.getConnection(ConnectionURL, "sa", "vxs@123db");
 		Statement s=con.createStatement();
 		ResultSet rs=s.executeQuery(query);
 		while(rs.next())
 		{
 			System.out.println(rs.getString("UserName"));
 		}
 		
  }
}
