package generic_utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*this class is used to create methods for db connection
 * 
 */

public class DataBaseUtility {
	public Connection c = null;
	/* This method is use to establish the connection
	 * @throws Exception
	 * 
	 */
public void establishConnection()throws Exception {
	c=DriverManager.getConnection(IconstantUtility.dbpath, IconstantUtility.dbusername, IconstantUtility.dbpass);
	
}
/*This method is use to close the connection
*@throws Exception
*/
public void closeConnection()throws Exception {
	c.close();
}

public String executeQuerryoperation(String qurrey,int colIndex ,String expData) throws Exception {
	
	boolean flag =false;

	ResultSet rs = c.createStatement().executeQuery(qurrey);
	 while(rs.next()) {
		 String actualData = rs.getString(colIndex);
		 
		 if(actualData.equals(expData)) {
			 flag = true;
			 break;
		 }
		 if(flag) {
			 System.out.println("expected data is :"+ expData);
			 return expData;
		 }
		 else
		 {
		 
		 }
			 System.out.println("data is not present");
			 return "";
		 }
	return expData;
	 }

}

