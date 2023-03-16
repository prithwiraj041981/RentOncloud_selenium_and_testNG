package Pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;


/* this code is developed by prithwiraj */
/* this class is developed for Adding Properties of ROC */
public class Addproperty extends TestBase {

	public static final long TIMEOUT = 100;
     /*identifying elements*/
	@FindBy(how=How.XPATH, using="//span[@class='ant-menu-title-content']/a[@href='/landlord/property']")
	WebElement property;

	@FindBy(how=How.XPATH, using="//i[@class='fa fa-plus']")
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


	@FindBy(how=How.XPATH, using="//button[@class='  m-1 px-4 btn btn-primary']")
	WebElement btn_create_property;



	@FindBy(how=How.XPATH, using="//button[contains(text(),'Return To Properties')]")
	WebElement  btn_returnto_property;

	@FindBy(how=How.XPATH, using="//span[contains(text(),'Yes, Duplicate!')]")
	WebElement  frame_duplicate;



	@FindBy(how=How.XPATH, using="//th[@class='ant-table-cell']")
	WebElement loweraddress;
	@FindBy(how=How.XPATH, using="//tr[@class='ant-table-row ant-table-row-level-0']")
	WebElement loweraddressselect;

	public Addproperty(WebDriver driver) {
		Addproperty.driver = driver;
		PageFactory.initElements(driver, this);

	}
	/* this Method is developed for Adding Properties of ROC */
	public void addpropertyforlandlord() throws InterruptedException  {
		/* navigating to  menu-->properties */
		property.click();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		/* Clicking in Add properties button */
		try {
			addproperty.click();
			driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

		}catch(Exception e1) {
			addproperty.click();
			driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		}

		try {
			/* Giving  property location */
			propertylocation.sendKeys("ZE1 0AE, Church Road, Shetland");
			Thread.sleep(500);

		}catch(Exception e2) {
			propertylocation.sendKeys("ZE1 0AE, Church Road, Shetland");
			Thread.sleep(500);
		}

		try
		{
			/* selecting an property location */
			WebElement autoOptions = driver.findElement(By.xpath("//div[@class='ant-space-item']"));
			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("span"));
			optionsToSelect.get(0).click();
			driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
			/* selecting duplicate property if duplicate comes */
			try {
				frame_duplicate.click();

				driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
				typeofproperty.click();
				driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,600)", "");
				driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
				Select subtype = new Select(subtype1);

				subtype.selectByIndex(1);

				driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

				noofbed.sendKeys("1");
				driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
				noofbath.sendKeys("2");
				driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
				noofreception.sendKeys("3");
				driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
				noofsize.sendKeys("2222");
				driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
				btn_create_property.click();
				driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
				btn_returnto_property.click();

			}catch(Exception e3) {
				/* selecting Lower address of property  */
				try {
					if(loweraddress.getText().equalsIgnoreCase("Select Your Address")) {
						System.out.println("text 1");
						WebElement autoOptions1 = driver.findElement(By.xpath("//td[@class='ant-table-cell']"));
						List<WebElement> optionsToSelect1 = autoOptions1.findElements(By.tagName("div"));

						optionsToSelect1.get(1).click();
						/* selecting duplicate property if duplicate comes */
						try {
							frame_duplicate.click();

							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							typeofproperty.click();
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

							JavascriptExecutor js = (JavascriptExecutor) driver;
							js.executeScript("window.scrollBy(0,600)", "");
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							Select subtype = new Select(subtype1);

							subtype.selectByIndex(1);

							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

							noofbed.sendKeys("1");
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							noofbath.sendKeys("2");
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							noofreception.sendKeys("3");
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							noofsize.sendKeys("2222");
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							btn_create_property.click();
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							btn_returnto_property.click();
							/* selecting  property if duplicate does not comes */
						}catch(Exception e4) {
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							typeofproperty.click();

							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

							JavascriptExecutor js = (JavascriptExecutor) driver;
							js.executeScript("window.scrollBy(0,600)", "");
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							Select subtype = new Select(subtype1);

							subtype.selectByIndex(1);

							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

							noofbed.sendKeys("1");
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							noofbath.sendKeys("2");
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							noofreception.sendKeys("3");
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							noofsize.sendKeys("2222");
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							btn_create_property.click();
							driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
							btn_returnto_property.click();

						}


					}
					/* selecting  property if duplicate and Lower address do not come*/
				}catch(Exception e5) {
					driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
					typeofproperty.click();
					driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,600)", "");
					driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
					Select subtype = new Select(subtype1);

					subtype.selectByIndex(1);

					driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

					noofbed.sendKeys("1");
					driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
					noofbath.sendKeys("2");
					driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
					noofreception.sendKeys("3");
					driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
					noofsize.sendKeys("2222");
					driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
					btn_create_property.click();
					driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
					btn_returnto_property.click();


				}
			}

		}catch(Exception e6) {

			e6.printStackTrace(); 
		}

	}
}














