package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class Renter_SettingsPage extends TestBase{
	
	public static final long TIMEOUT = 5000;
    /*identifying elements*/
	@FindBy(how=How.XPATH, using="//div[@class='align-items-center row m-0']")
	WebElement settingsphoto;
	
	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-settings mr-2 f-14']")
	WebElement profile;
	
	public Renter_SettingsPage() {
		PageFactory.initElements(driver, this);

	}
	
	public void settingspageforrenter() throws InterruptedException  {
		Thread.sleep(TIMEOUT);
		settingsphoto.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked settings from Menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		profile.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User is navigating to profile page", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has reached to profile page", ExtentColor.GREEN));
	}

}
