package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LandlordReminderPage;
import Pages.LoginPage;
import Pages.SettingsPage;

public class T027_Landlord_Reminder_Page extends TestBase{
	
	/* this code is developed for loading browser and ROC Login */
	@BeforeClass
	public void launchBrowser() throws IOException {

		TestBase tbase= new TestBase();
		tbase.Base_url();
	}
	/* this code is developed for Home page validation */
	@Test(description="This is Home page validate")
	public void Validate() throws IOException, InterruptedException {
		LoginPage log= new LoginPage();	
		HomePage homepage= new HomePage();
		log.Loginpageforlandlord();
		log.DashboardLandlordROC();
		homepage.HomePageButtons();
		LandlordReminderPage settpage= new LandlordReminderPage();
		settpage.reminderpageforlandlord();
	}

}
