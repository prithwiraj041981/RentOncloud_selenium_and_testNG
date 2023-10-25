package Pages;

import java.io.IOException;
import java.util.List;

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

public class CreateinvoicePage extends TestBase{
	
	public static final long TIMEOUT = 5000;
	public static final long TIMEOUT1 = 5000;
	
	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-pound align-middle']")
	WebElement accounting;
	
	@FindBy(xpath="//span[contains(text(),' Rental Invoice ')]")
	WebElement invoice;
	
	@FindBy(xpath="//button[@class='btn-sm btn btn-success']")
	WebElement newinvoice;
	
	@FindBy(xpath="//input[@class='ant-select-selection-search-input']")
	WebElement newrenter;
	
	@FindBy(xpath="//span[@class='text-capitalize']")
	WebElement renter;
	
	@FindBy(xpath="//div[@class='row']/div[@class='col-10']/select[@class='w-100 form-select']")
	WebElement property;
	
	@FindBy(xpath="//input[@value='manual']")
	WebElement optionmanual;
	
	@FindBy(xpath="//input[@name='accountNumber']")
	WebElement accountno;
	
	@FindBy(xpath="//input[@name='sortCode']")
	WebElement sortcode;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement buttoncreate;
	
	@FindBy(xpath="//select[@name='accountId']")
	WebElement accountid;
	
	@FindBy(xpath="//input[@name='description']")
	WebElement textdescription;
	
	@FindBy(xpath="//input[@name='rate']")
	WebElement textrate;
	
	@FindBy(xpath="//input[@name='quantity']")
	WebElement textquantity;
	
	public CreateinvoicePage() {
		PageFactory.initElements(driver, this);

	}
	
public void Createinvoice() throws IOException, InterruptedException{
		
		accounting.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked accounting from menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		invoice.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked invoice from menu", ExtentColor.GREEN));
		newinvoice.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked new invoice in  ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		newrenter.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has select new renter  ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		renter.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected new renter  ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Select dropdown13 = new Select(property);
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
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected new renter  ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 optionmanual.click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has select manual ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 accountno.sendKeys("29823529");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given account no ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 sortcode.sendKeys("902127");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given sortt no ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttoncreate);
			Thread.sleep(500);
			Select dropdown14 = new Select(accountid);
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
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given accountid ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 textdescription.sendKeys("aaa");
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given description ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 textrate.sendKeys("123");
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given rate ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 textquantity.sendKeys("1");
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given quantity ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			 buttoncreate.click();
			 Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked create invoice ", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
}

}
