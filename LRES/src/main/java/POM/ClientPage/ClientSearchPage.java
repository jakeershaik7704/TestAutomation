package POM.ClientPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientSearchPage {

	public static WebElement clientOrBranchID(WebDriver driver)
	{
		WebElement clientOrBranchID = driver.findElement(By.xpath("//input[@id='SearchCriteria_ID']"));

		return clientOrBranchID;
	}

	public static WebElement search(WebDriver driver)
	{
		WebElement search = driver.findElement(By.xpath("//button[@onclick='searchClients();']"));

		return search;
	}

	
}
