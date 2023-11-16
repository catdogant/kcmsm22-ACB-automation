package generic_utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {
	/* This method is use to maximize the window
	 * @param driver
	 * 
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
/* this method is for implicit wait operation
 * @param driver
 */
	public void implicitwaitinScript(WebDriver driver) {
		   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	/* this method is use to wait for  particular webelement
	 * @param driver
	 * @param element
	 * 
	 */
	public void explicitwaitforAnElement(WebDriver driver,WebElement element) {
		   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element)); 
	}
	/* this method is use to wait to perform click operation on a particular webelement
	 * @param driver
	 * @param element
	 * 
	 */
	public void explicitwaitToAnElement(WebDriver driver,WebElement element) {
		   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element)); 
	}
	    //mouse actions 
	
	/* this method is use to move to particular element
	 * @param driver
	 * @param element
	 * 
	 */
	public void movingTowardsAnElement(WebDriver driver,WebElement element) {
		   
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/* this method is use to rightclick 
	 * @param driver
	 * 
	 * 
	 */
	public void rightClickoperation(WebDriver driver) {
		   
		Actions act = new Actions(driver);
		act.contextClick().perform(); 
	}
	/* this method is use toright click on  particular element
	 * @param driver
	 * @param element
	 * 
	 */
	public void rightClickoperation(WebDriver driver,WebElement element) {
		   
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/* this method is use to click on  particular element
	 * @param driver
	 * @param element
	 * 
	 */
	public void Clickoperation(WebDriver driver,WebElement element) {
		   
		Actions act = new Actions(driver);
		act.click(element).perform();
	}
	/* this method is use to click operation
	 * @param driver
	 * 
	 * 
	 */
	public void Clickoperation(WebDriver driver) {
		   
		Actions act = new Actions(driver);
		act.click().perform();
	}
	/* this method is use to Double click operation
	 * @param driver
	 * 
	 * 
	 */
	public void doubleClickoperation(WebDriver driver) {
		   
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
	/* this method is use to Doubleclick 
	 * @param driver
	 * @param element
	 * 
	 */
	public void doubleClickoperation(WebDriver driver,WebElement element) {
		   
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	/* this method is use to drag and drop operation
	 * @param driver
	 * @param src
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement target) {
		   
		Actions act = new Actions(driver);
		act.dragAndDrop(src,target).perform(); 
	}
	/* this method is use to drag and drop by operation
	 * @param driver
	 * @param src
	 * @param x axis
	 * @param y axis
	 */
	public void dragAndDropSlider(WebDriver driver,WebElement src,int x,int y) {
		   
		Actions act = new Actions(driver);
		act.dragAndDropBy(src,x,y).perform(); 
	}
	/* this method is use to scroll to element operation
	 * @param driver
	 * @param element
	 * 
	 */
	public void scrollToElement(WebDriver driver,WebElement element) {
		   
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform(); 
	}
	     //alert popup method
	/* this method is use to accept  alert
	 * @param driver
	 * 
	 * 
	 */
	public void acceptAlert(WebDriver driver) {
		   
		driver.switchTo().alert() .accept();
	}
	/* this method is use to dismiss  alert
	 * @param driver
	 * 
	 * 
	 */
	public void dismissAlert(WebDriver driver) {
		   
		driver.switchTo().alert() .dismiss();
	}
	/* this method is use to FETCH  alert MSG
	 * @param driver
	 * 
	 * 
	 */
	public void fecthAlertMsg(WebDriver driver) {
		   
		driver.switchTo().alert() .getText();
	}
	      //frame pop up
	/* this method is use to switch to frame based on index value
	 * @param driver
	 * 
	 * 
	 */
	public void switchToFrameByIndex(WebDriver driver,int index) {
		   
		driver.switchTo().frame(index);
	}
	/* this method is use to switch to frame based on name
	 * @param driver
	 * 
	 * 
	 */
	public void switchToFrameByName(WebDriver driver,String name) {
		   
		driver.switchTo().frame(name);
	}
	/* this method is use to switch to frame based on element
	 * @param driver
	 * 
	 * 
	 */
	public void switchToFrameByName(WebDriver driver,WebElement  element) {
		   
		driver.switchTo().frame(element);
	}
	/* this method is use to switch to the immediate parent
	 * @param driver
	 * 
	 * 
	 */
	public void switchToImmediateParent(WebDriver driver) {
		   
		driver.switchTo().parentFrame();
	}
	/* this method is use to switch to the main frame
	 * @param driver
	 * 
	 * 
	 */
	public void switchToMainFrame(WebDriver driver) {
		   
		driver.switchTo().defaultContent();
	}
	
	//scroll down method
	/* this method is use to perform Scroll down operation bases on js
	 * @param driver
	 *  @param jsValue
	 * 
	 */
	public void scrollDownOperation(WebDriver driver,String jsValue) {
		   
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript(jsValue);
	}
	
	//Window popUp
	/* this method is use to perform switching operations in between windows
	 * @param driver
	 *  @param ParentId
	 * 
	 */
	public void switchToWindow(WebDriver driver,String ParentId) {
		   
		Set<String> childIds = driver.getWindowHandles();
		Iterator<String>itr=childIds.iterator();
		
		while(itr.hasNext()) {
			String IDS = itr.next();
			String ALLIDS = driver.switchTo().window(IDS).getTitle();
			
			if(ParentId.contains(ALLIDS)) {
				break;
			}
		}
		
		}
	//Screenshot
	/* this method is  to capture Screenshot
	 * @param driver
	 *  @param ScreenshotName
	 *  @return
	 *  @throws Exception
	 * 
	 */
	public String screenShotCaptureMetod(WebDriver driver,String ScreenShotName) throws Exception {
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File src =ts.getScreenshotAs(OutputType.FILE);
		 String path =".\\Screenshot"+ScreenShotName+".png";
		 File dest = new File(path);
		 Files.copy(src, dest);
		return path;
	}
	//CLICK 
		/*   customize Wait to click an  element
		 * @param element
		 *  @param Exception
		 * 
		 */
	public void customizeClickOnElement(WebElement element) throws Exception {
		int count = 1;
		while(count<10) {
		
			try {
				element.click();
				break;
			}
			catch(Exception e) {
				Thread.sleep(2000);
				count++;
			}
			
		}
	}
	
	
	
}
