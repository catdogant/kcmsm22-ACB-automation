package TestCase_Repo;



import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.ExcelUtility;
import objectRepository.Create_Organization;
import objectRepository.Home_Org;

import objectRepository.Vtiger_HomePagePom;


public class S1 extends BaseClass {
	


@Test(alwaysRun = true)

	public void createorg() throws Exception {
 ExcelUtility  EUTIL= new ExcelUtility();
	 String name=EUTIL.getDataFromExcel("ORG", 1, 1);
	
		Vtiger_HomePagePom vt = new Vtiger_HomePagePom(driver);
		vt.organization();
				
		Home_Org ho =new Home_Org (driver);
		ho.clickcreate();
		
Create_Organization sce =new Create_Organization(driver);
		 sce.organizationname(name);	
		sce.save();
		 
	
	}
}