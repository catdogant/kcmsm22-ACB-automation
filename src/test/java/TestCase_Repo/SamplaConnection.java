package TestCase_Repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import generic_utility.IconstantUtility;

public class SamplaConnection {
	 
	public static void main(String[] args) throws Exception {
		Connection c = null;
		/*establish connection*/
		try {
		
		c = DriverManager.getConnection(IconstantUtility.dbpath, IconstantUtility.dbusername,IconstantUtility.dbpass);
		/*create statement*/
		Statement s = c.createStatement();
		/*execute query*/
		ResultSet rs = s.executeQuery(null);
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
		
		
	}
		catch(Exception e) {
			
		}
		finally {
			c.close();
		}

}
}
