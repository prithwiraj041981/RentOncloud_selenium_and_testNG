package TestCases;


import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


/* this code is developed by prithwiraj */
/* this class is developed for validating Login to ROC */
public class T001_login_page extends TestBase {

	
	/* this code is developed for user creation */
	/* this code is developed for loading browser and ROC Login */
	
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
		log.Loginpageforlandlord();
		log.DashboardLandlordROC();
		homepage.HomePageButtons();
		
		
		
		//add content, manage tests etc

		
	}
	/* this class is developed for quiting driver */


	

}






