package TestCases;


import static org.testng.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.http.util.Asserts;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.LoginPage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;


/* this code is developed by prithwiraj */
/* this class is developed for validating Login to ROC */
public class LoginTest extends TestBase {

	
	  
	/* this code is developed for loading browser and ROC Login */
	@BeforeTest
	public void launchBrowser() throws IOException {
		TestBase tbase= new TestBase();
		tbase.Base_url();
		

		
		
		
	}
	/* this code is developed for validating Login to ROC */
	@Test(description="This is login validate")
	public void Validate() throws IOException {
		
		
		LoginPage log= new LoginPage();	
		log.Loginpageforlandlord();
		log.DashboardLandlordROC();
		
		
		//add content, manage tests etc

		
	}
	/* this class is developed for quiting driver */

	@AfterTest
	public void Closebrowser() throws IOException  {
		TestBase tbase= new TestBase();
		try {
			tbase.getScreenshot(driver, "C:\\Screenshot\\test.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ExtentDemo extentdemo= new ExtentDemo();
        
		Allure.addAttachment("Login Page", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		driver.quit();
	}
	

}






