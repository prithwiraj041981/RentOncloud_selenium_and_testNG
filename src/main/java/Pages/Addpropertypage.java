package Pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

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


/* this code is developed by prithwiraj */
/* this class is developed for Adding Properties of ROC */
public class Addpropertypage extends TestBase {

	public static final long TIMEOUT = 5000;
     /*identifying elements*/
	@FindBy(how=How.XPATH, using="//a[@href='/landlord/property']")
	WebElement property;

	@FindBy(how=How.XPATH, using="//i[@class='fi fi-rr-plus-small align-middle']")
	WebElement addproperty;

	@FindBy(how=How.XPATH, using="//div[@class='row']/div[1]/div/div[2]/div/div/span[1]/input")
	WebElement propertylocation;

	@FindBy(how=How.XPATH, using="//img[@src='https://res.cloudinary.com/dkxjsdsvg/image/upload/images/house.png']")
	WebElement typeofproperty;

	@FindBy(how=How.XPATH, using="//select[@name='subType']")
	WebElement  subtype1;

	@FindBy(how=How.XPATH, using="//input[@name='numberOfBed']")
	WebElement noofbed;

	@FindBy(how=How.XPATH, using="//input[@name='numberOfBath']")
	WebElement noofbath;

	@FindBy(how=How.XPATH, using="//input[@name='numberOfReception']")
	WebElement noofreception;

	@FindBy(how=How.XPATH, using="//input[@name='sizeInSquareFeet']")
	WebElement noofsize;


	@FindBy(how=How.XPATH, using="//button[@class='btn btn-primary']")
	WebElement btn_create_property;



	@FindBy(how=How.XPATH, using="//button[contains(text(),'Return To Properties')]")
	WebElement  btn_returnto_property;

	@FindBy(how=How.XPATH, using="//button[@class='ant-btn ant-btn-primary']")
	WebElement  frame_duplicate;



	@FindBy(how=How.XPATH, using="//th[@class='ant-table-cell']")
	WebElement loweraddress;
	
	@FindBy(how=How.XPATH, using="//tr[@class='ant-table-row ant-table-row-level-0']")
	WebElement loweraddressselect;
	
	@FindBy(how=How.XPATH, using="//div[@class='ant-modal-wrap']")
	WebElement div_frame_duplicate;
	//div[@class='ant-modal-wrap']

	public Addpropertypage() {
		PageFactory.initElements(driver, this);

	}
	/* this Method is developed for Adding Properties of ROC */
	public void addpropertyforlandlord() throws InterruptedException  {
		/* navigating to  menu-->properties */
		property.click();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked property from Menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		/* Clicking in Add properties button */
		try {
			addproperty.click();
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked add property", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);

		}catch(Exception e1) {
			addproperty.click();
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked add property", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
		}

		try {
			/* Giving  property location */
			propertylocation.sendKeys("Qwerky Cottage, La Gibauderie, St. Peter Port, Guernsey, GY1 1XP");
			Thread.sleep(500);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered property location", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);

		}catch(Exception e2) {
			
			propertylocation.sendKeys("Qwerky Cottage, La Gibauderie, St. Peter Port, Guernsey, GY1 1XP");
			Thread.sleep(500);
			logger.log(Status.PASS, MarkupHelper.createLabel("User has entered property location", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
		}

		
			/* selecting an property location */
			WebElement autoOptions = driver.findElement(By.xpath("//div[@class='ant-space-item']"));
			Thread.sleep(TIMEOUT);
		   
			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("span"));
			Thread.sleep(TIMEOUT);
			 logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered property from auto location", ExtentColor.GREEN));
			 Thread.sleep(TIMEOUT);
			optionsToSelect.get(0).click();
			
			/* typeofproperty.click();
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has select type of property", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,600)", "");
			Thread.sleep(TIMEOUT);
			Select subtype = new Select(subtype1);

			subtype.selectByIndex(1);

			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has select sub type of property", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);

			noofbed.sendKeys("1");
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has select no of bed", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
			noofbath.sendKeys("2");
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has select no of bath", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
			noofreception.sendKeys("3");
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has select no of reception", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
			noofsize.sendKeys("2222");
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered property size", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
			btn_create_property.click();
			Thread.sleep(TIMEOUT);
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked create property ", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
			btn_returnto_property.click();
			logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked Returned to property ", ExtentColor.GREEN));
			Thread.sleep(TIMEOUT);
			
			//Thread.sleep(TIMEOUT);
			 * 
			 */
			
			boolean flag=div_frame_duplicate.isDisplayed();
			System.out.println("frame="+flag);
                    if(flag){
                    	Thread.sleep(TIMEOUT);
        				System.out.println("1");
        				frame_duplicate.click();
        				System.out.println("1");
        				logger.log(Status.PASS, MarkupHelper.createLabel(" User has select duplicate location", ExtentColor.GREEN));

        				Thread.sleep(TIMEOUT);
        				System.out.println("2");
        				Thread.sleep(TIMEOUT);
				
				typeofproperty.click();
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has select type of property", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,600)", "");
				Thread.sleep(TIMEOUT);
				Select subtype = new Select(subtype1);

				subtype.selectByIndex(1);

				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has select sub type of property", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);

				noofbed.sendKeys("1");
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has select no of bed", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				noofbath.sendKeys("2");
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has select no of bath", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				noofreception.sendKeys("3");
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has select no of reception", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				noofsize.sendKeys("2222");
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered property size", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				btn_create_property.click();
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked create property ", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				btn_returnto_property.click();
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked Returned to property ", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				
			}
                    else {
                    	
				Thread.sleep(TIMEOUT);
				typeofproperty.click();
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has select type of property", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,600)", "");
				Thread.sleep(TIMEOUT);
				Select subtype = new Select(subtype1);

				subtype.selectByIndex(1);

				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has select sub type of property", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);

				noofbed.sendKeys("1");
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has select no of bed", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				noofbath.sendKeys("2");
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has select no of bath", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				noofreception.sendKeys("3");
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has select no of reception", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				noofsize.sendKeys("2222");
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has entered property size", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				btn_create_property.click();
				Thread.sleep(TIMEOUT);
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked create property ", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				btn_returnto_property.click();
				logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked Returned to property ", ExtentColor.GREEN));
				Thread.sleep(TIMEOUT);
				
			} 
		
			
			/* selecting duplicate property if duplicate comes */
			
	}
}














