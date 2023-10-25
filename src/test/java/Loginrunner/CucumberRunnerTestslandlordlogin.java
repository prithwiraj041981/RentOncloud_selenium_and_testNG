package Loginrunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
features = "classpath:feature",
glue = "TestCases",
tags = "@regression",
plugin ={"pretty", "html:target//Reports//Roc-reports.html"},
monochrome=true)


public class CucumberRunnerTestslandlordlogin extends AbstractTestNGCucumberTests{
	
}