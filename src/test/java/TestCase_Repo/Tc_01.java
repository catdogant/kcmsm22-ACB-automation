package TestCase_Repo;

import generic_utility.BaseClass;
import objectRepository.Vtiger_HomePagePom;

public class Tc_01  extends BaseClass{
	public void calendarmod() {
		Vtiger_HomePagePom HP = new Vtiger_HomePagePom(driver);
		HP.clickCalender();
	}

}
