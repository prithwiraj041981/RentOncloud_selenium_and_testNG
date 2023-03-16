package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import Base.TestBase;

/* this code is developed by prithwiraj */
/* this class is developed For Dashboard recognation */
public class HomePage extends TestBase {
	
	static com.relevantcodes.extentreports.ExtentTest test;
	static com.relevantcodes.extentreports.ExtentTest test1;
	static com.relevantcodes.extentreports.ExtentReports report;
    static com.relevantcodes.extentreports.ExtentReports report1;

	public static final long TIMEOUT = 30;
	private static final String NULL = null;
	public static String Usernamefromexcel;
	public static String passwordfromexcel;

	public HomePage() {

		PageFactory.initElements(driver, this);

	}
	/*identifying elemnts*/
	@FindBy(xpath="//input[@name='email']")
	WebElement username;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginButton;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement enterbutton;

	@FindBy(xpath = "//button[contains(text(),'Update Profile')]")
	WebElement Update_Profile;

	@FindBy(xpath = "//a[contains(text(),'View My Webpage')]")
	WebElement Activate_webpage;

	/*identifying home page text and home page dashboard */
	public void HomePageButtons() throws IOException{

		try {
			Boolean homepagebuttons=Update_Profile.isDisplayed() && Activate_webpage.isDisplayed();
			System.out.println(homepagebuttons);
			if(homepagebuttons) {
				report = new com.relevantcodes.extentreports.ExtentReports(System.getProperty("user.dir")+"//test-output//ExtentReportResults.html",false);
				test = report.startTest("ExtentDemo 3");
				test.setDescription("This is HOME page Test");
				System.out.println("Home page has Update Profile and Activate webpage buttons");	
				if(report.getClass().toString()!=NULL) {
				test.log(LogStatus.PASS, "Validate Home Page");
				test.log(LogStatus.PASS,test.addScreenCapture(capture(driver))+ "Test passed 3");
				//report.endTest(test);
				report.endTest(test);
				report.flush();
			}
			}

		} catch(Exception e) {

			System.out.println("User is not in Home page.");
			
			report = new com.relevantcodes.extentreports.ExtentReports(System.getProperty("user.dir")+"//test-output//ExtentReportResults.html",false);
			test = report.startTest("ExtentDemo 3");
			test.setDescription("This is HOME page Test");
			if(report.getClass().toString()!=NULL) {
			test.log(LogStatus.FAIL, "Validate Home page");
			test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Test passed 3");
			//report.endTest(test);
			report.endTest(test);
			report.flush();
		}
		}
	}
	public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\extentreportscreenshot\\" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
	}
}



