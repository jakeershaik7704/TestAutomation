package POM.Orders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderDashboardElements {

	public static WebElement OrderID(WebDriver driver)
	{
		WebElement OrderID = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Order ID:'])[1]/following::a[1]"));

		return OrderID;
	}

	public static WebElement Client_dashboard(WebDriver driver)
	{
		WebElement Client_dashboard = driver.findElement(By.xpath("//div[@id='orderItemSummaryDiv']/div/div/div[3]/div[2]"));

		return Client_dashboard;
	}

	public static WebElement Product_dashboard(WebDriver driver)
	{
		WebElement Product_dashboard = driver.findElement(By.xpath("//div[@id='orderItemSummaryDiv']/div/div/div[3]/div[6]/a"));

		return Product_dashboard;
	}

	public static WebElement LastStatus(WebDriver driver)
	{
		WebElement LastStatus = driver.findElement(By.xpath("//div[@id='orderItemSummaryDiv']/div/div/div[6]/div[2]"));

		return LastStatus;
	}

	public static WebElement CurrentQueue(WebDriver driver)
	{
		WebElement CurrentQueue = driver.findElement(By.xpath("//div[@id='orderItemSummaryDiv']/div/div/div[7]/div[2]"));

		return CurrentQueue;
	}

}
