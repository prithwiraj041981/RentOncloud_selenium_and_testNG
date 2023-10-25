package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class T021_Tradesman_Home_page extends TestBase{
	
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
		log.LoginpageforTradesman();
		log.DashboardTradesmanROC();
		homepage.HomePageButtonstradesman();
		
		
		
		//add content, manage tests etc

		
	}
	/* this class is developed for quiting driver */


}
