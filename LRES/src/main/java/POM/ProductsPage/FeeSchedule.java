package POM.ProductsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FeeSchedule {

	public static WebElement feeSchedule(WebDriver driver)
	{
		WebElement feeSchedule = driver.findElement(By.xpath("//div[@id='header']/div[2]/ul/li[9]/ul/li[10]/a/span"));

		return feeSchedule;
	}

	public static WebElement standardFeeValuations(WebDriver driver)
	{
		WebElement standardFeeValuations = driver.findElement(By.xpath("//*[@title='Standard Fee Valuations']/a"));

		return standardFeeValuations;
	}

	public static WebElement addFeeButton1(WebDriver driver)
	{
		WebElement addFeeButton1 = driver.findElement(By.xpath("//button[@onclick=\"$('#feeScheduleEntryModal').data('bs.modal').show();\"]"));

		return addFeeButton1;
	}

	public static WebElement selectProduct(WebDriver driver)
	{
		WebElement selectProduct = driver.findElement(By.xpath("//select[@id='ClientFeeScheduleFee_ProductID']"));

		return selectProduct;
	}

	public static WebElement Fee(WebDriver driver)
	{
		WebElement Fee = driver.findElement(By.xpath("//input[@id='ClientFeeScheduleFee_Fee']"));

		return Fee;
	}

	public static WebElement saveButton1(WebDriver driver)
	{
		WebElement saveButton1 = driver.findElement(By.xpath("(//button[@id='btnAddFeeScheduleEntry'])[2]"));

		return saveButton1;
	}

	public static WebElement saveButton2(WebDriver driver)
	{
		WebElement saveButton2 = driver.findElement(By.xpath("(//*[@id=\"btnAddFeeScheduleEntry\"])"));

		return saveButton2;
	}
}
