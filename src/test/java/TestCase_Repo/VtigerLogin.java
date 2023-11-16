package TestCase_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import generic_utility.PropertiesUtility;
import generic_utility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPagePom;
import objectRepository.Vtiger_HomePagePom;

public class VtigerLogin {
@Test
	public void checkLogin() throws Exception {
		PropertiesUtility PUTIL =new PropertiesUtility();
		String URL =PUTIL.getDataFromProperties("url");
		String USERNAME =PUTIL.getDataFromProperties("username");
		String PASSWORD  =PUTIL.getDataFromProperties("password");
		
		WebDriverUtility WUTIL =new WebDriverUtility();
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		WUTIL.implicitwaitinScript(driver);
		driver.get(URL);
		WUTIL.maximizeWindow(driver);
		LoginPagePom LPM =new LoginPagePom(driver);
		LPM.loginoperation(USERNAME, PASSWORD);
		
		Vtiger_HomePagePom vis=new Vtiger_HomePagePom(driver);
		
vis.getSignout();

}
}
