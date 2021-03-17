package POM.Orders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderTabs {

	public static WebElement Confirm(WebDriver driver)
	{
		WebElement Confirm = driver.findElement(By.xpath("//button[@onclick='confirmOrderItem()']"));

		return Confirm;
	}

	public static WebElement ResolveEscaltion_1(WebDriver driver)
	{
		WebElement ResolveEscaltion_1 = driver.findElement(By.xpath("//button[@onclick='processEscalation(false)']"));

		return ResolveEscaltion_1;
	}

	public static WebElement ResolveEscaltion_2(WebDriver driver)
	{
		WebElement ResolveEscaltion_2 = driver.findElement(By.xpath("//button[@id='btnProcessEscalation']"));

		return ResolveEscaltion_2;
	}

	// Assign

	public static WebElement Assign(WebDriver driver)
	{
		WebElement Assign = driver.findElement(By.xpath("//button[@id='btnAssignment']"));

		return Assign;
	}

	public static WebElement a_Assign(WebDriver driver)
	{
		WebElement a_Assign = driver.findElement(By.xpath("//a[@onclick='assignOrderItem()']"));

		return a_Assign;
	}

	public static WebElement vendor_divInformation(WebDriver driver)
	{
		WebElement vendor_divInformation = driver.findElement(By.xpath("//tr[@id='1']/td[3]/div"));

		return vendor_divInformation;
	}

	public static WebElement first_Assign(WebDriver driver)
	{
		WebElement first_Assign = driver.findElement(By.xpath("//button[@id='btnAssign']"));

		return first_Assign;
	}

	public static WebElement confirm_Assign(WebDriver driver)
	{
		WebElement confirm_Assign = driver.findElement(By.xpath("//button[@id='btnConfirmSubmit']"));

		return confirm_Assign;
	}

	// Notification banners

	public static WebElement Notification1(WebDriver driver)
	{
		WebElement Notification1 = driver.findElement(By.xpath("//*[@id=\"TaxIDAlert\"]/button"));

		return Notification1;
	}

	public static WebElement Notification2(WebDriver driver)
	{
		WebElement Notification2 = driver.findElement(By.xpath("//*[@id=\"EOInsAlert\"]/button"));

		return Notification2;
	}

	public static WebElement Notification3(WebDriver driver)
	{
		WebElement Notification3 = driver.findElement(By.xpath("//*[@id=\"NoBackgroundCheckAlert\"]/button"));

		return Notification3;
	}

	// vendor accept

	public static WebElement vendorAccept(WebDriver driver)
	{
		WebElement vendorAccept = driver.findElement(By.xpath("//a[@onclick='vendorAcceptOrderItem()']"));

		return vendorAccept;
	}

	public static WebElement confirmVendorAccept(WebDriver driver)
	{
		WebElement confirmVendorAccept = driver.findElement(By.xpath("//button[@id='btnAccept']"));

		return confirmVendorAccept;
	}

	public static WebElement recentOrderAlert(WebDriver driver)
	{
		WebElement recentOrderAlert = driver.findElement(By.xpath("//*[@id=\"recentOrderAlert\"]/button"));

		return recentOrderAlert;
	}

	// add documents

	public static WebElement Documents(WebDriver driver)
	{
		WebElement Documents = driver.findElement(By.xpath("//li[@id='documentsTab']/a"));

		return Documents;
	}

	public static WebElement Add_Documents(WebDriver driver)
	{
		WebElement Add_Documents = driver.findElement(By.xpath("//button[@onclick=\"$('#documentModal').data('bs.modal').show();\"]"));

		return Add_Documents;
	}

	public static WebElement selectDocumentType(WebDriver driver)
	{
		WebElement Add_Documents = driver.findElement(By.xpath("//select[@id='Document_Type_DocumentTypeID']"));

		return Add_Documents;
	}

	public static WebElement uploadFile(WebDriver driver)
	{
		WebElement uploadFile = driver.findElement(By.xpath("//input[@id='upload']"));

		return uploadFile;
	}

	public static WebElement uploadDocumentBtn(WebDriver driver)
	{
		WebElement uploadDocumentBtn = driver.findElement(By.xpath("//button[@id='btnAddDocument']"));

		return uploadDocumentBtn;
	}

	// Quality Control

	public static WebElement QualityControl(WebDriver driver)
	{
		WebElement QualityControl = driver.findElement(By.xpath("//*[@id=\"actionButtons\"]/div/div[3]/button"));

		return QualityControl;
	}

	public static WebElement ApproveBtn(WebDriver driver)
	{
		WebElement ApproveBtn = driver.findElement(By.xpath("//a[@onclick='approveOrderItem()']"));

		return ApproveBtn;
	}

	public static WebElement ApproveThisOrderBtn(WebDriver driver)
	{
		WebElement ApproveThisOrderBtn = driver.findElement(By.xpath("//button[@id='OkButton']"));

		return ApproveThisOrderBtn;
	}
}
