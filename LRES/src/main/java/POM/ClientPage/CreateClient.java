package POM.ClientPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateClient {

	public static WebElement clients(WebDriver driver)
	{
		WebElement clients = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/ul/li[1]/a/span"));

		return clients;
	}

	public static WebElement createClient(WebDriver driver)
	{
		WebElement createClient = driver.findElement(By.xpath("//button[@onclick='createClient();']"));

		return createClient;
	}

	public static WebElement companyName(WebDriver driver)
	{
		WebElement createClient = driver.findElement(By.xpath("//input[@id='ClientEdit_ClientName']"));

		return createClient;
	}

	public static WebElement feeSchedule(WebDriver driver)
	{
		WebElement feeSchedule = driver.findElement(By.xpath("//select[@id='ClientEdit_FeeScheduleID']"));

		return feeSchedule;
	}

	public static WebElement feeAdjustmentSchedule(WebDriver driver)
	{
		WebElement feeAdjustmentSchedule = driver.findElement(By.xpath("//select[@id='ClientEdit_FeeAdjustmentScheduleID']"));

		return feeAdjustmentSchedule;
	}

	public static WebElement vendorFeeDetermination(WebDriver driver)
	{
		WebElement vendorFeeDetermination = driver.findElement(By.xpath("//select[@id='ClientEdit_VendorFeeTypeID']"));

		return vendorFeeDetermination;
	}

	public static WebElement vendorFeeSchedule(WebDriver driver)
	{
		WebElement vendorFeeSchedule = driver.findElement(By.xpath("//select[@id='ClientEdit_VendorFeeScheduleID']"));

		return vendorFeeSchedule;
	}

	public static WebElement prepaidOnly(WebDriver driver)
	{
		WebElement prepaidOnly = driver.findElement(By.xpath("//input[@id='ClientEdit_Prepaid']"));

		return prepaidOnly;
	}

	public static WebElement delayPrepaymentUntillInspection(WebDriver driver)
	{
		WebElement delayPrepayment = driver.findElement(By.xpath("//input[@id='ClientEdit_DelayPayment']"));

		return delayPrepayment;
	}

	public static WebElement centralizedBilling(WebDriver driver)
	{
		WebElement centralizedBilling = driver.findElement(By.xpath("//input[@id='ClientEdit_CentralBilling']"));

		return centralizedBilling;
	}

	public static WebElement useInvoiceCloud(WebDriver driver)
	{
		WebElement useInvoiceCloud = driver.findElement(By.xpath("//input[@id='ClientEdit_UseInvoiceCloud']"));

		return useInvoiceCloud;
	}

	public static WebElement useReferenceNumber(WebDriver driver)
	{
		WebElement useReferenceNumber = driver.findElement(By.xpath("//input[@id='ClientEdit_UseReferenceNumber']"));

		return useReferenceNumber;
	}

	public static WebElement reseller(WebDriver driver)
	{
		WebElement reseller = driver.findElement(By.xpath("//input[@id='ClientEdit_Reseller']"));

		return reseller;
	}

	public static WebElement ResellerClientID(WebDriver driver)
	{
		WebElement ResellerClientID = driver.findElement(By.xpath("//select[@id='ClientEdit_ResellerClientID']"));

		return ResellerClientID;
	}

	public static WebElement attention(WebDriver driver)
	{
		WebElement attention = driver.findElement(By.xpath("//input[@id='ClientEdit_StreetAddressAttention']"));

		return attention;
	}

	public static WebElement streetAddress1(WebDriver driver)
	{
		WebElement streetAddress1 = driver.findElement(By.xpath("//input[@id='ClientEdit_StreetAddress1']"));

		return streetAddress1;
	}

	public static WebElement streetAddress2(WebDriver driver)
	{
		WebElement streetAddress2 = driver.findElement(By.xpath("//input[@id='ClientEdit_StreetAddress2']"));

		return streetAddress2;
	}

	public static WebElement postalCode(WebDriver driver)
	{
		WebElement postalCode = driver.findElement(By.xpath("//input[@id='ClientEdit_StreetAddressPostalCode']"));

		return postalCode;
	}

	public static WebElement invoiceMethod(WebDriver driver)
	{
		WebElement invoiceMethod = driver.findElement(By.xpath("//select[@id='ClientEdit_InvoiceType']"));

		return invoiceMethod;
	}

	public static WebElement appraiserQualification(WebDriver driver)
	{
		WebElement appraiserQualification = driver.findElement(By.xpath("//select[@id='ClientEdit_AppraiserQualificationPreferenceID']"));

		return appraiserQualification;
	}

	public static WebElement allowableProximity(WebDriver driver)
	{
		WebElement allowableProximity = driver.findElement(By.xpath("//input[@id='ClientEdit_AllowableProximity']"));

		return allowableProximity;
	}

	public static WebElement vendorConfirmAppointment(WebDriver driver)
	{
		WebElement vendorConfirmAppointment = driver.findElement(By.xpath("//input[@id='ClientEdit_ConfirmAppointment']"));

		return vendorConfirmAppointment;
	}

	public static WebElement IntegrationMilestones(WebDriver driver)
	{
		WebElement IntegrationMilestones = driver.findElement(By.xpath("//input[@id='ClientEdit_SendMilestonesViaIntegration']"));

		return IntegrationMilestones;
	}

	public static WebElement IntegrationComments(WebDriver driver)
	{
		WebElement IntegrationComments = driver.findElement(By.xpath("//input[@id='ClientEdit_SendCommentsViaIntegration']"));

		return IntegrationComments;
	}

	public static WebElement DateFormate(WebDriver driver)
	{
		WebElement DateFormate = driver.findElement(By.xpath("//select[@id='ClientEdit_IntegrationID']"));

		return DateFormate;
	}

	public static WebElement OK(WebDriver driver)
	{
		WebElement saveClient = driver.findElement(By.xpath("(//button[@type='button'])[9]"));

		return saveClient;
	}

	// client dash board elements
	
	public static WebElement companyName_dash(WebDriver driver)
	{
		WebElement companyName_dash = driver.findElement(By.xpath("//div[@id='clientSummary']/div/div[1]/div[4]"));

		return companyName_dash;
	}

	public static WebElement clientID(WebDriver driver)
	{
		WebElement clientID = driver.findElement(By.xpath("//div[@id='clientSummary']/div/div[1]/div[2]"));

		return clientID;
	}

}
