package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class AddTransactionpage extends TestBase{
	
	public static final long TIMEOUT = 5000;
	public static final long TIMEOUT1 = 5000;
	
	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-pound align-middle']")
	WebElement accounting;
	
	@FindBy(xpath="//span[contains(text(),' Transactions ')]")
	WebElement deposit;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement newdmoneyin;
	
	@FindBy(xpath="//input[@id='transaction-form_contact']")
	WebElement renter_name;
	
	@FindBy(xpath="//span[contains(text(),'prithvi_renter')]")
	List<WebElement> renters;
	
	@FindBy(xpath="//input[@id='transaction-form_property']")
	List<WebElement> property;
	
	@FindBy(xpath="//div[contains(text(),'Qwerky Cottage La Gibauderie Guernsey GY1 1XP')]")
	List<WebElement> propertyname;
	
	@FindBy(xpath="//input[@id='transaction-form_accountId']")
	WebElement kind_of_income;
	
	@FindBy(xpath="//div[@class='ant-select-item ant-select-item-option ant-select-item-option-grouped ant-select-item-option-active']/div[@class='ant-select-item-option-content']")
    WebElement kind_of_income_element;
	
	@FindBy(xpath="//input[@id='transaction-form_amount']")
	WebElement amount_of_price;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement button_submit;
	
	public AddTransactionpage() {
		PageFactory.initElements(driver, this);

	}
	
	@SuppressWarnings("static-access")
	public void Createtransaction() throws IOException, InterruptedException{
		
		accounting.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked accounting from menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		deposit.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked transaction from menu", ExtentColor.GREEN));
		newdmoneyin.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked new money in  ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		renter_name.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked new renters  ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		String root_span=renters.get(0).getAttribute("class");
		System.out.println(root_span);
		boolean a=root_span.contains("text-capitalize f-12  text-nowrap");
		int size1=renters.size();
		System.out.println(size1);
		int size2=(size1-1);
		System.out.println(size2);
		int num=0;
				if(size1>0) {
					num++;
					Thread.sleep(TIMEOUT);
					 //renters_name.get(0).click();
					renters.get(size2).click();
					Thread.sleep(TIMEOUT);
					logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked new renters name  ", ExtentColor.GREEN));
					Thread.sleep(TIMEOUT);
					
				}else {
					renters.get(num).click();
					Thread.sleep(TIMEOUT);
					logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked new renters name  ", ExtentColor.GREEN));
					Thread.sleep(TIMEOUT);
					
				}
		 //List<WebElement> renters_name=renters.get(0).findElements(By.tagName("span"));
		 
		property.get(0).click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked new property ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		propertyname.get(0).click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked  property name ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		kind_of_income.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked kind_of_income ", ExtentColor.GREEN));
		kind_of_income_element.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked kind_of_income of elements ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		amount_of_price.sendKeys("1000");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered amount ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button_submit);
		Thread.sleep(500);
		button_submit.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has create transaction ", ExtentColor.GREEN));
		
	}
	
	
	
	
}
