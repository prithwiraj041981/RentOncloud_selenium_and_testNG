package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class TradesmanReminderPage extends TestBase{
	
	public static final long TIMEOUT = 5000;
    /*identifying elements*/
	@FindBy(how=How.XPATH, using="//div[@class='align-items-center row m-0']")
	WebElement settingsphoto;
	
	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-calendar-day f-14 mr-2']")
	WebElement calender;
	
	@FindBy(how=How.XPATH, using="//button[@class='btn btn-secondary']")
	WebElement addreminder;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Please select date']")
	WebElement Reminder_Date;
	
	@FindBy(how=How.XPATH, using="//a[@class='ant-picker-today-btn']")
	WebElement today_Date;
	
	@FindBy(how=How.XPATH, using="//textarea[@name='event']")
	WebElement reminder_message;
	
	@FindBy(how=How.XPATH, using="//button[@class='btn btn-primary']")
	WebElement save_reminder;
	
	public TradesmanReminderPage() {
		PageFactory.initElements(driver, this);

	}
	
	public void reminderpagefortradesman() throws InterruptedException  {
		settingsphoto.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked settings from Menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		calender.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked calender link", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		addreminder.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked add reminder button", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Reminder_Date.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is selecting today date", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		today_Date.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected today's date", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		reminder_message.sendKeys("My x reminder");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has added reminder message", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		save_reminder.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has added reminder ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
	}

}
