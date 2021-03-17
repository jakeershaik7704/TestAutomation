package Client;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Master.Login;
import Master.ReadTestData;
import POM.ClientPage.CreateClient;
import org.openqa.selenium.support.ui.Select;

public class createClient {

	public static int rowNum = 183;

	public static String table ;

	@Test
	public static void CreateClientConfig() throws Exception {

		try {
			Login.login();

			table = Login.prop.getProperty("clientTable");
			
			WebElement clients =CreateClient.clients(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(clients));

			clients.click();

			Thread.sleep(3000);

			CreateClient.createClient(Login.driver).click();

			WebElement companyName =CreateClient.companyName(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(companyName));

			String expectedClientName = ReadTestData.readTestData(4, rowNum, table);

			companyName.sendKeys(expectedClientName);

			Select feeSchedule = new Select (CreateClient.feeSchedule(Login.driver));

			feeSchedule.selectByVisibleText(ReadTestData.readTestData(10, rowNum, table));

			Select feeAdjustment = new Select (CreateClient.feeAdjustmentSchedule(Login.driver));

			feeAdjustment.selectByVisibleText(ReadTestData.readTestData(11, rowNum, table));

			Select vendorFeeDetermination = new Select (CreateClient.vendorFeeDetermination(Login.driver));

			vendorFeeDetermination.selectByVisibleText(ReadTestData.readTestData(12, rowNum, table));

			Select vendorFeeSchedule = new Select (CreateClient.vendorFeeSchedule(Login.driver));

			vendorFeeSchedule.selectByVisibleText(ReadTestData.readTestData(13, rowNum, table));

			if (ReadTestData.readTestData(14, rowNum, table).equals("Y"))
			{
				CreateClient.prepaidOnly(Login.driver).click();
			}
			if (ReadTestData.readTestData(15, rowNum, table).equals("Y"))
			{
				CreateClient.delayPrepaymentUntillInspection(Login.driver).click();
			}
			if (ReadTestData.readTestData(16, rowNum, table).equals("Y"))
			{
				CreateClient.centralizedBilling(Login.driver).click();
			}
			if (ReadTestData.readTestData(17, rowNum, table).equals("Y"))
			{
				CreateClient.useInvoiceCloud(Login.driver).click();
			}
			if (ReadTestData.readTestData(18, rowNum, table).equals("Y"))
			{
				CreateClient.useReferenceNumber(Login.driver).click();
			}
			if (ReadTestData.readTestData(19, rowNum, table).equals("Y"))
			{
				CreateClient.reseller(Login.driver).click();
			}
			Select resellerClient = new Select (CreateClient.ResellerClientID(Login.driver));

			resellerClient.selectByVisibleText(ReadTestData.readTestData(20, rowNum, table));

			CreateClient.attention(Login.driver).sendKeys(ReadTestData.readTestData(23, rowNum, table));

			CreateClient.streetAddress1(Login.driver).sendKeys(ReadTestData.readTestData(24, rowNum, table));

			CreateClient.streetAddress2(Login.driver).sendKeys(ReadTestData.readTestData(25, rowNum, table));

			CreateClient.postalCode(Login.driver).sendKeys(ReadTestData.readTestData(26, rowNum, table));

			Select invoiceMethod = new Select (CreateClient.invoiceMethod(Login.driver));

			invoiceMethod.selectByVisibleText(ReadTestData.readTestData(29, rowNum, table));

			Select appraiserQualification = new Select (CreateClient.appraiserQualification(Login.driver));

			appraiserQualification.selectByVisibleText(ReadTestData.readTestData(31, rowNum, table));

			CreateClient.allowableProximity(Login.driver).sendKeys(ReadTestData.readTestData(33, rowNum, table));

			if (ReadTestData.readTestData(35, rowNum, table).equals("Y"))
			{
				CreateClient.vendorConfirmAppointment(Login.driver).click();
			}
			if (ReadTestData.readTestData(74, rowNum, table).equals("Y"))
			{
				CreateClient.IntegrationMilestones(Login.driver).click();
			}
			if (ReadTestData.readTestData(75, rowNum, table).equals("Y"))
			{
				CreateClient.IntegrationComments(Login.driver).click();
			}

			Select dateFormate = new Select (CreateClient.DateFormate(Login.driver));

			dateFormate.selectByVisibleText(ReadTestData.readTestData(38, rowNum, table));

			CreateClient.OK(Login.driver).click();

			Thread.sleep(10000);

			// insert client id into database

			String clientID = CreateClient.clientID(Login.driver).getText(); 

			System.out.println(clientID);

			String query = "UPDATE Clients SET Auto_Generated_Client_ID ="+clientID+" where Company_Name = "+"'"+expectedClientName+"'";

			System.out.println(query);

			ReadTestData.insertTestData(query);

			Thread.sleep(8000);

			WebElement companyName_dash =CreateClient.companyName_dash(Login.driver);

			String actualClientName = companyName_dash.getText();

			System.out.println(actualClientName);

			Assert.assertEquals(actualClientName, expectedClientName);

			Login.driver.quit();
			
		}catch (Exception ex){
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace(); 
			Login.driver.quit();
		}
	}
}
