package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Pages.NewTaskPage;

public class T009_add_task_page extends TestBase {
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
		NewTaskPage task=new NewTaskPage();
		task.Createnewtask();
	}

}
