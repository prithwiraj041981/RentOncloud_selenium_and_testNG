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

public class ChartofaccountPage extends TestBase{
	
	public static final long TIMEOUT = 5000;
	@FindBy(how=How.XPATH, using="//div[@class='align-items-center row m-0']")
	WebElement settingsphoto;
	
	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-settings mr-2 f-14']")
	WebElement profile;
	
	@FindBy(how=How.XPATH, using="//li[@class='active']")
	WebElement ctofacct;
	
	@FindBy(how=How.XPATH, using="//div[@class='profile__menu--listing']/ul/li/a[@href='/landlord/settings/chartOfAccount']")
	WebElement chartaccount;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Add New')]")
	List<WebElement> addnew;
	
	@FindBy(xpath="//select[@name='accountType']")
	WebElement Account_Type;
	
	@FindBy(xpath="//select[@name='category']")
	WebElement Category;
	
	@FindBy(xpath="//input[@name='accountName']")
	WebElement name;
	
	@FindBy(xpath="//div[@class=' d-flex flex-wrap justify-content-end']/button[contains(text(),'Add')]")
	WebElement addbutton;
	
	public ChartofaccountPage() {
		PageFactory.initElements(driver, this);

	}
	
	public void chartofacctpage() throws InterruptedException  {
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
		chartaccount.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is navigating to chat of account page", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		addnew.get(0).click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked add new", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Select dropdown15 = new Select(Account_Type);
		Thread.sleep(TIMEOUT);
		List <WebElement> op15 = dropdown15.getOptions();
		Thread.sleep(TIMEOUT);
		 int size15 = op15.size();
		 for(int i =0; i<size15 ; i++){
	         String options = op15.get(i).getText();
	         System.out.println(options);
	      }
		 op15.get(1).click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected Account_Type ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 
		 Thread.sleep(TIMEOUT);
			Select dropdown16 = new Select(Category);
			Thread.sleep(TIMEOUT);
			List <WebElement> op16 = dropdown16.getOptions();
			Thread.sleep(TIMEOUT);
			 int size16 = op16.size();
			 for(int i =0; i<size16 ; i++){
		         String options = op16.get(i).getText();
		         System.out.println(options);
		      }
			 op16.get(1).click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected Category  ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 name.sendKeys("gst");
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given name of chart of account  ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 addbutton.click();
			 
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has created business expences account  ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 
			 
			 // business income
			
	}
	// business income
	 public void chartofacctedincome() throws InterruptedException {
		 Thread.sleep(TIMEOUT);
			addnew.get(0).click();
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked add new", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
			Select dropdown17 = new Select(Account_Type);
			Thread.sleep(TIMEOUT);
			List <WebElement> op17 = dropdown17.getOptions();
			Thread.sleep(TIMEOUT);
			 int size17 = op17.size();
			 for(int i =0; i<size17 ; i++){
		         String options = op17.get(i).getText();
		         System.out.println(options);
		      }
			 op17.get(2).click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected Account_Type ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 
			
				Select dropdown18 = new Select(Category);
				Thread.sleep(TIMEOUT);
				List <WebElement> op18 = dropdown18.getOptions();
				Thread.sleep(TIMEOUT);
				 int size18 = op18.size();
				 for(int i =0; i<size18 ; i++){
			         String options = op18.get(i).getText();
			         System.out.println(options);
			      }
				 op18.get(1).click();
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected Category  ", ExtentColor.GREEN));
				 Thread.sleep(TIMEOUT);
				 name.sendKeys("gst");
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given name of chart of account  ", ExtentColor.GREEN));
				 Thread.sleep(TIMEOUT);
				 addbutton.click();
				 
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has created chartofacctedincome  ", ExtentColor.GREEN));
				 Thread.sleep(TIMEOUT);
		 }
	 
	 public void chartofacctedcapitaloutflow() throws InterruptedException {
		 Thread.sleep(TIMEOUT);
			addnew.get(0).click();
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked add new", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
			Select dropdown19 = new Select(Account_Type);
			Thread.sleep(TIMEOUT);
			List <WebElement> op19 = dropdown19.getOptions();
			Thread.sleep(TIMEOUT);
			 int size19 = op19.size();
			 for(int i =0; i<size19 ; i++){
		         String options = op19.get(i).getText();
		         System.out.println(options);
		      }
			 op19.get(3).click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected Account_Type ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 
		
				Select dropdown20 = new Select(Category);
				Thread.sleep(TIMEOUT);
				List <WebElement> op20 = dropdown20.getOptions();
				Thread.sleep(TIMEOUT);
				 int size20 = op20.size();
				 for(int i =0; i<size20 ; i++){
			         String options = op20.get(i).getText();
			         System.out.println(options);
			      }
				 op20.get(1).click();
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected Category  ", ExtentColor.GREEN));
				 Thread.sleep(TIMEOUT);
				 name.sendKeys("gst");
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given name of chart of account  ", ExtentColor.GREEN));
				 Thread.sleep(TIMEOUT);
				 addbutton.click();
				 
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has created chartofacctedcapitaloutflow  ", ExtentColor.GREEN));
				 Thread.sleep(TIMEOUT);
		 }
	 
	 
	 public void chartofacctedcapitalinflow() throws InterruptedException {
		 Thread.sleep(TIMEOUT);
			addnew.get(0).click();
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked add new", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
			Select dropdown21 = new Select(Account_Type);
			Thread.sleep(TIMEOUT);
			List <WebElement> op21 = dropdown21.getOptions();
			Thread.sleep(TIMEOUT);
			 int size21 = op21.size();
			 for(int i =0; i<size21 ; i++){
		         String options = op21.get(i).getText();
		         System.out.println(options);
		      }
			 op21.get(4).click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected Account_Type ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 
			 
				Select dropdown22 = new Select(Category);
				Thread.sleep(TIMEOUT);
				List <WebElement> op22 = dropdown22.getOptions();
				Thread.sleep(TIMEOUT);
				 int size22 = op22.size();
				 for(int i =0; i<size22 ; i++){
			         String options = op22.get(i).getText();
			         System.out.println(options);
			      }
				 op22.get(1).click();
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected Category  ", ExtentColor.GREEN));
				 Thread.sleep(TIMEOUT);
				 name.sendKeys("gst");
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given name of chart of account  ", ExtentColor.GREEN));
				 Thread.sleep(TIMEOUT);
				 addbutton.click();
				 
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has created chartofacctedcapitalinflow  ", ExtentColor.GREEN));
				 Thread.sleep(TIMEOUT);
		 }


}
