package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Organization {
	
		
		
		
		@FindBy(xpath="(//input[@class='detailedViewTextBox'])[1]")
		private WebElement details;
		
		@FindBy(xpath="(//input[@value=\"  Save  \"])[2]")
		private WebElement save;

	

		
		public Create_Organization(WebDriver driver) {
			PageFactory.initElements( driver,this);
			
}

		public WebElement getDetails() {
			return details;
		}

		public WebElement getSave() {
			return save;
		}
		
			/*Business library for organization
			 * 
			 */
				public void organizationname(String names) {
					getDetails().sendKeys(names);
				}
				/*Business library for save
				 * 
				 */
					public void save() {
						getSave().click();
					}

					
				
		
		

	}
	


