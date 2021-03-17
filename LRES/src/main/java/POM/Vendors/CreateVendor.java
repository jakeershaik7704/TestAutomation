package POM.Vendors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateVendor {

	public static WebElement IndividualVendors(WebDriver driver)
	{
		WebElement VendorFirmID = driver.findElement(By.xpath("//input[@id='SearchCriteria_VendorFirmID']"));

		return VendorFirmID;
	}

	public static WebElement SearchFirm(WebDriver driver)
	{
		WebElement SearchFirm = driver.findElement(By.xpath("//button[@onclick='searchFirms();']"));

		return SearchFirm;
	}

	public static WebElement addVendor(WebDriver driver)
	{
		WebElement addVendor = driver.findElement(By.xpath("//*[@id=\"vendorsTabContent\"]/section[2]/div/div[1]/div/button[1]"));

		return addVendor;
	}

	public static WebElement FirstName(WebDriver driver)
	{
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='VendorEdit_FirstName']"));

		return FirstName;
	}

	public static WebElement LastName(WebDriver driver)
	{
		WebElement LastName = driver.findElement(By.xpath("//input[@id='VendorEdit_LastName']"));

		return LastName;
	}

	public static WebElement vendorClass(WebDriver driver)
	{
		WebElement vendorClass = driver.findElement(By.xpath("//select[@id='VendorEdit_VendorClassID']"));

		return vendorClass;
	}

	public static WebElement vendorStatus(WebDriver driver)
	{
		WebElement vendorStatus = driver.findElement(By.xpath("//select[@id='VendorEdit_VendorStatusID']"));

		return vendorStatus;
	}

	public static WebElement alternateSystemID(WebDriver driver)
	{
		WebElement alternateSystemID = driver.findElement(By.xpath("//input[@id='VendorEdit_AlternateSystemID']"));

		return alternateSystemID;
	}

	public static WebElement billingSystemID(WebDriver driver)
	{
		WebElement billingSystemID = driver.findElement(By.xpath("//input[@id='VendorEdit_BillingSystemID']"));

		return billingSystemID;
	}

	public static WebElement Address1(WebDriver driver)
	{
		WebElement Address1 = driver.findElement(By.xpath("//input[@id='VendorEdit_Address1']"));

		return Address1;
	}

	public static WebElement unitSuite(WebDriver driver)
	{
		WebElement unitSuite = driver.findElement(By.xpath("//input[@id='VendorEdit_Address2']"));

		return unitSuite;
	}

	public static WebElement postalCode(WebDriver driver)
	{
		WebElement postalCode = driver.findElement(By.xpath("//input[@id='VendorEdit_PostalCode']"));

		return postalCode;
	}
	
	public static WebElement workPhone(WebDriver driver)
	{
		WebElement workPhone = driver.findElement(By.xpath("//input[@id='VendorEdit_WorkPhone']"));

		return workPhone;
	}

	public static WebElement mobilePhone(WebDriver driver)
	{
		WebElement mobilePhone = driver.findElement(By.xpath("//input[@id='VendorEdit_MobilePhone']"));

		return mobilePhone;
	}

	public static WebElement email(WebDriver driver)
	{
		WebElement email = driver.findElement(By.xpath("//input[@id='VendorEdit_Email']"));

		return email;
	}

	public static WebElement dailyCapacity(WebDriver driver)
	{
		WebElement dailyCapacity = driver.findElement(By.xpath("//input[@id='VendorEdit_DailyCapacity']"));

		return dailyCapacity;
	}

	public static WebElement totalCapacity(WebDriver driver)
	{
		WebElement totalCapacity = driver.findElement(By.xpath("//input[@id='VendorEdit_TotalCapacity']"));

		return totalCapacity;
	}

	public static WebElement AutoAssign(WebDriver driver)
	{
		WebElement AutoAssign = driver.findElement(By.xpath("//input[@id='VendorEdit_AutoAssignApproved']"));

		return AutoAssign;
	}

	public static WebElement AutoAccept(WebDriver driver)
	{
		WebElement AutoAccept = driver.findElement(By.xpath("//input[@id='VendorEdit_AutoAcceptApproved']"));

		return AutoAccept;
	}

	public static WebElement saveVendor(WebDriver driver)
	{
		WebElement saveVendor = driver.findElement(By.xpath("//button[@id='vendorFormSubmitBtn']"));

		return saveVendor;
	}

	// vendor dash board elements
	
	public static WebElement vendorID(WebDriver driver)
	{
		WebElement vendorID = driver.findElement(By.xpath("//div[@id='vendorSummary']/div/div[1]/div[2]"));

		return vendorID;
	}

	public static WebElement vendorName(WebDriver driver)
	{
		WebElement vendorName = driver.findElement(By.xpath("//div[@id='vendorSummary']/div/div[1]/div[4]"));

		return vendorName;
	}
	
}
