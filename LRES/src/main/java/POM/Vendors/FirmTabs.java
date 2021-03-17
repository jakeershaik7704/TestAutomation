package POM.Vendors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirmTabs {

	public static WebElement IndividualVendors(WebDriver driver)
	{
		WebElement IndividualVendors = driver.findElement(By.xpath("//li[@id='vendorsTab']/a"));

		return IndividualVendors;
	}

}
