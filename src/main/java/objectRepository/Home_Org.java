package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Org {
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createorganization;

	

	public Home_Org(WebDriver driver ) {
		
			
			PageFactory.initElements( driver,this);
					
	}
	public WebElement getCreateorganization() {
		return createorganization;
	}
	/*Business library for organization
	 * 
	 */
		public void clickcreate() {
			getCreateorganization().click();
		}

}
