package Products;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import Master.Login;
import Master.ReadTestData;
import POM.ClientPage.CreateClient;
import POM.ProductsPage.AddMilestonesToProduct;
import POM.ProductsPage.CreateProduct;
import POM.ProductsPage.ProductTabs;

public class AddMilestones {

	public static int rowNum = 183;

	public static String table ;

	public static int mileStonesCount= 8;

	@Test
	public static void addMilestonesConfig() throws Exception {

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

			Thread.sleep(3000);

			String expectedProductID = ReadTestData.readTestData(2, rowNum, table);
			
			WebElement productsName = Login.driver.findElement(By.xpath("//*[@id="+expectedProductID+"]/td[2]/a"));

			productsName.click();

			Thread.sleep(5000);

			ProductTabs.milestones(Login.driver).click();

			Thread.sleep(5000);

			for (int i = 0; i < mileStonesCount; i++) {
				addMileStone(i);
			}

			Login.driver.quit();

		}catch (Exception ex){
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace(); 
			Login.driver.quit();
		}
	}

	public static void addMileStone(int i) throws Exception
	{
		int column = 51 + i;

		AddMilestonesToProduct.addMilestones(Login.driver).click();

		Thread.sleep(3000);

		String expectedMilestone = ReadTestData.readTestData(column, rowNum, table);

		Select selectMilestone = new Select (AddMilestonesToProduct.selectMilestones(Login.driver));

		selectMilestone.selectByVisibleText(expectedMilestone);

		String allotedHours = ReadTestData.readTestData(66, rowNum, table);

		JavascriptExecutor js = (JavascriptExecutor) Login.driver;
		
		js.executeScript(("arguments[0].value=" + allotedHours) + ';', Arrays.asList(AddMilestonesToProduct.allotedHours(Login.driver)));
		
		AddMilestonesToProduct.save(Login.driver).click();

		Thread.sleep(8000);
		
		WebElement Table = Login.driver.findElement(By.xpath("//table[@id=\'expectedMilestones\']"));

		List<WebElement> rows = Table.findElements(By.tagName("tr"));

		List<WebElement> Columns_row = rows.get(rows.size()-1).findElements(By.tagName("td"));

		String actualMilestone = Columns_row.get(1).getText();

		Assert.assertEquals(actualMilestone, expectedMilestone);
	}

}
