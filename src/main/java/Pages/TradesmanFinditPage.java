package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class TradesmanFinditPage extends TestBase{

	public static final long TIMEOUT = 5000;
	public static final long TIMEOUT1 = 5000;
	@FindBy(how=How.XPATH, using="/tradesman/findit")
	List<WebElement> Findit;
	
	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-search-alt']")
    WebElement Finditmore;
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Make an Offer')]")
	List<WebElement> makeanoffer;
	
	@FindBy(xpath="//input[@placeholder='Enter an amount']")
	WebElement Enter_an_amount;
	
	@FindBy(xpath="//button[@class='btn btn-secondary']")
	WebElement Button_submit;
	
	public TradesmanFinditPage() {
		PageFactory.initElements(driver, this);

	}
	public void tradesmanMakeanoffer() throws InterruptedException  {
		//Findit.get(0).click();
		//Thread.sleep(TIMEOUT);
		Finditmore.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked Find it from Menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		makeanoffer.get(0).click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked make an offer", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Enter_an_amount.sendKeys("2000");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has given amount of offer", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Button_submit.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has submitted the offer", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		
	}
}
