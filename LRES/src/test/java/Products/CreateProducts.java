package Products;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Master.Login;
import Master.ReadTestData;
import POM.ClientPage.CreateClient;
import POM.ProductsPage.CreateProduct;

public class CreateProducts {

	public static int rowNum = 183;

	public static String table ;

	@Test
	public static void CreateProductConfig() throws Exception {

		try {
			// login to application

			Login.login();

			// creating product

			table = Login.prop.getProperty("productTable");

			WebElement clients =CreateClient.clients(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(clients));

			Actions actions = new Actions(Login.driver);

			WebElement configurations = CreateProduct.configurations(Login.driver);

			actions.moveToElement(configurations).perform();

			Thread.sleep(3000);

			WebElement products = CreateProduct.Products(Login.driver);

			actions.moveToElement(products).click().build().perform();

			Thread.sleep(5000);

			CreateProduct.addProducts(Login.driver).click();

			Thread.sleep(5000);

			WebElement productName =CreateProduct.productName(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(productName));

			String expectedProductName = ReadTestData.readTestData(3, rowNum, table);

			productName.sendKeys(expectedProductName);

			CreateProduct.AbbreviationName(Login.driver).sendKeys(ReadTestData.readTestData(4, rowNum, table));

			CreateProduct.VendorProductName(Login.driver).sendKeys(ReadTestData.readTestData(5, rowNum, table));

			CreateProduct.FormCode(Login.driver).sendKeys(ReadTestData.readTestData(6, rowNum, table));

			Select productType = new Select (CreateProduct.produtType(Login.driver));

			productType.selectByVisibleText(ReadTestData.readTestData(7, rowNum, table));

			if (ReadTestData.readTestData(9, rowNum, table).equals("N"))
			{
				CreateProduct.clientWillBilled(Login.driver).click();
			}
			CreateProduct.acceptableMargin(Login.driver).sendKeys(ReadTestData.readTestData(10, rowNum, table));

			CreateProduct.Department(Login.driver).sendKeys(ReadTestData.readTestData(12, rowNum, table));

			CreateProduct.Category(Login.driver).sendKeys(ReadTestData.readTestData(13, rowNum, table));

			CreateProduct.Division(Login.driver).sendKeys(ReadTestData.readTestData(14, rowNum, table));

			CreateProduct.ServiceLine(Login.driver).sendKeys(ReadTestData.readTestData(15, rowNum, table));

			String defaulSLA = ReadTestData.readTestData(18, rowNum, table);

			WebElement clientSLA = CreateProduct.ClientSLA(Login.driver);

			clientSLA.sendKeys(Keys.CONTROL + "a");
			clientSLA.sendKeys(Keys.DELETE);
			Thread.sleep(2000);
			
			clientSLA.sendKeys(defaulSLA);

			Thread.sleep(2000);

			if (ReadTestData.readTestData(20, rowNum, table).equals("N"))
			{
				CreateProduct.canClientOrderThisProduct(Login.driver).click();
			}
			if (ReadTestData.readTestData(21, rowNum, table).equals("N"))
			{
				CreateProduct.deliverToClient(Login.driver).click();
			}
			if (ReadTestData.readTestData(22, rowNum, table).equals("Y"))
			{
				CreateProduct.FHACaseNumberNeeded(Login.driver).click();
			}
			if (ReadTestData.readTestData(23, rowNum, table).equals("Y"))
			{
				CreateProduct.LoanNumberNeeded(Login.driver).click();
			}
			if (ReadTestData.readTestData(24, rowNum, table).equals("Y"))
			{
				CreateProduct.BorrowerNameNeeded(Login.driver).click();
			}
			if (ReadTestData.readTestData(25, rowNum, table).equals("Y"))
			{
				CreateProduct.AccessContactNeeded(Login.driver).click();
			}
			if (ReadTestData.readTestData(26, rowNum, table).equals("Y"))
			{
				CreateProduct.BundleFinalReport(Login.driver).click();
			}
			if (ReadTestData.readTestData(29, rowNum, table).equals("N"))
			{
				CreateProduct.IsLicenseRequired(Login.driver).click();
			}

			if (ReadTestData.readTestData(30, rowNum, table).equals("Y"))
			{
				CreateProduct.FHAApprovalNeeded(Login.driver).click();
			}

			if (ReadTestData.readTestData(31, rowNum, table).equals("N"))
			{
				CreateProduct.canAssignAutomatically(Login.driver).click();
			}

			if (ReadTestData.readTestData(32, rowNum, table).equals("N"))
			{
				CreateProduct.assignmentNoticeSent(Login.driver).click();
			}

			if (ReadTestData.readTestData(33, rowNum, table).equals("Y"))
			{
				CreateProduct.conditionallyAccept(Login.driver).click();
			}

			if (ReadTestData.readTestData(34, rowNum, table).equals("Y"))
			{
				CreateProduct.reportSeenByOtherVendors(Login.driver).click();
			}

			CreateProduct.VendorSLA(Login.driver).sendKeys(ReadTestData.readTestData(35, rowNum, table));

			String weight = ReadTestData.readTestData(37, rowNum, table);

			WebElement capaityWeight = CreateProduct.capaityWeight(Login.driver);
			capaityWeight.sendKeys(Keys.CONTROL + "a");
			capaityWeight.sendKeys(Keys.DELETE);
			Thread.sleep(2000);
			
			capaityWeight.sendKeys(weight);

			Thread.sleep(2000);

			if (ReadTestData.readTestData(43, rowNum, table).equals("Y"))
			{
				CreateProduct.BypassDupeCheck(Login.driver).click();
			}
			if (ReadTestData.readTestData(44, rowNum, table).equals("Y"))
			{
				CreateProduct.QualityControllRequired(Login.driver).click();
			}
			if (ReadTestData.readTestData(45, rowNum, table).equals("N"))
			{
				CreateProduct.fullyAutomatedProduct(Login.driver).click();
			}
			if (ReadTestData.readTestData(46, rowNum, table).equals("Y"))
			{
				CreateProduct.IsProductAddendum(Login.driver).click();
			}
			if (ReadTestData.readTestData(48, rowNum, table).equals("Y"))
			{
				CreateProduct.HideOrderItem(Login.driver).click();
			}
			Thread.sleep(5000);

			CreateProduct.saveProduct(Login.driver).click();

			Thread.sleep(10000);

			// saving product id into database

			String productID = CreateProduct.productID(Login.driver).getText(); 

			System.out.println(productID);

			String query = "UPDATE Products SET Auto_Generated_Product_ID ="+productID+" where Product_Name = "+"'"+expectedProductName+"'";

			System.out.println(query);

			ReadTestData.insertTestData(query);

			Thread.sleep(8000);

			WebElement productName_dash =CreateProduct.productClientName(Login.driver);

			String actualProductName = productName_dash.getText();

			System.out.println(actualProductName);

			Assert.assertEquals(actualProductName, expectedProductName);

			Login.driver.quit();

		}catch (Exception ex){
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace(); 
			Login.driver.quit();
		}
	}
}
