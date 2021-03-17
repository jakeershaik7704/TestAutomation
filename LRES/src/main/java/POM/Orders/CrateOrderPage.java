package POM.Orders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CrateOrderPage {

	public static WebElement OrderMenu(WebDriver driver)
	{
		WebElement OrderMenu = driver.findElement(By.xpath("//div[@id='header']/div[2]/ul/li[5]/a/span"));

		return OrderMenu;
	}

	public static WebElement createNewOrder(WebDriver driver)
	{
		WebElement OrderMenu = driver.findElement(By.xpath("//div[@id='header']/div[2]/ul/li[5]/ul/li[1]/a/span"));

		return OrderMenu;
	}

	public static WebElement selectClient(WebDriver driver)
	{
		WebElement selectClient = driver.findElement(By.xpath("//select[@id='OrderItemEdit_ClientID']"));

		return selectClient;
	}

	public static WebElement selectBranch(WebDriver driver)
	{
		WebElement selectBranch = driver.findElement(By.xpath("//select[@id='OrderItemEdit_ClientBranchID']"));

		return selectBranch;
	}

	public static WebElement selectProduct(WebDriver driver)
	{
		WebElement selectProduct = driver.findElement(By.xpath("//select[@id='OrderItemEdit_ProductID']"));

		return selectProduct;
	}

	public static WebElement selectPropertyType(WebDriver driver)
	{
		WebElement selectPropertyType = driver.findElement(By.xpath("//select[@id='OrderItemEdit_PropertyTypeID']"));

		return selectPropertyType;
	}

	public static WebElement address1(WebDriver driver)
	{
		WebElement address1 = driver.findElement(By.xpath("//input[@id='OrderItemEdit_Address1']"));

		return address1;
	}

	public static WebElement postalCode(WebDriver driver)
	{
		WebElement postalCode = driver.findElement(By.xpath("//input[@id='OrderItemEdit_PostalCode']"));

		return postalCode;
	}

	// contacts
	
	public static WebElement contacts(WebDriver driver)
	{
		WebElement postalCode = driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr/td/a"));

		return postalCode;
	}

	public static WebElement contactType(WebDriver driver)
	{
		WebElement contactType = driver.findElement(By.xpath("//select[@id='Contact_ContactTypeID']"));

		return contactType;
	}

	public static WebElement Contact_FirstName(WebDriver driver)
	{
		WebElement Contact_FirstName = driver.findElement(By.xpath("//input[@id='Contact_FirstName']"));

		return Contact_FirstName;
	}

	public static WebElement Contact_LastName(WebDriver driver)
	{
		WebElement Contact_LastName = driver.findElement(By.xpath("//input[@id='Contact_LastName']"));

		return Contact_LastName;
	}

	public static WebElement workPhone(WebDriver driver)
	{
		WebElement workPhone = driver.findElement(By.xpath("//input[@id='Contact_WorkPhone']"));

		return workPhone;
	}

	public static WebElement HomePhone(WebDriver driver)
	{
		WebElement HomePhone = driver.findElement(By.xpath("//input[@id='Contact_HomePhone']"));

		return HomePhone;
	}

	public static WebElement Fax(WebDriver driver)
	{
		WebElement Fax = driver.findElement(By.xpath("//input[@id='Contact_Fax']"));

		return Fax;
	}

	public static WebElement MobilePhone(WebDriver driver)
	{
		WebElement MobilePhone = driver.findElement(By.xpath("//input[@id='Contact_MobilePhone']"));

		return MobilePhone;
	}

	public static WebElement Email(WebDriver driver)
	{
		WebElement Email = driver.findElement(By.xpath("//input[@id='Contact_Email']"));

		return Email;
	}

	public static WebElement saveContact(WebDriver driver)
	{
		WebElement saveContact = driver.findElement(By.xpath("//button[@id='ContactButton']"));

		return saveContact;
	}

	public static WebElement selectLoanPurpose(WebDriver driver)
	{
		WebElement selectLoanPurpose = driver.findElement(By.xpath("//select[@id='OrderItemEdit_LoanPurposeID']"));

		return selectLoanPurpose;
	}

	public static WebElement LoanNumber(WebDriver driver)
	{
		WebElement LoanNumber = driver.findElement(By.xpath("//input[@id='OrderItemEdit_LoanNumber']"));

		return LoanNumber;
	}

	public static WebElement LoanAmount(WebDriver driver)
	{
		WebElement LoanAmount = driver.findElement(By.xpath("//input[@id='OrderItemEdit_LoanAmount']"));

		return LoanAmount;
	}

	public static WebElement FHACaseNumber(WebDriver driver)
	{
		WebElement FHACaseNumber = driver.findElement(By.xpath("//input[@id='OrderItemEdit_FHACaseNumber']"));

		return FHACaseNumber;
	}

	public static WebElement PropertyAccessInstructions(WebDriver driver)
	{
		WebElement PropertyAccessInstructions = driver.findElement(By.xpath("//textarea[@id='OrderItemEdit_NotesToVendor']"));

		return PropertyAccessInstructions;
	}

	public static WebElement LockboxCode(WebDriver driver)
	{
		WebElement LockboxCode = driver.findElement(By.xpath("//input[@id='OrderItemEdit_LockboxCode']"));

		return LockboxCode;
	}

	public static WebElement OK(WebDriver driver)
	{
		WebElement OK = driver.findElement(By.xpath("(//button[@type='button'])[6]"));

		return OK;
	}

}
