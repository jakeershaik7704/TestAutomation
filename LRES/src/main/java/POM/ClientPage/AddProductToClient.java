package POM.ClientPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProductToClient {

	public static WebElement addProduct(WebDriver driver)
	{
		WebElement addProduct = driver.findElement(By.xpath("//*[@id=\"productsTabContent\"]/section[2]/div/div[1]/div/div/button"));

		return addProduct;
	}

	public static WebElement whatProductBeingConfigured(WebDriver driver)
	{
		WebElement whatProductBeingConfigured = driver.findElement(By.xpath("//select[@id='ClientProductEdit_ProductID']"));

		return whatProductBeingConfigured;
	}

	public static WebElement howDueDatesBeDetermined(WebDriver driver)
	{
		WebElement howDueDatesBeDetermined = driver.findElement(By.xpath("//select[@id='ClientProductEdit_CalendarID']"));

		return howDueDatesBeDetermined;
	}

	public static WebElement clientSLA(WebDriver driver)
	{
		WebElement clientSLA = driver.findElement(By.xpath("//input[@id='ClientProductEdit_ClientSLA']"));

		return clientSLA;
	}

	public static WebElement vendorSLA(WebDriver driver)
	{
		WebElement vendorSLA = driver.findElement(By.xpath("//input[@id='ClientProductEdit_VendorSLA']"));

		return vendorSLA;
	}

	public static WebElement CollectValuation(WebDriver driver)
	{
		WebElement CollectValuation = driver.findElement(By.xpath("//input[@id='ClientProductEdit_CollectValuationSummary']"));

		return CollectValuation;
	}

	public static WebElement whatMethodShouldVendorUse(WebDriver driver)
	{
		WebElement whatMethodShouldVendorUse = driver.findElement(By.xpath("//select[@id='ClientProductEdit_VendorProductCompletionTypeID']"));

		return whatMethodShouldVendorUse;
	}

	public static WebElement saveProduct(WebDriver driver)
	{
		WebElement saveProduct = driver.findElement(By.xpath("//button[@id='productFormSubmitBtn']"));

		return saveProduct;
	}
}
