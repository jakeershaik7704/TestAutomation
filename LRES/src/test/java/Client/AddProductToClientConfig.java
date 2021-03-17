package Client;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import Master.Login;
import Master.ReadTestData;
import POM.ClientPage.AddProductToClient;
import POM.ClientPage.ClientSearchPage;
import POM.ClientPage.ClientTabs;
import POM.ClientPage.CreateClient;

public class AddProductToClientConfig {

	public static int rowNum = 181;

	public static String table ;

	public static String clientTable ;

	public static int clientRowNum = 183;
			
	public static String productTable ;

	public static int productRowNum = 183;
	
	@Test
	
	public static void addProductToClientConfig() throws Exception {

		try {
			// login to application

			Login.login();

			// adding product to client

			table = Login.prop.getProperty("clientProductTable");

			clientTable= Login.prop.getProperty("clientTable");

			productTable= Login.prop.getProperty("productTable");

			WebElement clients =CreateClient.clients(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(clients));

			clients.click();

			Thread.sleep(3000);

			String clientID = ReadTestData.readTestData(3, clientRowNum, clientTable);
			System.out.println(clientID);

			WebElement searchWithID =ClientSearchPage.clientOrBranchID(Login.driver);

			searchWithID.sendKeys(clientID);

			WebElement searchClient =ClientSearchPage.search(Login.driver);

			searchClient.click();

			Thread.sleep(3000);

			WebElement client  =Login.driver.findElement(By.xpath("//*[@id="+clientID+"]/td[3]/a"));

			client.click();

			Thread.sleep(5000);

			ClientTabs.Products(Login.driver).click();

			Thread.sleep(3000);

			AddProductToClient.addProduct(Login.driver).click();

			Thread.sleep(8000);

			String expectedProductName = ReadTestData.readTestData(4, productRowNum, productTable);
			
			Select whatProductBeingConfigured = new Select (AddProductToClient.whatProductBeingConfigured(Login.driver));

			whatProductBeingConfigured.selectByVisibleText(expectedProductName);

			Select howDueDatesBeDetermined = new Select (AddProductToClient.howDueDatesBeDetermined(Login.driver));

			howDueDatesBeDetermined.selectByVisibleText(ReadTestData.readTestData(4, rowNum, table));

			AddProductToClient.clientSLA(Login.driver).sendKeys(ReadTestData.readTestData(5, rowNum, table));

			if (ReadTestData.readTestData(11, rowNum, table).equals("N"))
			{
				AddProductToClient.CollectValuation(Login.driver).click();
			}

			AddProductToClient.saveProduct(Login.driver).click();

			Thread.sleep(10000);

			WebElement Table = Login.driver.findElement(By.xpath("//table[@id= \'products\']"));

			List<WebElement> rows = Table.findElements(By.tagName("tr"));

			List<WebElement> Columns_row = rows.get(rows.size() - 1).findElements(By.tagName("td"));

			String actualProductName = Columns_row.get(2).getText();
			
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
