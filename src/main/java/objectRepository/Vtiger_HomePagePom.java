package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Vtiger_HomePagePom {
	@FindBy(xpath="//a[text()='Calendar']")
	private WebElement calender;
	
	@FindBy(xpath="(//a[text()='Leads'])[1]")
	private WebElement Leads;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement organizations;
	
	@FindBy(xpath="(//a[text()='Contacts'])[1]")
	private WebElement contacts;
	
	@FindBy(xpath="(//a[text()='Opportunities'])[1]")
	private WebElement opportunities;
	

	@FindBy(xpath="(//a[text()='Products'])[1]")
	private WebElement products;
	

	@FindBy(xpath="(//a[text()='Documents'])[1]")
	private WebElement Documents;
	
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement home;
	
	@FindBy(xpath="(//td[@class='small'])[2]")
	private WebElement administrator;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;

	public Vtiger_HomePagePom(WebDriver driver) {
	
	PageFactory.initElements( driver,this);
			
	}

	public WebElement getCalender() {
		return calender;
	}

	public WebElement getLeads() {
		return Leads;
	}

	public WebElement getOrganizations() {
		return organizations;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getOpportunities() {
		return opportunities;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getDocuments() {
		return Documents;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getAdministrator() {
		return administrator;
	}

	public WebElement getSignout() {
		return signout;
	}
/*Business library for calendar
 * 
 */
	public void clickCalender() {
		getCalender().click();
	}
	/*Business library for leads
	 * 
	 */
		public void leads() {
			getLeads().click();
		}
		/*Business library for organization
		 * 
		 */
			public void organization() {
				getOrganizations().click();
			}
			/*Business library for contacts
			 * 
			 */
				public void contacts() {
					getContacts().click();
				}
			/*Business library for opportunities
				 * 
				 */
				public void opportunities() {
						getOpportunities().click();
					}
				/*Business library for products
				 * 
				 */
				public void products() {
						getProducts().click();
					}
				/*Business library for documents
				 * 
				 */
				public void documents() {
						getDocuments().click();
					}
				/*Business library for home
				 * 
				 */
				public void home() {
						getHome().click();
					}
				
				/*Business library for sign out
				 * 
				 */
				public void signout()
			
				{
					getAdministrator().click();
						getSignout().click();
					}

}
