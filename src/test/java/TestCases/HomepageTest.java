package TestCases;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
/* this code is developed by prithwiraj */
/* this class is developed for Home page */
public class HomepageTest extends TestBase{
	/* this code is developed for loading browser and ROC Login */
	@BeforeTest
	public void launchBrowser() throws IOException {

		TestBase tbase= new TestBase();
		tbase.Base_url();
	}
	/* this code is developed for Home page validation */
	@Test(description="This is Home page validate")
	public void Validate() throws IOException {
		LoginPage log= new LoginPage();	
		HomePage homepage= new HomePage();
		log.Loginpageforlandlord();
		log.DashboardLandlordROC();
		homepage.HomePageButtons();
	}
	/* this class is developed for quiting driver */
	

	@AfterTest
	public void Closebrowser()  {

		
		     
		Allure.addAttachment("Home Page", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		driver.quit();
	}
}
