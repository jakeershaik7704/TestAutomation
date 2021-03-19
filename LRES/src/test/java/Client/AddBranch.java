package Client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import Master.Login;
import Master.ReadTestData;
import POM.ClientPage.ClientSearchPage;
import POM.ClientPage.ClientTabs;
import POM.ClientPage.CreateBranch;
import POM.ClientPage.CreateClient;

// git testng

public class AddBranch {

	public static int rowNum = 183;

	public static String table ;
	public static String clientTable ;

	@Test
	public static void addBranchConfig() throws Exception {

		try {
			// login to application

			Login.login();

			// creating branch

			table = Login.prop.getProperty("branchTable");

			clientTable= Login.prop.getProperty("clientTable");

			WebElement clients =CreateClient.clients(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(clients));

			clients.click();

			Thread.sleep(3000);

			String clientID = ReadTestData.readTestData(3, rowNum, clientTable);
			System.out.println(clientID);
			
			WebElement searchWithID =ClientSearchPage.clientOrBranchID(Login.driver);

			searchWithID.sendKeys(clientID);

			WebElement searchClient =ClientSearchPage.search(Login.driver);

			searchClient.click();

			Thread.sleep(3000);

			WebElement client  =Login.driver.findElement(By.xpath("//*[@id="+clientID+"]/td[3]/a"));

			client.click();

			Thread.sleep(5000);

			ClientTabs.branchesOrDivisions(Login.driver).click();

			Thread.sleep(3000);

			CreateBranch.createBranch(Login.driver).click();

			Thread.sleep(5000);

			WebElement branchName =CreateBranch.branchName(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(branchName));

			String expectedBranchName = ReadTestData.readTestData(3, rowNum, table);

			branchName.sendKeys(expectedBranchName);

			String expectedBranchType = ReadTestData.readTestData(5, rowNum, table);

			Select branchType = new Select (CreateBranch.branchType(Login.driver));

			branchType.selectByVisibleText(expectedBranchType);

			Select salesPerson = new Select (CreateBranch.SalesPerson(Login.driver));

			salesPerson.selectByVisibleText(ReadTestData.readTestData(8, rowNum, table));

			if (!(expectedBranchType.equals("Brokerage"))) {

				Select feeSchedule = new Select (CreateBranch.feeSchedule(Login.driver));

				feeSchedule.selectByVisibleText(ReadTestData.readTestData(12, rowNum, table));

				Select feeAdjustment = new Select (CreateBranch.feeAdjustmentSchedule(Login.driver));

				feeAdjustment.selectByVisibleText(ReadTestData.readTestData(13, rowNum, table));
			}

			CreateBranch.attension(Login.driver).sendKeys(ReadTestData.readTestData(16, rowNum, table));

			CreateBranch.Address1(Login.driver).sendKeys(ReadTestData.readTestData(17, rowNum, table));

			CreateBranch.Address2(Login.driver).sendKeys(ReadTestData.readTestData(18, rowNum, table));

			CreateBranch.postalCode(Login.driver).sendKeys(ReadTestData.readTestData(19, rowNum, table));

			if (ReadTestData.readTestData(24, rowNum, table).equals("Y"))
			{
				CreateBranch.AutoAssignApproved(Login.driver).click();
			}
			if (ReadTestData.readTestData(25, rowNum, table).equals("Y"))
			{
				CreateBranch.sendHardCopy(Login.driver).click();
			}
			if (ReadTestData.readTestData(26, rowNum, table).equals("Y"))
			{
				CreateBranch.SendClientContactsPaymentRequest(Login.driver).click();
			}
			if (ReadTestData.readTestData(27, rowNum, table).equals("Y"))
			{
				CreateBranch.IntegrationMilestones(Login.driver).click();
			}
			if (ReadTestData.readTestData(28, rowNum, table).equals("Y"))
			{
				CreateBranch.IntegrationComments(Login.driver).click();
			}

			if ((expectedBranchType.equals("Brokerage"))) {

				Select invoiceMethod = new Select (CreateBranch.invoiceMethod(Login.driver));

				invoiceMethod.selectByVisibleText(ReadTestData.readTestData(46, rowNum, table));

				if (ReadTestData.readTestData(47, rowNum, table).equals("Y"))
				{
					CreateBranch.ClientOrderContact(Login.driver).click();
				}
				if (ReadTestData.readTestData(48, rowNum, table).equals("Y"))
				{
					CreateBranch.MultipleRecipients(Login.driver).click();
				}
				if (ReadTestData.readTestData(49, rowNum, table).equals("Y"))
				{
					CreateBranch.BatchInvoicing(Login.driver).click();
				}
			}

			Thread.sleep(5000);

			CreateBranch.Ok(Login.driver).click();

			Thread.sleep(10000);

			// inserting branch id into database

			String branchID = CreateBranch.branchID(Login.driver).getText();

			System.out.println(branchID);

			String query = "UPDATE Branches SET Auto_generated_Branch_ID ="+branchID+" where Branch_Name = "+"'"+expectedBranchName+"'";

			System.out.println(query);

			ReadTestData.insertTestData(query);

			Thread.sleep(8000);

			WebElement branchName_dash =CreateBranch.branchName_dash(Login.driver);

			String actualBranchName = branchName_dash.getText();

			System.out.println(actualBranchName);

			Assert.assertEquals(actualBranchName, expectedBranchName);
			
			Login.driver.quit();

		}catch (Exception ex){
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace(); 
			Login.driver.quit();
		}
	}

}
