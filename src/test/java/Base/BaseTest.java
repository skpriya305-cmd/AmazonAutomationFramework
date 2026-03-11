package Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import utils.ConfigUtils;
import utils.GenericUtils1;

public class BaseTest {
	
	public WebDriver driver;
	protected static Logger logger = LogManager.getLogger(BaseTest.class);

	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
        logger.info("Chrome browser launched");

		String url = ConfigUtils.ConfigReader("URL");
	      driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void teardown(ITestResult itr)
	{
		if (ITestResult.SUCCESS == itr.getStatus()) {
	        GenericUtils1.TakeScreenshot(driver, itr.getName());
	    }
		driver.quit();
	}
	
	
	

}
