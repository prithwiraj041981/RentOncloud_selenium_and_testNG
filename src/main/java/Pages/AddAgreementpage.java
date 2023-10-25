package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class AddAgreementpage extends TestBase{
	public static final long TIMEOUT = 5000;
	public static final long TIMEOUT1 = 5000;
	public AddAgreementpage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//p[@class='d-flex menu-link']")
	WebElement tenancies;
	
	@FindBy(xpath="//span[contains(text(),' Agreement ')]")
	WebElement agreement;
	
	@FindBy(xpath="//button[@class='btn-sm btn btn-secondary']")
	WebElement newagreement;
	
	@FindBy(xpath = "//label[@class='custom-control-label f-14 text-muted']")
    List<WebElement> Rental_Agreement_option ;
	
	@FindBy(xpath="//select[@placeholder='Select template']")
	WebElement Rental_Agreement_type;
	
	
	@FindBy(xpath = "//button[@class=' mx-1 my-1 btn btn-primary']")
    WebElement get_started;
	
	@FindBy(xpath="//select[@placeholder='Select Property']")
	WebElement Rental_property;
	
	@FindBy(xpath="//div[@class='ant-select-selection-overflow']")
	WebElement Tenant_Information;
	
	@FindBy(xpath="//div[contains(text(),'prithvi')]")
	WebElement renter_name;
	
	@FindBy(xpath="//input[@placeholder='Count of adults']")
	WebElement Count_of_adults;
	
	@FindBy(xpath="//input[@placeholder='Count of kids']")
	WebElement Count_of_kids;
	
	@FindBy(xpath="//input[@placeholder='Count of pets']")
	WebElement Count_of_pets;
	
	@FindBy(xpath="//div[@class='ant-switch-handle']")
	WebElement no_end_date;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement button_continue;
	
	@FindBy(xpath="//input[@placeholder='Enter rent amount']")
	WebElement rental_amount;
	
	@FindBy(xpath="//select[@placeholder='Select payment schedule type']")
	WebElement Payment_schedule_type;
	
	@FindBy(xpath="//input[@placeholder='Enter deposit amount']")
	WebElement Deposit_amount;
	
	@FindBy(xpath="//select[@placeholder='Deposit type']")
	WebElement Deposit_type;
	
	@FindBy(xpath="//textarea[@placeholder='Any other information about deposit protection scheme and who has kept this amount']")
	WebElement Other_Information;
	
	@FindBy(xpath="//textarea[@placeholder='Enter information, to be used in the tenancy agreement']")
	List<WebElement> Other_EXCLUSIONS ;
	
	@FindBy(xpath="//button[contains(text(),'Send For Sign')]")
	WebElement button_sign;
	
	
	public void Createagreement() throws IOException, InterruptedException{
		tenancies.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked tenancies from menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		agreement.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked Agreement from menu", ExtentColor.GREEN));
		newagreement.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked new agreement ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Rental_Agreement_option.get(0).click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has select Rental_Agreement_option", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Select dropdown = new Select(Rental_Agreement_type);
		Thread.sleep(TIMEOUT);
		List <WebElement> op11 = dropdown.getOptions();
		Thread.sleep(TIMEOUT);
		 int size = op11.size();
		 for(int i =0; i<size ; i++){
	         String options = op11.get(i).getText();
	         System.out.println(options);
	      }
		 op11.get(1).click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected type of agreement ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 get_started.click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked get_started ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 Select dropdown12 = new Select(Rental_property);
			Thread.sleep(TIMEOUT);
			List <WebElement> op12 = dropdown12.getOptions();
			Thread.sleep(TIMEOUT);
			 int size12 = op12.size();
			 for(int i =0; i<size12 ; i++){
		         String options = op12.get(i).getText();
		         System.out.println(options);
		      }
			 op12.get(1).click();
			 
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected property ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 Tenant_Information.click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked tenant information ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 renter_name.click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected tenant ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 Count_of_adults.sendKeys("1");
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given  Count_of_adults ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 Count_of_kids.sendKeys("2");
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given  Count_of_kids ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 Count_of_pets.sendKeys("3");
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given  Count_of_pets ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 no_end_date.click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected  no_end_date ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 button_continue.click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected  button_continue ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 rental_amount.sendKeys("1000");
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given   rental_amount ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 
			 Select dropdown13 = new Select(Payment_schedule_type);
				Thread.sleep(TIMEOUT);
				List <WebElement> op13 = dropdown13.getOptions();
				Thread.sleep(TIMEOUT);
				 int size13 = op13.size();
				 for(int i =0; i<size13 ; i++){
			         String options = op13.get(i).getText();
			         System.out.println(options);
			      }
				 op13.get(1).click();
				 
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected property ", ExtentColor.GREEN));
				 Thread.sleep(TIMEOUT);
				 Deposit_amount.sendKeys("2000");
				 Thread.sleep(TIMEOUT);
				 Select dropdown14 = new Select(Deposit_type);
					Thread.sleep(TIMEOUT);
					List <WebElement> op14 = dropdown14.getOptions();
					Thread.sleep(TIMEOUT);
					 int size14 = op14.size();
					 for(int i =0; i<size14 ; i++){
				         String options = op14.get(i).getText();
				         System.out.println(options);
				      }
					 op14.get(1).click();
					 Thread.sleep(TIMEOUT);
					 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected Deposit_type ", ExtentColor.GREEN));
					 Thread.sleep(TIMEOUT);
					 
					 Other_Information.sendKeys("xyz1");
					 Thread.sleep(TIMEOUT);
					 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given  Other_Information ", ExtentColor.GREEN));
					 Thread.sleep(TIMEOUT);
					 
					 button_continue.click();
					 Thread.sleep(TIMEOUT);
					 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected  button_continue ", ExtentColor.GREEN));
					 Thread.sleep(TIMEOUT);
					 Other_EXCLUSIONS.get(0).sendKeys("xyz321");
					 Thread.sleep(TIMEOUT);
					 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given  Other_EXCLUSIONS 1 ", ExtentColor.GREEN));
					 Thread.sleep(TIMEOUT);
					 Thread.sleep(TIMEOUT);
					 Other_EXCLUSIONS.get(1).sendKeys("xyz231");
					 Thread.sleep(TIMEOUT);
					 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given  Special clauses", ExtentColor.GREEN));
					 Thread.sleep(TIMEOUT);
 
					 
					 button_continue.click();
					 Thread.sleep(TIMEOUT);
					 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected  button_continue ", ExtentColor.GREEN));
					 Thread.sleep(TIMEOUT);
					 button_sign.click();
					 Thread.sleep(TIMEOUT);
					 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked  button_sign ", ExtentColor.GREEN));
					 Thread.sleep(TIMEOUT);
		 
	}

}
