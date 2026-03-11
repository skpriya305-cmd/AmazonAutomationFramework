package Pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmzonSearchPage {
	WebDriver driver;
	protected static Logger logger = LogManager.getLogger(AmzonSearchPage.class);

	
	By searchlist = By.xpath("//span[@data-component-type='s-search-results']") ;
	
	public AmzonSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void selectProduct(String productName)
	{
		List<WebElement> items = driver.findElements(searchlist);
		
		for (WebElement pro : items)
		{
			String name = pro.getText();
			
			if (name.contains(productName))
			{
			
				pro.click();
				break;
			}
		}
	}
	
}
