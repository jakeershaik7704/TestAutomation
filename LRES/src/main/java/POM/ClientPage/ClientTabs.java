package POM.ClientPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientTabs {

	public static WebElement branchesOrDivisions(WebDriver driver)
	{
		WebElement branchesOrDivisions = driver.findElement(By.xpath("//li[@id='branchesTab']/a"));

		return branchesOrDivisions;
	}

	public static WebElement Products(WebDriver driver)
	{
		WebElement Products = driver.findElement(By.xpath("//li[@id='productsTab']/a"));

		return Products;
	}

}
