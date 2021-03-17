package Vendors;

import java.util.List;

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
import POM.Vendors.VendorSearchPage;
import POM.Vendors.VendorServiceArea;
import POM.Vendors.VendorTabs;

public class AddServiceArea {

	public static int rowNum = 183;
	public static int vendorRowNum = 183;
	public static int productRowNum = 183;

	public static String table ;
	public static String vendorTable ;
	public static String productTable ;

	@Test
	public static void addServiceAreaConfig() throws Exception {

		try {
			Login.login();

			vendorTable = Login.prop.getProperty("VendorsTable");
			table = Login.prop.getProperty("ServiceAreaTable");
			productTable=  Login.prop.getProperty("productTable");

			WebElement vendors =CreateFirm.vendorsMenu(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(vendors));

			Actions actions = new Actions(Login.driver);

			actions.moveToElement(vendors).perform();

			Thread.sleep(3000);

			WebElement individualVendors = VendorSearchPage.individualAgents(Login.driver);

			actions.moveToElement(individualVendors).click().build().perform();

			Thread.sleep(5000);

			String VendorID = ReadTestData.readTestData(2, vendorRowNum, vendorTable);

			System.out.println(VendorID);

			WebElement searchWithID =VendorSearchPage.quickSearch(Login.driver);

			searchWithID.sendKeys(VendorID);

			Thread.sleep(2000);

			WebElement searchVendor =VendorSearchPage.SearchVendor(Login.driver);

			searchVendor.click();

			Thread.sleep(3000);

			WebElement vendor  =Login.driver.findElement(By.xpath("//*[@id="+VendorID+"]/td[1]/a"));

			vendor.click();

			Thread.sleep(5000);

			VendorTabs.ServiceArea(Login.driver).click();

			Thread.sleep(3000);

			VendorServiceArea.addServiceArea(Login.driver).click();

			String serviceAreaName = ReadTestData.readTestData(2, rowNum, table);

			VendorServiceArea.serviceAreaName(Login.driver).sendKeys(serviceAreaName);;

			Thread.sleep(3000);

			VendorServiceArea.saveServiceAreaButton1(Login.driver).click();

			Thread.sleep(5000);

			WebElement ServiceArea =VendorTabs.ServiceArea(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(ServiceArea));

			ServiceArea.click();

			Thread.sleep(8000);

			VendorServiceArea.editProductFees(Login.driver).click();

			Thread.sleep(5000);

			String ProductType = ReadTestData.readTestData(7, productRowNum, productTable);

			String ProductName = ReadTestData.readTestData(3, productRowNum, productTable);

			List<WebElement> prodType = Login.driver.findElements(By.xpath("//*[@id=\"accordion\"]/ul/li/span/label"));

			for(WebElement we : prodType)
			{
				if(we.getText().equals(ProductType))
				{
					System.out.println(we.getText());

					we.click();
					break;
				}
			}

			Thread.sleep(3000);

			WebElement product = Login.driver.findElement(By.xpath("//label[@title='"+ProductName+"']"));

			product.click();

			Thread.sleep(3000);

			String actualProduct = VendorServiceArea.productNameLabel(Login.driver).getText();

			System.out.println(actualProduct);

			Assert.assertEquals(actualProduct, ProductName);

			VendorServiceArea.NewFee(Login.driver).sendKeys(ReadTestData.readTestData(6, rowNum, table));

			if (ReadTestData.readTestData(7, rowNum, table).equals("Y"))
			{
				VendorServiceArea.AssignApproved(Login.driver).click();
			}
			Thread.sleep(3000);

			VendorServiceArea.saveFeeButton1(Login.driver).click();

			Thread.sleep(3000);

			VendorServiceArea.saveFeeButton2(Login.driver).click();

			Thread.sleep(10000);

			WebElement ServiceAreaTab =VendorTabs.ServiceArea(Login.driver);

			ServiceAreaTab.click();

			Thread.sleep(3000);

			VendorServiceArea.geographicRegion(Login.driver).click();

			Thread.sleep(5000);

			String actualState = ReadTestData.readTestData(8, rowNum, table);

			System.out.println(actualState);

			WebElement state = Login.driver.findElement(By.xpath("//*[@id=\"stateList\"]/li/span[1]/label"));

			System.out.println(state.getText());

			if(state.getText().contains(actualState))
			{
				WebElement stateAll = Login.driver.findElement(By.xpath("//*[@id=\"stateList\"]/li/span[2]/input[1]"));

				stateAll.click();

				Thread.sleep(5000);

			}else
			{
				VendorServiceArea.addStateButton(Login.driver).click();

				Thread.sleep(3000);

				Select selectState = new Select (VendorServiceArea.selectState(Login.driver));

				selectState.selectByVisibleText(ReadTestData.readTestData(8, rowNum, table));

				VendorServiceArea.saveState(Login.driver).click();

				Thread.sleep(8000);

				List<WebElement> states = Login.driver.findElements(By.xpath("//*[@id=\"stateList\"]/li/span[1]/label"));

				System.out.println(states.size());

				String stateCode ="";

				for(WebElement we1 : states)
				{
					System.out.println(we1.getText());

					if(we1.getText().contains(actualState))
					{
						stateCode = we1.getText();

						List<WebElement> stateAll = Login.driver.findElements(By.xpath("//*[@id=\"stateList\"]/li/span[2]/input[1]"));

						System.out.println(stateAll.size());

						for(WebElement we2 : stateAll)
						{
							if(stateCode.contains(we2.getAttribute("data-stateid")))
							{
								we2.click();

								Thread.sleep(5000);

								break;
							}
						}
						Thread.sleep(5000);
						break;
					}
				}
			}
			VendorServiceArea.saveGeographicRegion(Login.driver).click();

			Thread.sleep(10000);

			WebElement ServiceAreaTab1 =VendorTabs.ServiceArea(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(ServiceAreaTab1));

			Login.driver.quit();

		}catch (Exception ex){
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace(); 
			Login.driver.quit();
		}
	}

}
