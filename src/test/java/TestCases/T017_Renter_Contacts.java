package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.AddContactspage;
import Pages.AddRenterContacts;
import Pages.HomePage;
import Pages.LoginPage;

public class T017_Renter_Contacts extends TestBase{
	
	/* this code is developed for loading browser and ROC Login */
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
		log.LoginpageforRenter();
		log.DashboardRenterROC();
		homepage.HomePageButtonsrenter();
		AddRenterContacts arentercon=new AddRenterContacts();
		arentercon.addrentercontactofself();
		//acon.addcontactof_own();
		//acon.addcontactof_notROC();
		
		
		//add content, manage tests etc

		
	}
	/* this class is developed for quiting driver */


	


}
