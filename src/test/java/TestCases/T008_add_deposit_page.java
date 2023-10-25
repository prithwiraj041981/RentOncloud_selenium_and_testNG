package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.AddContactspage;
import Pages.AddDepositpage;
import Pages.LoginPage;

public class T008_add_deposit_page extends TestBase{
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		TestBase tbase= new TestBase();
		tbase.Base_url();
		

		
		
		
	}
	/* this code is developed for validating Login to ROC */
	@Test(description="This is login validate")
	public void Validate() throws IOException, InterruptedException {
		
		
		LoginPage log= new LoginPage();	
		log.Loginpageforlandlord();
		log.DashboardLandlordROC();
		AddDepositpage adddepo= new AddDepositpage();
		adddepo.Createdeposit();
		
		
		//add content, manage tests etc

		
	}
	/* this class is developed for quiting driver */


}
