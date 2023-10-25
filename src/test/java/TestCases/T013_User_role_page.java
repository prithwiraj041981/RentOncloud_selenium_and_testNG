package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ChartofaccountPage;
import Pages.LoginPage;
import Pages.UserrolePage;

public class T013_User_role_page extends TestBase {
	
	@BeforeClass
	public void launchBrowser() throws IOException {

		TestBase tbase= new TestBase();
		tbase.Base_url();
	}
	/* this code is developed for Home page validation */
	@Test(description="This is Home page validate")
	public void Validate() throws IOException, InterruptedException {
		LoginPage log= new LoginPage();	
		log.Loginpageforlandlord();
		log.DashboardLandlordROC();
		UserrolePage userrole= new UserrolePage();
		userrole.Userrolemanagerpage();
		userrole.Userroleaccountpage();
		userrole.Userroleviewerpage();
	}

}
