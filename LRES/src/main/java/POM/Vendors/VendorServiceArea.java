package POM.Vendors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VendorServiceArea {

	public static WebElement addServiceArea(WebDriver driver)
	{
		WebElement addServiceArea = driver.findElement(By.xpath("//button[@onclick=\"modifyServiceArea('', null)\"]"));

		return addServiceArea;
	}

	public static WebElement serviceAreaName(WebDriver driver)
	{
		WebElement serviceAreaName = driver.findElement(By.xpath("//input[@id='serviceAreaDescription']"));

		return serviceAreaName;
	}

	public static WebElement saveServiceAreaButton1(WebDriver driver)
	{
		WebElement saveButton1 = driver.findElement(By.xpath("//button[@id='btnSaveServiceArea']"));

		return saveButton1;
	}

	public static WebElement editProductFees(WebDriver driver)
	{
		WebElement editProduct = driver.findElement(By.xpath("//*[@class=\"jqgrow ui-row-ltr\"]/td[4]/a"));

		return editProduct;
	}

	public static WebElement productType_AssetManagement(WebDriver driver)
	{
		WebElement productType_AssetManagement = driver.findElement(By.xpath("//*[@id='accordion']//*[text()='Asset Management']"));

		return productType_AssetManagement;
	}

	public static WebElement productNameLabel(WebDriver driver)
	{
		WebElement productNameLabel = driver.findElement(By.xpath(("//label[@id='productName']")));

		return productNameLabel;
	}

	public static WebElement NewFee(WebDriver driver)
	{
		WebElement NewFee = driver.findElement(By.xpath(("//input[@id='editFee']")));

		return NewFee;
	}

	public static WebElement AssignApproved(WebDriver driver)
	{
		WebElement AssignApproved = driver.findElement(By.xpath(("//input[@id='chkAutoAssignApproved']")));

		return AssignApproved;
	}

	public static WebElement saveFeeButton1(WebDriver driver)
	{
		WebElement saveFeeButton1 = driver.findElement(By.xpath(("//button[@id='btnSaveFee']")));

		return saveFeeButton1;
	}

	public static WebElement saveFeeButton2(WebDriver driver)
	{
		WebElement saveFeeButton2 = driver.findElement(By.xpath(("//button[@id='btnSaveServiceArea']")));

		return saveFeeButton2;
	}

	public static WebElement geographicRegion(WebDriver driver)
	{
		WebElement geographicRegion = driver.findElement(By.xpath(("//*[@class=\"jqgrow ui-row-ltr\"]/td[5]/a")));

		return geographicRegion;
	}

	public static WebElement addStateButton(WebDriver driver)
	{
		WebElement addStateButton = driver.findElement(By.xpath(("//button[@id='btnAddNewState']")));

		return addStateButton;
	}

	public static WebElement selectState(WebDriver driver)
	{
		WebElement selectState = driver.findElement(By.xpath(("//select[@id='stateID']")));

		return selectState;
	}

	public static WebElement saveState(WebDriver driver)
	{
		WebElement saveState = driver.findElement(By.xpath(("//button[@id='btnAddState']")));

		return saveState;
	}

	public static WebElement stateCheckBoxLabel(WebDriver driver)
	{
		WebElement stateCheckBoxLabel = driver.findElement(By.xpath(("//*[@id=\"stateList\"]/li[2]")));

		return stateCheckBoxLabel;
	}

	public static WebElement stateCheckBox(WebDriver driver)
	{
		WebElement stateCheckBox = driver.findElement(By.xpath(("//*[@id=\"stateList\"]/li[2]/span[2]/input[1]")));

		return stateCheckBox;
	}

	public static WebElement saveGeographicRegion(WebDriver driver)
	{
		WebElement saveGeographicRegion = driver.findElement(By.xpath(("//button[@id='btnSaveServiceArea']")));

		return saveGeographicRegion;
	}
	
}
