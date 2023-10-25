package Pages;

import java.io.IOException;
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

public class NewTaskPage extends TestBase{
	public static final long TIMEOUT = 5000;
	public static final long TIMEOUT1 = 5000;
	

	@FindBy(xpath="//a[@href='/landlord/fixit']")
	WebElement Fixit;
	
	@FindBy(xpath="//button[@class='btn-sm btn btn-secondary']")
	WebElement AddTask;
	
	@FindBy(xpath="//select[@name='propertyId']")
	WebElement select_property;
	
	@FindBy(xpath="//span[contains(text(),'Weekdays')]")
	WebElement weekdays;
	
	@FindBy(xpath="//span[contains(text(),'Morning 8 am - 12 pm')]")
	WebElement Time_Availability;
	
	@FindBy(xpath="//button[@class='btn btn-warning  pull-right']")
	WebElement button_next;
	
	@FindBy(xpath="//div[@class='card--task']")
	List<WebElement> Main_Category;
	
	@FindBy(xpath="//select[@placeholder='Choose Sub Category Or Issue']")
	WebElement Sub_Category;
	
	@FindBy(xpath="//button[@class='btn btn-warning  btn btn-primary']")
	WebElement button_next1;
	
	@FindBy(xpath="//input[@name='title']")
	WebElement Title_of_the_Task;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement details_of_the_Task;
	
	@FindBy(xpath="//div[@class='radio-item low']")
	WebElement Task_Priority;
	
	@FindBy(xpath="//input[@placeholder='Estimated Amount']")
	WebElement Budget_Amount;
	
	@FindBy(xpath="//button[@class='btn btn-warning   btn btn-primary']")
	WebElement button_next2;
	
	@FindBy(xpath="//button[@class='btn btn-warning btn btn-primary']")
	WebElement button_post;
	
	@FindBy(xpath="//input[@accept='image/*']")
	WebElement Upload_photo;
	
	public NewTaskPage() {
		PageFactory.initElements(driver, this);

	}
	
	public void Createnewtask() throws IOException, InterruptedException{
		Fixit.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked Fixit from menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		AddTask.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked Add New Task", ExtentColor.GREEN));
		Select dropdown10 = new Select(select_property);
		List <WebElement> op10 = dropdown10.getOptions();
		 int size10 = op10.size();
		 for(int i =0; i<size10 ; i++){
	         String options = op10.get(i).getText();
	         System.out.println(options);
	      }
		 op10.get(1).click();
		 Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has added property", ExtentColor.GREEN));
			weekdays.click();
			
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has Clicked weekdays", ExtentColor.GREEN));
			
			Time_Availability.click();
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has Clicked Time_Availability", ExtentColor.GREEN));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button_next);
			Thread.sleep(500);
			button_next.click();
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has Clicked next", ExtentColor.GREEN));
			Thread.sleep(5000);
			Main_Category.get(0).click();
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected main category", ExtentColor.GREEN));
			Select dropdown11 = new Select(Sub_Category);
			List <WebElement> op11 = dropdown11.getOptions();
			 int size11 = op11.size();
			 for(int i =0; i<size11 ; i++){
		         String options = op11.get(i).getText();
		         System.out.println(options);
		      }
			 op11.get(1).click();
			 Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected sub category", ExtentColor.GREEN));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button_next1);
				Thread.sleep(500);
				button_next1.click();
				
				 Thread.sleep(TIMEOUT);
					logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked next Button", ExtentColor.GREEN));
					Title_of_the_Task.sendKeys("New Task 3");
					 Thread.sleep(TIMEOUT);
						logger.log(Status.PASS, MarkupHelper.createLabel(" User has given Title_of_the_Task", ExtentColor.GREEN));
					details_of_the_Task.sendKeys("What are the details: What are the details:");
					
					Thread.sleep(TIMEOUT);
					logger.log(Status.PASS, MarkupHelper.createLabel(" User has given details_of_the_Task", ExtentColor.GREEN));
					Task_Priority.click();
					
					Thread.sleep(TIMEOUT);
					logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked Task_Priority", ExtentColor.GREEN));
					Budget_Amount.sendKeys("1000");
					Thread.sleep(TIMEOUT);
					logger.log(Status.PASS, MarkupHelper.createLabel(" User has given  Budget_Amount", ExtentColor.GREEN));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button_next2);
					Thread.sleep(500);
					button_next2.click();
					Thread.sleep(TIMEOUT);
					logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked  next", ExtentColor.GREEN));
					Thread.sleep(TIMEOUT);
					Upload_photo.sendKeys("C:\\Screenshot\\capture2.png");
					Thread.sleep(TIMEOUT);
					logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked  Upload_photo", ExtentColor.GREEN));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button_post);
					Thread.sleep(500);
					button_post.click();
					Thread.sleep(TIMEOUT);
					logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked  post button", ExtentColor.GREEN));
					
	}

}
