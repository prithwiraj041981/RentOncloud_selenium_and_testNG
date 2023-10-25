package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class AddDepositpage extends TestBase{
	
	public static final long TIMEOUT = 5000;
	public static final long TIMEOUT1 = 5000;
	
	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-pound align-middle']")
	WebElement accounting;
	
	@FindBy(xpath="//span[contains(text(),' Deposits ')]")
	WebElement deposit;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement newdeposit;
	
	@FindBy(xpath="//input[@id='transaction-form_contact']")
	WebElement renter_name1;
	
	@FindBy(xpath="//div[@class='ant-drawer ant-drawer-right ant-drawer-open']/../following-sibling::div")
	List<WebElement> renter_name;
	
	@FindBy(xpath="//select[@placeholder='Select Property']")
	WebElement property;
	
	@FindBy(xpath="//input[@placeholder='Reference Id of deposit']")
	WebElement reference_id;
	
	@FindBy(xpath="//input[@id='transaction-form_amount']")
	WebElement amount;
	
	@FindBy(xpath="//select[@id='transaction-form_accountId']")
	WebElement type_of_income;
	
	@FindBy(xpath="//select[@placeholder='Deposit Type']")
	WebElement deposit_scheme;
	
	@FindBy(xpath="//select[@placeholder='Deposit Protection Scheme']")
	WebElement deposit_scheme2;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement submit_button;
	
	@FindBy(xpath="//span[contains(text(),'prithvi_renter')]")
	List<WebElement> renters;
	
	
	
	public AddDepositpage() {
		PageFactory.initElements(driver, this);

	}
	
	public void Createdeposit() throws IOException, InterruptedException{
		accounting.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked accounting from menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		deposit.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked documents from menu", ExtentColor.GREEN));
		newdeposit.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked new documents ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		renter_name1.click();
		WebElement reters_name_span=renter_name.get(0).findElement(By.tagName("span"));
		Thread.sleep(TIMEOUT);
		//renters.get(0).click();
		reters_name_span.click();
		/*
		 * Select dropdown4 = new Select(renter_name); Thread.sleep(TIMEOUT); List
		 * <WebElement> op6 = dropdown4.getOptions(); Thread.sleep(TIMEOUT); int size6 =
		 * op6.size(); for(int i =0; i<size6 ; i++){ String options =
		 * op6.get(i).getText(); System.out.println(options); } op6.get(0).click();
		 */
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected renter's name ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 
		 /* this part to develop*/
		Select dropdown5 = new Select(property);
			Thread.sleep(TIMEOUT);
			List <WebElement> op7 = dropdown5.getOptions();
			Thread.sleep(TIMEOUT);
			 int size7 = op7.size();
			 for(int i =0; i<size7 ; i++){
		         String options = op7.get(i).getText();
		         System.out.println(options);
		      }
			 op7.get(1).click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered property ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 reference_id.sendKeys("abc");
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered reference id ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 amount.clear();
		 Thread.sleep(TIMEOUT);
		 amount.sendKeys("1000");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered amount ", ExtentColor.GREEN));
		 Select dropdown6 = new Select(type_of_income);
			Thread.sleep(TIMEOUT);
			List <WebElement> op8 = dropdown6.getOptions();
			Thread.sleep(TIMEOUT);
			 int size8 = op8.size();
			 for(int i =0; i<size8 ; i++){
		         String options = op8.get(i).getText();
		         System.out.println(options);
		      }
			 op8.get(1).click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered type_of_income ", ExtentColor.GREEN));
			
			 
			 Thread.sleep(TIMEOUT);
			 Select dropdown7 = new Select(deposit_scheme);
				Thread.sleep(TIMEOUT);
				List <WebElement> op9 = dropdown7.getOptions();
				Thread.sleep(TIMEOUT);
				 int size9 = op9.size();
				 for(int i =0; i<size9 ; i++){
			         String options = op9.get(i).getText();
			         System.out.println(options);
			      }
				 op9.get(1).click();
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered deposit_type ", ExtentColor.GREEN));
				 Thread.sleep(TIMEOUT);
				 
				 Select dropdown8 = new Select(deposit_scheme2);
					Thread.sleep(TIMEOUT);
					List <WebElement> op10 = dropdown8.getOptions();
					Thread.sleep(TIMEOUT);
					 int size10 = op10.size();
					 for(int i =0; i<size10 ; i++){
				         String options = op10.get(i).getText();
				         System.out.println(options);
				      }
					 op10.get(1).click();
					 Thread.sleep(TIMEOUT);
					 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered deposit_scheme ", ExtentColor.GREEN));
					 Thread.sleep(TIMEOUT);
					 Thread.sleep(TIMEOUT);
						
						
				 submit_button.click();
				 Thread.sleep(TIMEOUT);
				 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked  submit_button ", ExtentColor.GREEN));
			 
	}

}
