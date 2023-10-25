package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Renter_SettingsPage;
import Pages.Tradesman_settings_page;

public class T022_Tradesman_settings_Page extends TestBase{
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
		log.LoginpageforTradesman();
		log.DashboardTradesmanROC();
		homepage.HomePageButtonstradesman();
		Tradesman_settings_page settpagetradesman= new Tradesman_settings_page();
		settpagetradesman.settingspagefortradesman();
		
		
		
		//add content, manage tests etc

		
	}
}
