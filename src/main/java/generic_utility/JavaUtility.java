package generic_utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
		 public int createRandomNumber() {
			 Random r=new Random();
			 int num = r.nextInt(1000);
			 return num;
			 
}
		 public String getDateUsingCalender() {
			 Calendar cal =Calendar.getInstance();
			 Date  d =cal.getTime();
			 SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
			 String modifiedDate = sdf.format(d);
			 return modifiedDate;
		 }
}
