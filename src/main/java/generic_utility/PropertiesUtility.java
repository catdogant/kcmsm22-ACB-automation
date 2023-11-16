package generic_utility;

import java.io.FileInputStream;
import java.util.Properties;
/* THIS CLASS is for common data stored in properties file
 * @author pavani
 * 
 */

public class PropertiesUtility {
	/* this is generic method to fetch data from properties file
	 * @return
	 * @throws exception
	 */
public String getDataFromProperties(String data)throws Exception{
	FileInputStream fis=new FileInputStream(IconstantUtility.propertiespath);
	Properties pobj = new Properties();
	pobj.load(fis);
	String propertiesData = pobj.getProperty(data);
	return propertiesData;
	
}

}
