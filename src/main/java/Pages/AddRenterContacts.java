package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class AddRenterContacts  extends TestBase{
	
	public static final long TIMEOUT = 5000;
	public static final long TIMEOUT1 = 5000;
	@FindBy(how=How.XPATH, using="//a[@href='/renter/contacts']")
	List<WebElement> contacts;
	
	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-users-alt']")
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
	
	public AddRenterContacts() {
		PageFactory.initElements(driver, this);

	}
	public void addrentercontactofself() throws InterruptedException  {
		contacts.get(0).click();
		Thread.sleep(TIMEOUT);
		contactsmore.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked contacts from Menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		addcontacts.click();
		Thread.sleep(TIMEOUT);
		Select dropdown23 = new Select(Contact_Type);
		Thread.sleep(TIMEOUT);
		List <WebElement> op23 = dropdown23.getOptions();
		Thread.sleep(TIMEOUT);
		 int size = op23.size();
		 for(int i =0; i<size ; i++){
	         String options = op23.get(i).getText();
	         System.out.println(options);
	      }
		 op23.get(0).click();
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
	
	public void addcontactof_own() throws InterruptedException {
		
		contacts.get(0).click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked contacts from Menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		addcontacts.click();
		Thread.sleep(TIMEOUT);
		Select dropdown4 = new Select(Contact_Type);
		Thread.sleep(TIMEOUT);
		List <WebElement> op4 = dropdown4.getOptions();
		Thread.sleep(TIMEOUT);
		 int size4 = op4.size();
		 for(int i =0; i<size4 ; i++){
	         String options = op4.get(i).getText();
	         System.out.println(options);
	      }
		 op4.get(0).click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has select contact type", ExtentColor.GREEN));
		 Contact_email.sendKeys("sayan011981@mailinator.com");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given email", ExtentColor.GREEN));
		 button_next.click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked next", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked next", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 button_addcontact.click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked add contact", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 /* String message1=alert_message.getText();
		 System.out.println(message1);
		 Thread.sleep(TIMEOUT1);*/
		 button_cancel.click();
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked cancel", ExtentColor.GREEN));
	}
	
	public void addcontactof_notROC() throws InterruptedException{
		Thread.sleep(TIMEOUT);
		 Contact_email.clear();
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clear email", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 Contact_email.sendKeys("sayan01981@mailinator.com");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered email", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 button_next.click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked next", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 firstname.sendKeys("ranabir");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered first name", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 lastname.sendKeys("ranabir");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered last name", ExtentColor.GREEN));
		 phoneno.sendKeys("6289353445");
		 Thread.sleep(TIMEOUT);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1200)", "");
			Thread.sleep(TIMEOUT);
		 address.sendKeys("aa");
			Thread.sleep(500);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered property address", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
			
			WebElement autoOptions = driver.findElement(By.xpath("//div[@class='ant-space-item']"));
			Thread.sleep(TIMEOUT);
		   
			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("span"));
			Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered property from auto location", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			optionsToSelect.get(0).click();
			Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered property from auto location", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 Create_Contact.click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered create contact", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
	}
		
	

}
