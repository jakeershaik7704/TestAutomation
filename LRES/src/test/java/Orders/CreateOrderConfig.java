package Orders;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Master.Login;
import Master.ReadTestData;
import POM.Orders.CrateOrderPage;
import POM.Orders.OrderDashboardElements;
import POM.Orders.OrderTabs;

public class CreateOrderConfig {

	public static int rowNum = 183;
	public static int productRowNum = 183;
	public static int clientRowNum = 183;
	public static int branchRowNum = 183;

	public static String table ;
	public static String productTable ;
	public static String clientTable ;
	public static String branchTable ;

	@Test
	public static void createOrder() throws Exception {

		try {
			Login.login();

			table = Login.prop.getProperty("OrdersTable");
			clientTable = Login.prop.getProperty("clientTable");
			productTable=  Login.prop.getProperty("productTable");
			branchTable=  Login.prop.getProperty("branchTable");

			String clientID =  ReadTestData.readTestData(3, clientRowNum, clientTable);

			String clientName =  ReadTestData.readTestData(4, clientRowNum, clientTable);

			String clientOrder = clientName+" (ID #"+clientID+")";

			System.out.println(clientOrder);

			String branchID = ReadTestData.readTestData(2, branchRowNum, branchTable);

			String product = ReadTestData.readTestData(4, productRowNum, productTable);

			WebElement Orders =CrateOrderPage.OrderMenu(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(Orders));

			Actions actions = new Actions(Login.driver);

			actions.moveToElement(Orders).perform();

			Thread.sleep(3000);

			WebElement createNewOrder = CrateOrderPage.createNewOrder(Login.driver);

			actions.moveToElement(createNewOrder).click().build().perform();

			Thread.sleep(5000);

			Select selectClient = new Select (CrateOrderPage.selectClient(Login.driver));

			selectClient.selectByVisibleText(clientOrder);

			Thread.sleep(5000);
			
			Select selectBranch = new Select (CrateOrderPage.selectBranch(Login.driver));

			selectBranch.selectByValue(branchID);

			Thread.sleep(3000);
			
			Select selectProduct = new Select (CrateOrderPage.selectProduct(Login.driver));

			selectProduct.selectByVisibleText(product);

			Select selectProperty = new Select (CrateOrderPage.selectPropertyType(Login.driver));

			selectProperty.selectByVisibleText(ReadTestData.readTestData(15, rowNum, table));

			CrateOrderPage.address1(Login.driver).sendKeys(ReadTestData.readTestData(17, rowNum, table));

			CrateOrderPage.postalCode(Login.driver).sendKeys(ReadTestData.readTestData(19, rowNum, table));

			if (ReadTestData.readTestData(24, productRowNum, productTable).equals("Y")
					|| ReadTestData.readTestData(25, productRowNum, productTable).equals("Y"))
			{
				CrateOrderPage.contacts(Login.driver).click();

				Thread.sleep(10000);

				Select selectContactType = new Select (CrateOrderPage.contactType(Login.driver));

				selectContactType.selectByVisibleText(ReadTestData.readTestData(28, rowNum, table));

				CrateOrderPage.Contact_FirstName(Login.driver).sendKeys(ReadTestData.readTestData(29, rowNum, table));

				CrateOrderPage.Contact_LastName(Login.driver).sendKeys(ReadTestData.readTestData(30, rowNum, table));

				CrateOrderPage.workPhone(Login.driver).sendKeys(ReadTestData.readTestData(31, rowNum, table));

				CrateOrderPage.HomePhone(Login.driver).sendKeys(ReadTestData.readTestData(32, rowNum, table));

				CrateOrderPage.Fax(Login.driver).sendKeys(ReadTestData.readTestData(33, rowNum, table));

				CrateOrderPage.MobilePhone(Login.driver).sendKeys(ReadTestData.readTestData(34, rowNum, table));

				CrateOrderPage.Email(Login.driver).sendKeys(ReadTestData.readTestData(35, rowNum, table));
				
				CrateOrderPage.saveContact(Login.driver).click();
				
				Thread.sleep(10000);
			}

			Select selectLoanPurpose = new Select (CrateOrderPage.selectLoanPurpose(Login.driver));

			selectLoanPurpose.selectByVisibleText(ReadTestData.readTestData(38, rowNum, table));

			CrateOrderPage.LoanNumber(Login.driver).sendKeys(ReadTestData.readTestData(40, rowNum, table));

			WebElement amount = CrateOrderPage.LoanAmount(Login.driver);

			amount.sendKeys(Keys.CONTROL + "a");

			amount.sendKeys(Keys.DELETE);

			Thread.sleep(2000);

			amount.sendKeys(ReadTestData.readTestData(41, rowNum, table));

			Thread.sleep(2000);

			if (ReadTestData.readTestData(22, productRowNum, productTable).equals("Y"))
			{
				CrateOrderPage.FHACaseNumber(Login.driver).sendKeys(ReadTestData.readTestData(44, rowNum, table));	
			}
			
			CrateOrderPage.PropertyAccessInstructions(Login.driver).sendKeys(ReadTestData.readTestData(53, rowNum, table));	
			
			CrateOrderPage.LockboxCode(Login.driver).sendKeys(ReadTestData.readTestData(54, rowNum, table));	

			Thread.sleep(5000);

			CrateOrderPage.OK(Login.driver).click();

			Thread.sleep(10000);

			WebElement confirm =OrderTabs.Confirm(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(confirm));

			// saving Order ID into database
			
			String TestDescription =ReadTestData.readTestData(1, rowNum, table);
					
			String OrderID = OrderDashboardElements.OrderID(Login.driver).getText(); 

			System.out.println("saving "+OrderID+" into data base...");

			String query = "UPDATE Orders SET Auto_generated_Order_ID ="+OrderID+" where Create_Order = "+"'"+TestDescription+"'";

			ReadTestData.insertTestData(query);

			Thread.sleep(6000);

			// verifying Product on Order dashboard
			
			WebElement productName_dash =OrderDashboardElements.Product_dashboard(Login.driver);

			String actualProductName = productName_dash.getText();

			Assert.assertEquals(actualProductName, product);
			
			Thread.sleep(3000);
			
			System.out.println(("Order " + (rowNum)) + " is successfully created");
			
			// completing order
			
			CreateOrderWithCompleteStatus.createOrderWithStatus(rowNum, table);
			
		}catch (Exception ex){
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace(); 
			Login.driver.quit();
		}
	}

}
