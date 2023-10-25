package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RenterMyrentalPage;

public class T016_Renter_My_Rental_Page extends TestBase{
	@BeforeClass
	public void launchBrowser() throws IOException {
		TestBase tbase= new TestBase();
		tbase.Base_url();
		

		
		
		
	}
	/* this code is developed for validating Login to ROC */
	@Test(description="This is login validate")
	public void Validate() throws IOException, InterruptedException {
		
		
		LoginPage log= new LoginPage();	
		HomePage homepage= new HomePage();
		RenterMyrentalPage myrental= new RenterMyrentalPage();
		log.LoginpageforRenter();
		log.DashboardRenterROC();
		homepage.HomePageButtonsrenter();
		
		myrental.addRenterMyrental();
		
		
		
		//add content, manage tests etc

		
	}

}
