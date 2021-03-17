package POM.Vendors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateFirm {

	public static WebElement vendorsMenu(WebDriver driver)
	{
		WebElement vendorsMenu = driver.findElement(By.xpath("//div[@id='header']/div[2]/ul/li[3]/a/span"));

		return vendorsMenu;
	}

	public static WebElement Firms(WebDriver driver)
	{
		WebElement Firms = driver.findElement(By.xpath("//div[@id='header']/div[2]/ul/li[3]/ul/li[1]/a"));

		return Firms;
	}

	public static WebElement CreateFirmButton(WebDriver driver)
	{
		WebElement CreateFirmButton = driver.findElement(By.xpath("//button[@onclick='createFirm();']"));

		return CreateFirmButton;
	}

	public static WebElement companyName(WebDriver driver)
	{
		WebElement companyName = driver.findElement(By.xpath("//input[@id='FirmEdit_Name']"));

		return companyName;
	}

	public static WebElement AlternateSystemID(WebDriver driver)
	{
		WebElement AlternateSystemID = driver.findElement(By.xpath("//input[@id='FirmEdit_AlternateSystemID']"));

		return AlternateSystemID;
	}

	public static WebElement BillingSystemID(WebDriver driver)
	{
		WebElement BillingSystemID = driver.findElement(By.xpath("//input[@id='FirmEdit_BillingSystemID']"));

		return BillingSystemID;
	}

	public static WebElement TaxID(WebDriver driver)
	{
		WebElement TaxID = driver.findElement(By.xpath("//input[@id='FirmEdit_TaxID']"));

		return TaxID;
	}

	public static WebElement Address1(WebDriver driver)
	{
		WebElement Address1 = driver.findElement(By.xpath("//input[@id='FirmEdit_BillingAddress1']"));

		return Address1;
	}

	public static WebElement UnitSuite(WebDriver driver)
	{
		WebElement UnitSuite = driver.findElement(By.xpath("//input[@id='FirmEdit_BillingAddress2']"));

		return UnitSuite;
	}

	public static WebElement postalCode(WebDriver driver)
	{
		WebElement postalCode = driver.findElement(By.xpath("//input[@id='FirmEdit_BillingAddressZip']"));

		return postalCode;
	}

	public static WebElement ContactFirstName(WebDriver driver)
	{
		WebElement ContactFirstName = driver.findElement(By.xpath("//input[@id='FirmEdit_ContactFirstName']"));

		return ContactFirstName;
	}

	public static WebElement ContactLastName(WebDriver driver)
	{
		WebElement ContactLastName = driver.findElement(By.xpath("//input[@id='FirmEdit_ContactLastName']"));

		return ContactLastName;
	}

	public static WebElement primaryPhone(WebDriver driver)
	{
		WebElement primaryPhone = driver.findElement(By.xpath("//input[@id='FirmEdit_WorkPhone']"));

		return primaryPhone;
	}

	public static WebElement BusinessType(WebDriver driver)
	{
		WebElement BusinessType = driver.findElement(By.xpath("//select[@id='FirmEdit_BusinessTypeID']"));

		return BusinessType;
	}

	public static WebElement saveFirm(WebDriver driver)
	{
		WebElement saveFirm = driver.findElement(By.xpath("//*[@id=\"frmFirm\"]/div[7]/div/button"));

		return saveFirm;
	}

	// firm search page elements

	public static WebElement vendorFirmID(WebDriver driver)
	{
		WebElement vendorFirmID = driver.findElement(By.xpath("//input[@id='SearchCriteria_VendorFirmID']"));

		return vendorFirmID;
	}

	public static WebElement searchFirms(WebDriver driver)
	{
		WebElement searchFirms = driver.findElement(By.xpath("//button[@onclick='searchFirms();']"));

		return searchFirms;
	}

	// firm dash board elements

	public static WebElement firmID(WebDriver driver)
	{
		WebElement firmID = driver.findElement(By.xpath("//*[@id=\"firmSummary\"]/div/div[1]/div[2]"));

		return firmID;
	}

	public static WebElement firmName(WebDriver driver)
	{
		WebElement firmName = driver.findElement(By.xpath("//*[@id=\"firmSummary\"]/div/div[1]/div[4]"));

		return firmName;
	}	

}
