package Products;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Master.Login;
import Master.ReadTestData;
import POM.ClientPage.CreateClient;
import POM.ProductsPage.CreateProduct;
import POM.ProductsPage.FeeSchedule;

public class AddFeeSchedule {

	public static int rowNum = 183;

	public static String table ;

	@Test
	public static void addFeeScheduleConfig() throws Exception {

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

			WebElement feeSchedule = FeeSchedule.feeSchedule(Login.driver);

			actions.moveToElement(feeSchedule).click().build().perform();

			Thread.sleep(5000);

			FeeSchedule.standardFeeValuations(Login.driver).click();

			Thread.sleep(10000);

			FeeSchedule.addFeeButton1(Login.driver).click();

			String expectedProduct = ReadTestData.readTestData(3, rowNum, table);

			Select selectProduct = new Select (FeeSchedule.selectProduct(Login.driver));

			selectProduct.selectByVisibleText(expectedProduct);

			Thread.sleep(3000);

			String fee = ReadTestData.readTestData(81, rowNum, table);

			WebElement fees = FeeSchedule.Fee(Login.driver);

			fees.sendKeys(Keys.CONTROL + "a");

			fees.sendKeys(Keys.DELETE);

			Thread.sleep(2000);

			fees.sendKeys(fee);

			Thread.sleep(2000);

			FeeSchedule.saveButton1(Login.driver).click();

			Thread.sleep(10000);

			FeeSchedule.saveButton2(Login.driver).click();

			Thread.sleep(10000);

			Login.driver.quit();

		}catch (Exception ex){
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace(); 
			Login.driver.quit();
		}
	}

}
