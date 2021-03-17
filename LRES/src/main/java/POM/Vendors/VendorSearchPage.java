package POM.Vendors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VendorSearchPage {

	public static WebElement individualAgents(WebDriver driver)
	{
		WebElement individualAgents = driver.findElement(By.xpath("//div[@id='header']/div[2]/ul/li[3]/ul/li[2]/a/span"));

		return individualAgents;
	}

	public static WebElement quickSearch(WebDriver driver)
	{
		WebElement quickSearch = driver.findElement(By.xpath("//input[@id='SearchCriteria_QuickSearch']"));

		return quickSearch;
	}

	public static WebElement SearchVendor(WebDriver driver)
	{
		WebElement SearchVendor = driver.findElement(By.xpath("//button[@onclick='searchVendors();']"));

		return SearchVendor;
	}


}
