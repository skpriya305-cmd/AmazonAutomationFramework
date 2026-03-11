package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	WebDriver driver;

	By addtocart = By.xpath("//input[@id='add-to-cart-button']");
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void Switchtoproductwindow()
	{
		Set<String> windows = driver.getWindowHandles();
		
		for (String win : windows)
		{
			driver.switchTo().window(win);
			
		}
	}
	
	public void addtocart()
	{
		driver.findElement(addtocart).click();
        System.out.println("Product added to cart successfully");

		
	}
	
}
