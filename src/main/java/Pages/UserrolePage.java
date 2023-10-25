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

public class UserrolePage extends TestBase{
	
	public static final long TIMEOUT = 5000;
	@FindBy(how=How.XPATH, using="//div[@class='align-items-center row m-0']")
	WebElement settingsphoto;
	
	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-settings mr-2 f-14']")
	WebElement profile;
	
	@FindBy(how=How.XPATH, using="//li[@class='active']")
	WebElement ctofacct;
	
	@FindBy(how=How.XPATH, using="//div[@class='profile__menu--listing']/ul/li/a[@href='/landlord/settings/userRole']")
	WebElement userrole;
	
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
	
	public UserrolePage() {
		PageFactory.initElements(driver, this);

	}
	public void Userrolemanagerpage() throws InterruptedException  {
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
		userrole.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is navigating to User role page", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		
		Thread.sleep(500);
		Portfolio_Manager.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is navigating to Portfolio_Manager page", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		
		Thread.sleep(500);
		Portfolio_Manager_email.get(1).sendKeys("prithwiraj021981@mailinator.com");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is given Portfolio_Manager_email ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Invite_User.get(1).click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is sent Portfolio_Manager invitation ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
	}
	
	public void Userroleaccountpage() throws InterruptedException  {
		
		
		accountrole.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is navigating to account role page", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		
		Portfolio_Manager_email.get(2).sendKeys("prithwiraj021981@mailinator.com");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is given Accountant_email ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Invite_User.get(2).click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is sent Accountant_email invitation ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
	}
	
	public void Userroleviewerpage() throws InterruptedException  {
		
		viewerrole.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is navigating to viewerrole page", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		
		Thread.sleep(500);
		Portfolio_Manager_email.get(3).sendKeys("prithwiraj021981@mailinator.com");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is given viewerrole_email ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Invite_User.get(3).click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is sent viewerrole invitation ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
	}

}
