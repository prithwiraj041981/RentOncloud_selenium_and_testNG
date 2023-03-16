package Base;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/* this code is developed by prithwiraj */
/* this class is developed for base information */
public class TestBase {
	

	public static WebDriver driver=null;
	public static Properties prop;

	public static String executionPlatform="";
	public static String browserName="";
	public static String exec_os="";

	final long TIMEOUT = 30;
	public TestBase() {
		/* this code is developed for ROC main properties */
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "datafile.properties" );
			prop.load(ip);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void Base_url() throws IOException {

		/* this code is developed for Test Environment */
		if (executionPlatform.isBlank()) {
			String executionPlatform = prop.getProperty("exec_platform");
			System.out.println("Test is running on"+" "+executionPlatform);
		} 

		if (browserName.isBlank()) {
			browserName = prop.getProperty("browser");
			System.out.println("Test is running on"+" "+browserName);

		}

		if (exec_os.isBlank()) {
			exec_os = prop.getProperty("exec_OS");
			System.out.println("Test is running on"+" "+exec_os);


		}

		if (browserName.equalsIgnoreCase("Chrome") && exec_os.equalsIgnoreCase("windows")) {
			WebDriverManager.chromedriver().setup();


			driver = new ChromeDriver();

		}
		else if (browserName.equalsIgnoreCase("Firefox")&& exec_os.equalsIgnoreCase("windows")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
	}
	/* this code is developed for Taking Screenshot */
	public  void getScreenshot(WebDriver webdriver,String fileWithPath) throws IOException{

		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

	}


}
