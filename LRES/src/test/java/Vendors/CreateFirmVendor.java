package Vendors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import Master.Login;
import Master.ReadTestData;
import POM.Vendors.CreateFirm;
import POM.Vendors.CreateVendor;
import POM.Vendors.FirmTabs;

public class CreateFirmVendor {

	public static int rowNum = 183;
	public static int firmRowNum = 183;

	public static String table ;

	public static String firmTable ;

	@Test
	public static void createVendorConfig() throws Exception {

		try {
			Login.login();

			firmTable = Login.prop.getProperty("FirmsTable");
			table = Login.prop.getProperty("VendorsTable");

			WebElement vendors =CreateFirm.vendorsMenu(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(vendors));

			Actions actions = new Actions(Login.driver);

			actions.moveToElement(vendors).perform();

			Thread.sleep(3000);

			WebElement firms = CreateFirm.Firms(Login.driver);

			actions.moveToElement(firms).click().build().perform();

			Thread.sleep(5000);

			String firmID = ReadTestData.readTestData(3, firmRowNum, firmTable);
			System.out.println(firmID);

			WebElement searchWithID =CreateFirm.vendorFirmID(Login.driver);

			searchWithID.sendKeys(firmID);

			WebElement searchFirm =CreateFirm.searchFirms(Login.driver);

			searchFirm.click();

			Thread.sleep(3000);

			WebElement firm  =Login.driver.findElement(By.xpath("//*[@id="+firmID+"]/td[1]/a"));

			firm.click();

			Thread.sleep(5000);

			FirmTabs.IndividualVendors(Login.driver).click();

			Thread.sleep(3000);

			CreateVendor.addVendor(Login.driver).click();

			Thread.sleep(5000);

			WebElement firstName =CreateVendor.FirstName(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(firstName));

			String expectedfirstName = ReadTestData.readTestData(3, rowNum, table);

			firstName.sendKeys(expectedfirstName);

			CreateVendor.LastName(Login.driver).sendKeys(ReadTestData.readTestData(4, rowNum, table));

			Select vendorClass = new Select (CreateVendor.vendorClass(Login.driver));

			vendorClass.selectByVisibleText(ReadTestData.readTestData(5, rowNum, table));

			Select vendorStatus = new Select (CreateVendor.vendorStatus(Login.driver));

			vendorStatus.selectByVisibleText(ReadTestData.readTestData(6, rowNum, table));

			CreateVendor.Address1(Login.driver).sendKeys(ReadTestData.readTestData(17, rowNum, table));

			CreateVendor.postalCode(Login.driver).sendKeys(ReadTestData.readTestData(19, rowNum, table));

			CreateVendor.workPhone(Login.driver).sendKeys(ReadTestData.readTestData(23, rowNum, table));

			CreateVendor.mobilePhone(Login.driver).sendKeys(ReadTestData.readTestData(24, rowNum, table));

			CreateVendor.email(Login.driver).sendKeys(ReadTestData.readTestData(27, rowNum, table));

			CreateVendor.dailyCapacity(Login.driver).sendKeys(ReadTestData.readTestData(31, rowNum, table));

			CreateVendor.totalCapacity(Login.driver).sendKeys(ReadTestData.readTestData(32, rowNum, table));

			if (ReadTestData.readTestData(38, rowNum, table).equals("Y"))
			{
				CreateVendor.AutoAssign(Login.driver).click();
			}
			if (ReadTestData.readTestData(39, rowNum, table).equals("Y"))
			{
				CreateVendor.AutoAccept(Login.driver).click();
			}

			Thread.sleep(5000);

			CreateVendor.saveVendor(Login.driver).click();

			Thread.sleep(10000);

			// saving vendor id into database

			String vendorID = CreateVendor.vendorID(Login.driver).getText();

			System.out.println(vendorID);

			String query = "UPDATE Vendors SET Auto_Genarated_Vendor_ID ="+vendorID+" where First_Name = "+"'"+expectedfirstName+"'";

			System.out.println(query);

			ReadTestData.insertTestData(query);

			Thread.sleep(8000);

			String expectedLastName = ReadTestData.readTestData(4, rowNum, table);

			// verifying vendor name on the dashboard

			WebElement VendorName_dash =CreateVendor.vendorName(Login.driver);

			String actualVendorName = VendorName_dash.getText();

			System.out.println(actualVendorName);

			String expectedVendorName = expectedfirstName+" "+expectedLastName;

			System.out.println(expectedVendorName);

			Assert.assertEquals(actualVendorName, expectedVendorName);

			Login.driver.quit();

		}catch (Exception ex){
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace(); 
			Login.driver.quit();
		}
	}

}
