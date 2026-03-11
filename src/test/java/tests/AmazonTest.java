package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AmazonHomePage;
import Pages.AmzonSearchPage;
import Pages.ProductPage;
import utils.ConfigUtils;
import utils.GenericUtils1;

public class AmazonTest extends BaseTest {
	protected static Logger logger = LogManager.getLogger(AmazonTest.class);

		
	@Test
	public void amazontest() {
		
		AmazonHomePage ap = new AmazonHomePage(driver);

		AmzonSearchPage sp = new AmzonSearchPage(driver);
        ProductPage productPage = new ProductPage(driver);


		
		GenericUtils1.implicitwait(driver);
		String product = ConfigUtils.ConfigReader("Productname");
		ap.searchitem(product);
		ap.clicksearch();
		sp.selectProduct(product);
		productPage.Switchtoproductwindow();
        productPage.addtocart();
		
		
		
		
	}

}
