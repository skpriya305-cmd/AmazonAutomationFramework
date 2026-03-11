package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {
	
	WebDriver driver;
	
	By search = By.xpath("//input[@placeholder='Search Amazon.in']");
	By clicksearch = By.xpath("//input[@type='submit']");
	
	
	public AmazonHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchitem(String product)
	{
		driver.findElement(search).sendKeys(product);
	}
	public void clicksearch()
	{
		driver.findElement(clicksearch).click();
	}
	public void searchProduct(String productName) {
		searchitem(productName);
        clicksearch();
    }

}
