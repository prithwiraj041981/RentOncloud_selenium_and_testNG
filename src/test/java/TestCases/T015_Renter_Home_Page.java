package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class T015_Renter_Home_Page extends TestBase{
	@BeforeClass
	public void launchBrowser() throws IOException {
		TestBase tbase= new TestBase();
		tbase.Base_url();
		

		
		
		
	}
	/* this code is developed for validating Login to ROC */
	@Test(description="This is login validate")
	public void Validate() throws IOException {
		
		
		LoginPage log= new LoginPage();	
		HomePage homepage= new HomePage();
		log.LoginpageforRenter();
		log.DashboardRenterROC();
		homepage.HomePageButtonsrenter();
		
		
		
		//add content, manage tests etc

		
	}


}
