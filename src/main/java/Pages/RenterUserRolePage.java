package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class RenterUserRolePage extends TestBase{
	public static final long TIMEOUT = 5000;
	@FindBy(how=How.XPATH, using="//div[@class='align-items-center row m-0']")
	WebElement settingsphoto;
	
	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-settings mr-2 f-14']")
	WebElement profile;
	
	@FindBy(how=How.XPATH, using="//li[@class='active']")
	WebElement ctofacct;
	
	@FindBy(how=How.XPATH, using="//a[@href='/renter/settings/userRole']")
	List<WebElement> userrole;
	
	@FindBy(how=How.XPATH, using="//h4[contains(text(),'Portfolio Manager')]")
	WebElement Portfolio_Manager;
	
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Enter Email Address']")
	List<WebElement> Portfolio_Manager_email;
	
	@FindBy(how=How.XPATH, using="//input[@value='Invite User']")
	List<WebElement> Invite_User;
	
	@FindBy(how=How.XPATH, using="//h4[contains(text(),'Accountant')]")
	WebElement accountrole;
	
	@FindBy(how=How.XPATH, using="//h4[contains(text(),'Viewer')]")
	WebElement viewerrole;
	
	public RenterUserRolePage() {
		PageFactory.initElements(driver, this);

	}
	
public void renterUserroleviewerpage() throws InterruptedException  {
	settingsphoto.click();
	Thread.sleep(TIMEOUT);
	logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked settings from Menu", ExtentColor.GREEN));
	Thread.sleep(TIMEOUT);
	profile.click();
	Thread.sleep(TIMEOUT);
	logger.log(Status.PASS, MarkupHelper.createLabel(" User is navigating to profile page", ExtentColor.GREEN));
	Thread.sleep(TIMEOUT);
    
	
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ctofacct);
	Thread.sleep(500);
	userrole.get(0).click();
	Thread.sleep(TIMEOUT);
	logger.log(Status.PASS, MarkupHelper.createLabel(" User is navigating to User role page", ExtentColor.GREEN));
	Thread.sleep(TIMEOUT);
	
		viewerrole.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is navigating to viewerrole page", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		
		Thread.sleep(500);
		Portfolio_Manager_email.get(0).sendKeys("prithwiraj021981@mailinator.com");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is given viewerrole_email ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Invite_User.get(0).click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is sent viewerrole invitation ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
	}


}
