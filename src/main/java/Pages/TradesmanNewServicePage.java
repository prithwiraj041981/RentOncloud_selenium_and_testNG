package Pages;

import java.util.List;

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

public class TradesmanNewServicePage extends TestBase{
	
	public static final long TIMEOUT = 5000;
	public static final long TIMEOUT1 = 5000;
	@FindBy(how=How.XPATH, using="//a[@href='/tradesman/myservices']")
	List<WebElement> contacts;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'My Services')]")
    WebElement contactsmore;
	@FindBy(how=How.XPATH, using="//button[@class='btn-sm btn btn-secondary']")
	WebElement addnewservice;
	
	@FindBy(xpath="//select[@class='form-select']")
	List<WebElement> Category;
	
	@FindBy(xpath="//input[@placeholder='Title']")
	WebElement title;
	
	@FindBy(how=How.XPATH, using="//textarea[@name='description']")
	WebElement textareades;
	
	@FindBy(how=How.XPATH, using="//div[@class='ant-select-selection-overflow']")
	WebElement  skill;
	
	@FindBy(how=How.XPATH, using="//div[@class='ant-select-item-option-content']")
	List<WebElement> skill_message;
	
	@FindBy(how=How.XPATH, using="//input[@name='price']")
	WebElement serviceprice;
	
	@FindBy(xpath="//input[@name='serviceAlbumImage']")
	WebElement seviceimage;
	
	@FindBy(xpath="//button[@class='btn btn-secondary']")
	WebElement button_publish;
	
	
	
	public TradesmanNewServicePage() {
		PageFactory.initElements(driver, this);

	}
	public void addtradesmannewservice() throws InterruptedException  {
		contacts.get(0).click();
		Thread.sleep(TIMEOUT);
		contactsmore.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked Myservices from Menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		//contactsmore.click();
		
		addnewservice.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked New service", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		 WebElement categorymore=Category.get(0);
		Select dropdown28 = new Select(categorymore);
		Thread.sleep(TIMEOUT);
		List <WebElement> op28 = dropdown28.getOptions();
		Thread.sleep(TIMEOUT);
		 int size28 = op28.size();
		 for(int i =0; i<size28 ; i++){
	         String options = op28.get(i).getText();
	         System.out.println(options);
	      }
		 op28.get(1).click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has select category", ExtentColor.GREEN));
		 
		 Thread.sleep(TIMEOUT);
		 WebElement subcategory=Category.get(1);
		Select dropdown29 = new Select(subcategory);
		Thread.sleep(TIMEOUT);
		List <WebElement> op29 = dropdown29.getOptions();
		Thread.sleep(TIMEOUT);
		 int size29 = op29.size();
		 for(int i =0; i<size29 ; i++){
	         String options = op29.get(i).getText();
	         System.out.println(options);
	      }
		 op29.get(1).click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has select sub category", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 title.sendKeys("My x service of excellent");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given title of service", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 textareades.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given description of service", ExtentColor.GREEN));
		 skill.click();
		 Thread.sleep(TIMEOUT);
		 skill_message.get(0).click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has select skill", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 serviceprice.sendKeys("2000");
		 Thread.sleep(TIMEOUT);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,600)", "");
			
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given price of service", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 seviceimage.sendKeys("C:\\Screenshot\\capture2.png");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given Image of service", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 button_publish.click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked publish button", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has published the service", ExtentColor.GREEN));
}
}
