package POM.Vendors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VendorTabs {

	public static WebElement ServiceArea(WebDriver driver)
	{
		WebElement ServiceArea = driver.findElement(By.xpath("//li[@id='serviceAreasTab']"));

		return ServiceArea;
	}

}
