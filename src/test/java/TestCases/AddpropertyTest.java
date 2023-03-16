package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Addproperty;
import Pages.LoginPage;
/* this code is developed by prithwiraj */
/* this class is developed for test add property */
public class AddpropertyTest extends TestBase {
	/* this code is developed for loading browser and ROC Login */
	@BeforeTest
	public void launchBrowser() throws IOException {

		TestBase tbase= new TestBase();
		tbase.Base_url();
	}
	@Test(description="This is Add property validate")
	/* this code is developed for test add property */
	public void Validateproperty() throws IOException, InterruptedException
	{
		LoginPage log= new LoginPage();	
		log.Loginpageforlandlord();
		Addproperty addpro=new Addproperty(driver);
		addpro.addpropertyforlandlord();
	}
	/* this class is developed for quiting driver */
	@AfterTest
	public void Closebrowser()  {
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//Assert.assertFalse(true);

		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[2]/button")).click();

		//Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		driver.quit();

	}

}
