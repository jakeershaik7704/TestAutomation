package POM.ProductsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateProduct {

	public static WebElement configurations(WebDriver driver)
	{
		WebElement configurations = driver.findElement(By.xpath("//div[@id='header']/div[2]/ul/li[9]/a/span"));

		return configurations;
	}

	public static WebElement Products(WebDriver driver)
	{
		WebElement Products = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/ul/li[9]/ul/li[16]/a/span"));

		return Products;
	}

	public static WebElement addProducts(WebDriver driver)
	{
		WebElement addProducts = driver.findElement(By.xpath("//button[@id='addProductBtn']"));

		return addProducts;
	}

	public static WebElement productName(WebDriver driver)
	{
		WebElement productName = driver.findElement(By.xpath("//input[@id='Product_ProductName']"));

		return productName;
	}

	public static WebElement AbbreviationName(WebDriver driver)
	{
		WebElement AbbreviationName = driver.findElement(By.xpath("//input[@id='Product_Abbreviation']"));

		return AbbreviationName;
	}

	public static WebElement VendorProductName(WebDriver driver)
	{
		WebElement VendorProductName = driver.findElement(By.xpath("//input[@id='Product_VendorProductName']"));

		return VendorProductName;
	}

	public static WebElement FormCode(WebDriver driver)
	{
		WebElement FormCode = driver.findElement(By.xpath("//input[@id='Product_FormCode']"));

		return FormCode;
	}

	public static WebElement produtType(WebDriver driver)
	{
		WebElement produtType = driver.findElement(By.xpath("//select[@id='Product_ProductTypeID']"));

		return produtType;
	}

	public static WebElement clientWillBilled(WebDriver driver)
	{
		WebElement clientWillBilled = driver.findElement(By.xpath("//input[@id='Product_Billable']"));

		return clientWillBilled;
	}

	public static WebElement acceptableMargin(WebDriver driver)
	{
		WebElement acceptableMargin = driver.findElement(By.xpath("//input[@id='Product_AcceptableMargin']"));

		return acceptableMargin;
	}

	public static WebElement Department(WebDriver driver)
	{
		WebElement Department = driver.findElement(By.xpath("//input[@id='Product_Department']"));

		return Department;
	}

	public static WebElement Category(WebDriver driver)
	{
		WebElement Category = driver.findElement(By.xpath("//input[@id='Product_Category']"));

		return Category;
	}

	public static WebElement Division(WebDriver driver)
	{
		WebElement Division = driver.findElement(By.xpath("//input[@id='Product_Division']"));

		return Division;
	}

	public static WebElement ServiceLine(WebDriver driver)
	{
		WebElement ServiceLine = driver.findElement(By.xpath("//input[@id='Product_ServiceLine']"));

		return ServiceLine;
	}

	public static WebElement ClientSLA(WebDriver driver)
	{
		WebElement ClientSLA = driver.findElement(By.xpath("//input[@id='Product_ClientSLA']"));

		return ClientSLA;
	}

	public static WebElement canClientOrderThisProduct(WebDriver driver)
	{
		WebElement Orderable = driver.findElement(By.xpath("//input[@id='Product_IsOrderable']"));

		return Orderable;
	}

	public static WebElement deliverToClient(WebDriver driver)
	{
		WebElement deliverToClient = driver.findElement(By.xpath("//input[@id='Product_IsDeliverable']"));

		return deliverToClient;
	}

	public static WebElement FHACaseNumberNeeded(WebDriver driver)
	{
		WebElement FHACaseNumberNeeded = driver.findElement(By.xpath("//input[@id='Product_FHACaseNumberNeeded']"));

		return FHACaseNumberNeeded;
	}
	
	public static WebElement LoanNumberNeeded(WebDriver driver)
	{
		WebElement LoanNumberNeeded = driver.findElement(By.xpath("//input[@id='Product_LoanNumberNeeded']"));

		return LoanNumberNeeded;
	}

	public static WebElement BorrowerNameNeeded(WebDriver driver)
	{
		WebElement BorrowerNameNeeded = driver.findElement(By.xpath("//input[@id='Product_BorrowerNameNeeded']"));

		return BorrowerNameNeeded;
	}

	public static WebElement AccessContactNeeded(WebDriver driver)
	{
		WebElement AccessContactNeeded = driver.findElement(By.xpath("//input[@id='Product_AccessContactNeeded']"));

		return AccessContactNeeded;
	}

	public static WebElement BundleFinalReport(WebDriver driver)
	{
		WebElement BundleFinalReport = driver.findElement(By.xpath("//input[@id='Product_BundleFinalReport']"));

		return BundleFinalReport;
	}

	public static WebElement IsLicenseRequired(WebDriver driver)
	{
		WebElement IsLicenseRequired = driver.findElement(By.xpath("//input[@id='Product_IsLicenseRequired']"));

		return IsLicenseRequired;
	}

	public static WebElement FHAApprovalNeeded(WebDriver driver)
	{
		WebElement FHAApprovalNeeded = driver.findElement(By.xpath("//input[@id='Product_FHAApprovalNeeded']"));

		return FHAApprovalNeeded;
	}

	public static WebElement canAssignAutomatically(WebDriver driver)
	{
		WebElement canAssignAutomatically = driver.findElement(By.xpath("//input[@id='automatedFulfillment']"));

		return canAssignAutomatically;
	}

	public static WebElement assignmentNoticeSent(WebDriver driver)
	{
		WebElement assignmentNoticeSent = driver.findElement(By.xpath("//input[@id='Product_RequestNeeded']"));

		return assignmentNoticeSent;
	}

	public static WebElement conditionallyAccept(WebDriver driver)
	{
		WebElement conditionallyAccept = driver.findElement(By.xpath("//input[@id='Product_AllowsConditionals']"));

		return conditionallyAccept;
	}

	public static WebElement reportSeenByOtherVendors(WebDriver driver)
	{
		WebElement reportSeenByOtherVendors = driver.findElement(By.xpath("//input[@id='Product_ShareFinalReport']"));

		return reportSeenByOtherVendors;
	}

	public static WebElement VendorSLA(WebDriver driver)
	{
		WebElement VendorSLA = driver.findElement(By.xpath("//input[@id='Product_VendorSLA']"));

		return VendorSLA;
	}

	public static WebElement capaityWeight(WebDriver driver)
	{
		WebElement capaityWeight = driver.findElement(By.xpath("//input[@id='Product_Weight']"));

		return capaityWeight;
	}

	public static WebElement BypassDupeCheck(WebDriver driver)
	{
		WebElement BypassDupeCheck = driver.findElement(By.xpath("//input[@id='Product_BypassDupeCheck']"));

		return BypassDupeCheck;
	}

	public static WebElement QualityControllRequired(WebDriver driver)
	{
		WebElement QualityControllRequired = driver.findElement(By.xpath("//input[@id='Product_QualityControlled']"));

		return QualityControllRequired;
	}

	public static WebElement fullyAutomatedProduct(WebDriver driver)
	{
		WebElement fullyAutomatedProduct = driver.findElement(By.xpath("//input[@id='Product_AutomatedFulfillment']"));

		return fullyAutomatedProduct;
	}
	
	public static WebElement IsProductAddendum(WebDriver driver)
	{
		WebElement fullyAutomatedProduct = driver.findElement(By.xpath("//input[@id='Product_IsAddendum']"));

		return fullyAutomatedProduct;
	}

	public static WebElement HideOrderItem(WebDriver driver)
	{
		WebElement HideOrderItem = driver.findElement(By.xpath("//input[@id='Product_HideOrderItem']"));

		return HideOrderItem;
	}

	public static WebElement saveProduct(WebDriver driver)
	{
		WebElement saveProduct = driver.findElement(By.xpath("//button[@id='productFormSubmitBtn']"));

		return saveProduct;
	}

	// product dash board elements
	
	public static WebElement productID(WebDriver driver)
	{
		WebElement saveProduct = driver.findElement(By.xpath("//div[@id='productSummary']/div/div[1]/div[2]"));

		return saveProduct;
	}

	public static WebElement productClientName(WebDriver driver)
	{
		WebElement productClientName = driver.findElement(By.xpath("//div[@id='productSummary']/div/div/div[4]"));

		return productClientName;
	}

	public static WebElement productVendorName(WebDriver driver)
	{
		WebElement productVendorName = driver.findElement(By.xpath("//div[@id='productSummary']/div/div/div[6]"));

		return productVendorName;
	}
}
