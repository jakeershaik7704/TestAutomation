package POM.ClientPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateBranch {

	public static WebElement createBranch(WebDriver driver)
	{
		WebElement createBranch = driver.findElement(By.xpath("//div[@id='branchesTabContent']/section[2]/div/div/div/button[1]"));

		return createBranch;
	}

	public static WebElement branchName(WebDriver driver)
	{
		WebElement branchName = driver.findElement(By.xpath("//input[@id='BranchEdit_BranchName']"));

		return branchName;
	}

	public static WebElement branchType(WebDriver driver)
	{
		WebElement branchType = driver.findElement(By.xpath("//select[@id='BranchEdit_BranchTypeID']"));

		return branchType;
	}

	public static WebElement SalesPerson(WebDriver driver)
	{
		WebElement SalesPerson = driver.findElement(By.xpath("//select[@id='BranchEdit_SalesPersonID']"));

		return SalesPerson;
	}

	public static WebElement feeSchedule(WebDriver driver)
	{
		WebElement feeSchedule = driver.findElement(By.xpath("//select[@id='BranchEdit_FeeScheduleID']"));

		return feeSchedule;
	}

	public static WebElement feeAdjustmentSchedule(WebDriver driver)
	{
		WebElement feeAdjustmentSchedule = driver.findElement(By.xpath("//select[@id='BranchEdit_FeeAdjustmentScheduleID']"));

		return feeAdjustmentSchedule;
	}

	public static WebElement attension(WebDriver driver)
	{
		WebElement attension = driver.findElement(By.xpath("//input[@id='BranchEdit_StreetAddressAttention']"));

		return attension;
	}

	public static WebElement Address1(WebDriver driver)
	{
		WebElement Address1 = driver.findElement(By.xpath("//input[@id='BranchEdit_StreetAddress1']"));

		return Address1;
	}

	public static WebElement Address2(WebDriver driver)
	{
		WebElement Address2 = driver.findElement(By.xpath("//input[@id='BranchEdit_StreetAddress2']"));

		return Address2;
	}

	public static WebElement postalCode(WebDriver driver)
	{
		WebElement postalCode = driver.findElement(By.xpath("//input[@id='BranchEdit_StreetAddressPostalCode']"));

		return postalCode;
	}

	public static WebElement timeZone(WebDriver driver)
	{
		WebElement timeZone = driver.findElement(By.xpath("//select[@id='BranchEdit_TimeZoneID']"));

		return timeZone;
	}

	public static WebElement AutoAssignApproved(WebDriver driver)
	{
		WebElement AutoAssignApproved = driver.findElement(By.xpath("//input[@id='BranchEdit_AutoAssignApproved']"));

		return AutoAssignApproved;
	}

	public static WebElement sendHardCopy(WebDriver driver)
	{
		WebElement sendHardCopy = driver.findElement(By.xpath("//input[@id='BranchEdit_HardCopy']"));

		return sendHardCopy;
	}

	public static WebElement SendClientContactsPaymentRequest(WebDriver driver)
	{
		WebElement SendClientContactsPaymentRequest = driver.findElement(By.xpath("//input[@id='BranchEdit_SendClientContactsPaymentRequest']"));

		return SendClientContactsPaymentRequest;
	}

	public static WebElement IntegrationMilestones(WebDriver driver)
	{
		WebElement IntegrationMilestones = driver.findElement(By.xpath("//*[@id=\"BranchEdit_SendMilestonesViaIntegration\"]"));

		return IntegrationMilestones;
	}

	public static WebElement IntegrationComments(WebDriver driver)
	{
		WebElement IntegrationComments = driver.findElement(By.xpath("//*[@id=\"BranchEdit_SendCommentsViaIntegration\"]"));

		return IntegrationComments;
	}

	public static WebElement invoiceMethod(WebDriver driver)
	{
		WebElement invoiceMethod = driver.findElement(By.xpath("//select[@id='BranchEdit_InvoiceType']"));

		return invoiceMethod;
	}

	public static WebElement ClientOrderContact(WebDriver driver)
	{
		WebElement ClientOrderContact = driver.findElement(By.xpath("//input[@id='BranchEdit_ClientOrderContact']"));

		return ClientOrderContact;
	}

	public static WebElement MultipleRecipients(WebDriver driver)
	{
		WebElement MultipleRecipients = driver.findElement(By.xpath("//input[@id='BranchEdit_MultipleRecipients']"));

		return MultipleRecipients;
	}
	
	public static WebElement BatchInvoicing(WebDriver driver)
	{
		WebElement BatchInvoicing = driver.findElement(By.xpath("//input[@id='BranchEdit_BatchInvoicing']"));

		return BatchInvoicing;
	}

	public static WebElement Ok(WebDriver driver)
	{
		WebElement saveBranch = driver.findElement(By.xpath("(//button[@type='button'])[9]"));

		return saveBranch;
	}

	// Branch dash board elements
	
	public static WebElement branchID(WebDriver driver)
	{
		WebElement branchID = driver.findElement(By.xpath("//div[@id='branchSummary']/div/div[1]/div[2]"));

		return branchID;
	}

	public static WebElement branchName_dash(WebDriver driver)
	{
		WebElement branchName_dash = driver.findElement(By.xpath("//div[@id='branchSummary']/div/div[1]/div[4]"));

		return branchName_dash;
	}

}
