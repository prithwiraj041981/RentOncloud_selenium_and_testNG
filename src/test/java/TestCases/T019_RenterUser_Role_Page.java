package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RenterUserRolePage;
import Pages.UserrolePage;

public class T019_RenterUser_Role_Page extends TestBase {
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
		log.LoginpageforRenter();
		log.DashboardRenterROC();
		homepage.HomePageButtonsrenter();
		RenterUserRolePage userrole= new RenterUserRolePage();
		userrole.renterUserroleviewerpage();
	}
}
