package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class AddTradesmanContact extends TestBase{
	
	public static final long TIMEOUT = 5000;
	public static final long TIMEOUT1 = 5000;
	@FindBy(how=How.XPATH, using="//a[@href='/tradesman/contacts']")
	List<WebElement> contacts;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'My Clients')]")
    WebElement contactsmore;
	@FindBy(how=How.XPATH, using="//span[contains(text(),' New Contact')]")
	WebElement addcontacts;
	
	@FindBy(xpath="//select[@placeholder='Select Contact Type']")
	WebElement Contact_Type;
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	WebElement Contact_email;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Add Contact')]")
	WebElement button_addcontact;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Next ')]")
	WebElement button_next;
	
	@FindBy(how=How.XPATH, using="//div[@class='ant-notification-notice-message']")
	WebElement alert_message;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Cancel')]")
	WebElement button_cancel;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	WebElement phoneno;
	
	@FindBy(xpath="//input[@class='ant-select-selection-search-input']")
	WebElement address;
	
	@FindBy(xpath="//span[contains(text(),'Create Contact')]")
	WebElement Create_Contact;
	
	public AddTradesmanContact() {
		PageFactory.initElements(driver, this);

	}
	public void addtradesmancontactofself() throws InterruptedException  {
		contacts.get(0).click();
		Thread.sleep(TIMEOUT);
		//contactsmore.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked contacts from Menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		contactsmore.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked contacts from Menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		addcontacts.click();
		Thread.sleep(TIMEOUT);
		Select dropdown27 = new Select(Contact_Type);
		Thread.sleep(TIMEOUT);
		List <WebElement> op27 = dropdown27.getOptions();
		Thread.sleep(TIMEOUT);
		 int size27 = op27.size();
		 for(int i =0; i<size27 ; i++){
	         String options = op27.get(i).getText();
	         System.out.println(options);
	      }
		 op27.get(0).click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has select contact type", ExtentColor.GREEN));
		 Contact_email.sendKeys("sayan011981@mailinator.com");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given email", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 button_next.click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked next", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 button_addcontact.click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked add contact", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
			/*
			 * Alert alert = driver.switchTo().alert(); // switch to alert
			 * 
			 * String alertMessage= driver.switchTo().alert().getText(); // capture alert
			 * message
			 * 
			 * System.out.println(alertMessage); // Print Alert Message
			 * Thread.sleep(TIMEOUT);
			 */
		 /* String message=alert_message.getText();
		 System.out.println(message);
		 Thread.sleep(TIMEOUT1); */
		 
		 // addcontactof_own
		 
			 
			 //addcontactof_notROC
			 
		
	}
	

}
