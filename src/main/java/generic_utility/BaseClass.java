package generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPagePom;
import objectRepository.Vtiger_HomePagePom;

public class BaseClass {
    public DataBaseUtility DUTIL =new DataBaseUtility();
	public PropertiesUtility PUTIL = new PropertiesUtility();
	
	public  static WebDriver driver = null;
	 @BeforeSuite
	 public void dbconnection() throws Exception{
		 DUTIL.establishConnection();
		  System.out.println("DataBase connected successfull !!");
		 
	 }
@BeforeClass(alwaysRun = true)
public void launchingBrowser() throws Exception  {
	WebDriverUtility WUTIL = new WebDriverUtility();
	  String URL = PUTIL.getDataFromProperties("url");
	  WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(URL);
	  WUTIL.implicitwaitinScript(driver);
	  WUTIL.maximizeWindow(driver);
	  System.out.println("Launced successfull !!");
	  
}
	@BeforeMethod(alwaysRun=true)
	public void loginOperation() throws Exception{
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");
		LoginPagePom LP = new LoginPagePom(driver);
		LP.loginoperation(USERNAME, PASSWORD);
		  System.out.println("Login successfull !!");
		
	}
@AfterMethod(alwaysRun = true)
public void logoutOperation() {
	Vtiger_HomePagePom HP =new Vtiger_HomePagePom(driver);
	HP.signout();
	  System.out.println("Logout successfull !!");
	
}
@AfterClass(alwaysRun = true)
public void  closeBrowser() {
	driver.close();
	  System.out.println("closed browser successfull !!");
	
}
@AfterSuite
public void closedbconnection() throws Exception {
	DUTIL.closeConnection();
	  System.out.println("DateBase connection closed successfull !!");
}
}
