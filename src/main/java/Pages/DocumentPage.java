package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class DocumentPage extends TestBase{
	public static final long TIMEOUT = 5000;
	public static final long TIMEOUT1 = 5000;
	public DocumentPage() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//p[@class='d-flex menu-link']")
	WebElement tenancies;
	
	@FindBy(xpath="//span[contains(text(),' Documents ')]")
	WebElement documents;
	
	@FindBy(xpath="//button[@class='btn-sm btn btn-secondary']")
	WebElement newdocument;
	
	@FindBy(xpath="//select[@placeholder='Please select document type(s)']")
	WebElement Document_Type;
	
	@FindBy(xpath="//select[@placeholder='Select a property']")
	WebElement property_Type;
	
	@FindBy(xpath = "//input[@placeholder='Select date']")
     WebElement date321;
	
	@FindBy(xpath = "//table[@class='ant-picker-content']")
    WebElement datetable;
	
	@FindBy(xpath = "//textarea[@class='w-100 f-12 form-control']")
    WebElement description;
	
	@FindBy(xpath = "//input[@id='fileUpload']")
    WebElement uploaddocument;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement uploadsave;
	
	public void Createdocument() throws IOException, InterruptedException{
		tenancies.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked tenancies from menu", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		documents.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked documents from menu", ExtentColor.GREEN));
		newdocument.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has clicked new documents ", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Select dropdown = new Select(Document_Type);
		Thread.sleep(TIMEOUT);
		List <WebElement> op = dropdown.getOptions();
		Thread.sleep(TIMEOUT);
		 int size = op.size();
		 for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
		 op.get(1).click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected type of documents ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 /* this part to develop*/
		Select dropdown2 = new Select(property_Type);
			Thread.sleep(TIMEOUT);
			List <WebElement> op1 = dropdown2.getOptions();
			Thread.sleep(TIMEOUT);
			 int size1 = op1.size();
			 for(int i =0; i<size1 ; i++){
		         String options = op1.get(i).getText();
		         System.out.println(options);
		      }
			 op1.get(1).click();
		 Thread.sleep(TIMEOUT);
		 date321.click();
		 Thread.sleep(TIMEOUT);
		 List<WebElement> location1=datetable.findElements(By.tagName("tr"));
		 Thread.sleep(TIMEOUT);
		 int size3 = location1.size();
		 for(int i =0; i<size3 ; i++){
	         String options = location1.get(i).getText();
	         System.out.println(options);
	      }
		 List<WebElement> location2=location1.get(3).findElements(By.tagName("td"));
		 Thread.sleep(TIMEOUT);
		 location2.get(5).click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has selected date of documents ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 description.sendKeys("Lorem ipsum dolor sit amet. Et cupiditate perferendis et voluptatem quia vel ducimus ut nesciunt qua");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given description of documents ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 uploaddocument.sendKeys("C:/Screenshot/capture1.png");
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has given the documents ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT);
		 uploadsave.click();
		 Thread.sleep(TIMEOUT);
		 logger.log(Status.PASS, MarkupHelper.createLabel(" User has created the documents ", ExtentColor.GREEN));
		 Thread.sleep(TIMEOUT1);
		 
	}
}

