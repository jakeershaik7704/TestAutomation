package Vendors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Master.Login;
import Master.ReadTestData;
import POM.Vendors.CreateFirm;

public class CreateFirmConfig {

	public static int rowNum = 183;

	public static String table ;

	@Test
	
	public static void createFirmConfig() throws Exception {

		try {
			Login.login();

			table = Login.prop.getProperty("FirmsTable");

			WebElement vendors =CreateFirm.vendorsMenu(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(vendors));
			
			Actions actions = new Actions(Login.driver);

			actions.moveToElement(vendors).perform();

			Thread.sleep(3000);

			WebElement firms = CreateFirm.Firms(Login.driver);

			actions.moveToElement(firms).click().build().perform();

			Thread.sleep(5000);

			CreateFirm.CreateFirmButton(Login.driver).click();

			WebElement companyName =CreateFirm.companyName(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(companyName));

			String expectedFirmName = ReadTestData.readTestData(5, rowNum, table);

			companyName.sendKeys(expectedFirmName);

			CreateFirm.Address1(Login.driver).sendKeys(ReadTestData.readTestData(13, rowNum, table));
			
			CreateFirm.UnitSuite(Login.driver).sendKeys(ReadTestData.readTestData(14, rowNum, table));
			
			CreateFirm.postalCode(Login.driver).sendKeys(ReadTestData.readTestData(15, rowNum, table));
			
			CreateFirm.ContactFirstName(Login.driver).sendKeys(ReadTestData.readTestData(18, rowNum, table));
			
			CreateFirm.ContactLastName(Login.driver).sendKeys(ReadTestData.readTestData(19, rowNum, table));
			
			CreateFirm.primaryPhone(Login.driver).sendKeys(ReadTestData.readTestData(20, rowNum, table));

			Select businessType = new Select (CreateFirm.BusinessType(Login.driver));

			businessType.selectByVisibleText(ReadTestData.readTestData(29, rowNum, table));

			Thread.sleep(5000);

			CreateFirm.saveFirm(Login.driver).click();

			Thread.sleep(10000);

			// insert firm id into database

			String firmID = CreateFirm.firmID(Login.driver).getText(); 

			System.out.println(firmID);

			String query = "UPDATE Firms SET Auto_Generated_Firm_ID ="+firmID+" where Company_Name = "+"'"+expectedFirmName+"'";

			ReadTestData.insertTestData(query);

			Thread.sleep(8000);

			WebElement companyName_dash =CreateFirm.firmName(Login.driver);

			String actualFirmName = companyName_dash.getText();

			System.out.println(actualFirmName);

			Assert.assertEquals(actualFirmName, expectedFirmName);

			Login.driver.quit();

		}catch (Exception ex){
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace(); 
			Login.driver.quit();
		}
	}

}
