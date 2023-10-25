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

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;
import Utility.ReadExcelFile;

/* this code is developed by prithwiraj */
/* this class is developed for Login to application*/
public class LoginPage extends TestBase{

   

	public static final long TIMEOUT = 5000;

	
	public static String Usernamefromexcel;
	public static String passwordfromexcel;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	/* this code is developed for identifying elements */
	//will be modified
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
	
	@FindBy(xpath = "//ol[contains(text(),'Dashboard')]")
	WebElement homepagedashboard;
	
	/* this code is developed for entering to ROC */

	public void Loginpageforlandlord() throws IOException {
		
		String Usernamefromexcel=ReadExcelFile.Readexcelusername();
		username.sendKeys(Usernamefromexcel);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully given username", ExtentColor.GREEN));
		
		
		
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		loginButton.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully click login button", ExtentColor.GREEN));
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		String passwordfromexcel=ReadExcelFile.Readexcelpassword();
		password.sendKeys(passwordfromexcel);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully given password", ExtentColor.GREEN));
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		enterbutton.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully enter roc", ExtentColor.GREEN));
		
		
		
		//report.flush();
	}
	/* this code is developed for validate to enter to Dashboard */
	public void DashboardLandlordROC() throws IOException {
		
		
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		String homePageHeading = homepagename.getText();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		Asserts.check(homePageHeading.equalsIgnoreCase("Home"), homePageHeading);
		System.out.println("User has successfully logged in");
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully logged in", ExtentColor.GREEN));
		
		
		
	}
	
public void LoginpageforRenter() throws IOException {
		
		String Usernamefromexcel=ReadExcelFile.RenterReadexcelusername();
		username.sendKeys(Usernamefromexcel);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully given username", ExtentColor.GREEN));
		
		
		
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		loginButton.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully click login button", ExtentColor.GREEN));
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		String passwordfromexcel=ReadExcelFile.RenterReadexcelpassword();
		password.sendKeys(passwordfromexcel);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully given password", ExtentColor.GREEN));
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		enterbutton.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully enter roc", ExtentColor.GREEN));
		
		
		
		//report.flush();
	}
	/* this code is developed for validate to enter to Dashboard */
	public void DashboardRenterROC() throws IOException {
		
		
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		String homePageHeading = homepagedashboard.getText();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		Asserts.check(homePageHeading.equalsIgnoreCase("Dashboard"), homePageHeading);
		System.out.println("User has successfully logged in");
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully logged in", ExtentColor.GREEN));
		
		
		
	}
	
	
public void LoginpageforTradesman() throws IOException {
		
		String Usernamefromexcel=ReadExcelFile.TradesmanReadexcelusername();
		username.sendKeys(Usernamefromexcel);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully given username", ExtentColor.GREEN));
		
		
		
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		loginButton.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully click login button", ExtentColor.GREEN));
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		String passwordfromexcel=ReadExcelFile.TradesmanReadexcelpassword();
		password.sendKeys(passwordfromexcel);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully given password", ExtentColor.GREEN));
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		enterbutton.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully enter roc", ExtentColor.GREEN));
		
		
		
		//report.flush();
	}
	/* this code is developed for validate to enter to Dashboard */
	public void DashboardTradesmanROC() throws IOException {
		
		
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		String homePageHeading = homepagedashboard.getText();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		Asserts.check(homePageHeading.equalsIgnoreCase("Home"), homePageHeading);
		System.out.println("User has successfully logged in");
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully logged in", ExtentColor.GREEN));
		
		
		
	}
	
	
	
	
	
	
	
	public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\extentreportscreenshot\\" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
	}




}
