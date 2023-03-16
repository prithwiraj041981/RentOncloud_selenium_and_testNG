package Pages;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.http.util.Asserts;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.LogStatus;
import Base.TestBase;
import Utility.ReadExcelFile;

/* this code is developed by prithwiraj */
/* this class is developed for Login to application*/
public class LoginPage extends TestBase{
	static com.relevantcodes.extentreports.ExtentTest test;
	static com.relevantcodes.extentreports.ExtentTest test1;
	static com.relevantcodes.extentreports.ExtentReports report;
    static com.relevantcodes.extentreports.ExtentReports report1;
   

	public static final long TIMEOUT = 30;

	private static final String NULL = null;
	public static String Usernamefromexcel;
	public static String passwordfromexcel;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	/* this code is developed for identifying elements */
	@FindBy(xpath="//input[@name='email']")
	WebElement username;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginButton;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement enterbutton;

	@FindBy(xpath = "//h2[contains(text(),'Home')]")
	WebElement homepagename;
	
	/* this code is developed for entering to ROC */

	public void Loginpageforlandlord() throws IOException {
		report = new com.relevantcodes.extentreports.ExtentReports(System.getProperty("user.dir")+"//test-output//ExtentReportResults.html",false);
		test = report.startTest("ExtentDemo 1");
		test.setDescription("This is login Test");
		String Usernamefromexcel=ReadExcelFile.Readexcelusername();
		username.sendKeys(Usernamefromexcel);
		
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		String passwordfromexcel=ReadExcelFile.Readexcelpassword();
		password.sendKeys(passwordfromexcel);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		enterbutton.click();
		test.log(LogStatus.PASS, "Validate Login");
		test.log(LogStatus.PASS,test.addScreenCapture(capture(driver))+ "Test passed 1");
		//report.endTest(test);
		report.endTest(test);
		report.flush();
		
		
		//report.flush();
	}
	/* this code is developed for validate to enter to Dashboard */
	public void DashboardLandlordROC() throws IOException {
		if(report.getClass().toString()!=NULL) {
		//report = new com.relevantcodes.extentreports.ExtentReports(System.getProperty("user.dir")+"//test-output//ExtentReportResults.html");
		//test = report.startTest("ExtentDemo 2");
			test1 = report.startTest("ExtentDemo 2");
		test1.setDescription("This is Dashboard Test ");
		
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		String homePageHeading = homepagename.getText();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		Asserts.check(homePageHeading.equalsIgnoreCase("Home"), homePageHeading);
		System.out.println("User has successfully logged in");
		test1.log(LogStatus.PASS, "Validate Dashboard");
		test1.log(LogStatus.PASS,test1.addScreenCapture(capture(driver))+ "Test passed 2");
		report.endTest(test1);
		report.flush();
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
