package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class RenterMyrentalPage extends TestBase{
	public static final long TIMEOUT = 5000;
    /*identifying elements*/
	@FindBy(how=How.XPATH, using="//a[@href='/renter/myrental']")
	WebElement menu_myrental;

	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-plus-small align-middle']")
	WebElement invitelandlord;

	@FindBy(how=How.XPATH, using="//div[@class='row']/div[1]/div/div[2]/div/div/span[1]/input")
	WebElement propertylocation;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='First Name']")
	WebElement firstname;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Email']")
	WebElement emailname;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='phone']")
	WebElement phonename;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Next')]")
	WebElement button_next;
	
	
	public RenterMyrentalPage() {
		PageFactory.initElements(driver, this);

	}
	public void addRenterMyrental() throws IOException, InterruptedException  {
		menu_myrental.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked My rental from menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		invitelandlord.click();
		
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked Invite landlord", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		firstname.sendKeys("prithwiraj");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has given firstname", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		lastname.sendKeys("bhowmik");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has given lastname", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		emailname.sendKeys("sayan011981@mailinator.com");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has given emailname", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		phonename.click();
		Thread.sleep(TIMEOUT);
		phonename.sendKeys("6289353445");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has given phonename", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		button_next.click();
		
	}
	}

