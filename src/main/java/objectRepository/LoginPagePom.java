package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom {
	@FindBy(xpath ="//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(xpath ="//input[@type='submit']")
	private  WebElement login;

	public LoginPagePom(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public void loginoperation(String user,String password) {
		getUsername().sendKeys(user);
		getPassword().sendKeys(password);
		getLogin().click();
	}

}
