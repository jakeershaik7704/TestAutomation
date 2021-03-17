package Orders;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import Master.Login;
import Master.ReadTestData;
import POM.Orders.OrderDashboardElements;
import POM.Orders.OrderTabs;

public class CreateOrderWithCompleteStatus {

	public static void createOrderWithStatus(int rowNum, String table) throws Exception {

		try {
			WebElement confirm = OrderTabs.Confirm(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(confirm));

			confirm.click();

			Thread.sleep(8000);

			Login.driver.navigate().refresh();

			Thread.sleep(8000);

			WebElement currentQueue = OrderDashboardElements.CurrentQueue(Login.driver);

			String actualCurrentQueue = currentQueue.getText();

			if(actualCurrentQueue == "Awaiting Managerial Assistance (Item is a Potential Duplicate)" 
					|| actualCurrentQueue ==  "Research Queue (Item is a Potential Duplicate)" 
					|| actualCurrentQueue == "Awaiting Managerial Assistance (Order has Special Instructions)"){

				WebElement resolveEscaltion = OrderTabs.ResolveEscaltion_1(Login.driver);

				Login.wait.until(ExpectedConditions.visibilityOf(resolveEscaltion));

				resolveEscaltion.click();

				Thread.sleep(5000);

				WebElement resolveEscaltion2 = OrderTabs.ResolveEscaltion_2(Login.driver);

				Login.wait.until(ExpectedConditions.visibilityOf(resolveEscaltion2));

				resolveEscaltion2.click();

				Thread.sleep(5000);
			}
			for(int i=0; i<=3; i++)
			{
				Login.driver.navigate().refresh();
				Thread.sleep(5000);
			}
			WebElement LastStatus = OrderDashboardElements.LastStatus(Login.driver);

			Login.wait.until(ExpectedConditions.visibilityOf(LastStatus));

			String actualStatus = LastStatus.getText();

			System.out.println(actualStatus);

			String expectedStatus = ReadTestData.readTestData(85, rowNum, table);

			System.out.println(expectedStatus);

			if (actualStatus == expectedStatus) {
				System.out.println(("Status is " + actualStatus) + " order needs to be reviewed");
			} else {

				WebElement Assign = OrderTabs.Assign(Login.driver);

				Login.wait.until(ExpectedConditions.visibilityOf(Assign));

				Assign.click();

				Thread.sleep(8000);

				OrderTabs.a_Assign(Login.driver).click();

				Thread.sleep(8000);

				WebElement vendorDivInfo = OrderTabs.vendor_divInformation(Login.driver);

				Login.wait.until(ExpectedConditions.visibilityOf(vendorDivInfo));

				vendorDivInfo.click();

				Thread.sleep(3000);

				OrderTabs.first_Assign(Login.driver).click();

				Thread.sleep(5000);

				WebElement Notification1 = OrderTabs.Notification1(Login.driver);

				Login.wait.until(ExpectedConditions.visibilityOf(Notification1));

				Notification1.click();

				OrderTabs.Notification2(Login.driver).click();

				OrderTabs.Notification3(Login.driver).click();

				Thread.sleep(5000);
				
				JavascriptExecutor js = (JavascriptExecutor) Login.driver;

				WebElement confirm_Assign = OrderTabs.confirm_Assign(Login.driver);

				js.executeScript("arguments[0].scrollIntoView();", confirm_Assign);
				
				Thread.sleep(3000);
				
				Login.wait.until(ExpectedConditions.visibilityOf(confirm_Assign));

				confirm_Assign.click();

				Thread.sleep(15000);

				WebElement Assign_1 = OrderTabs.Assign(Login.driver);

				Login.wait.until(ExpectedConditions.visibilityOf(Assign_1));

				Assign_1.click();

				Thread.sleep(5000);

				OrderTabs.vendorAccept(Login.driver).click();

				Thread.sleep(5000);

				WebElement confirmVendor = OrderTabs.confirmVendorAccept(Login.driver);

				Login.wait.until(ExpectedConditions.visibilityOf(confirmVendor));

				confirmVendor.click();

				Thread.sleep(10000);

				OrderTabs.recentOrderAlert(Login.driver).click();

				Thread.sleep(5000);

				WebElement Documents = OrderTabs.Documents(Login.driver);

				Login.wait.until(ExpectedConditions.visibilityOf(Documents));

				Documents.click();

				Thread.sleep(5000);

				OrderTabs.Add_Documents(Login.driver).click();

				Thread.sleep(5000);

				Select selectDocType = new Select (OrderTabs.selectDocumentType(Login.driver));

				selectDocType.selectByValue("ITEM-PRODUCT");

				OrderTabs.selectDocumentType(Login.driver).click();

				Thread.sleep(2000);

				String filePath = Login.projectPath+"/src/main/java/TestData/Insurance.pdf";
						
				System.out.println(filePath);
				
				OrderTabs.uploadFile(Login.driver).sendKeys(filePath);

				Thread.sleep(5000);

				OrderTabs.uploadDocumentBtn(Login.driver).click();

				Thread.sleep(10000);

				Login.driver.navigate().refresh();

				Thread.sleep(10000);

				WebElement qualityControl = OrderTabs.QualityControl(Login.driver);

				Login.wait.until(ExpectedConditions.visibilityOf(qualityControl));

				qualityControl.click();

				Thread.sleep(5000);

				OrderTabs.ApproveBtn(Login.driver).click();

				Thread.sleep(10000);

				WebElement approveThisOrder = OrderTabs.ApproveThisOrderBtn(Login.driver);

				Login.wait.until(ExpectedConditions.visibilityOf(approveThisOrder));

				approveThisOrder.click();

				Thread.sleep(10000);

				expectedStatus = ReadTestData.readTestData(85, rowNum, table);

				for(int i=0; i<=5; i++)
				{
					Login.driver.navigate().refresh();

					Thread.sleep(8000);

					WebElement status = OrderDashboardElements.LastStatus(Login.driver);

					Login.wait.until(ExpectedConditions.visibilityOf(status));

					actualStatus = status.getText();
					
					System.out.println(actualStatus);
					
					if (actualStatus.equals(expectedStatus)) {
						break;
					}
				}
				
				Assert.assertEquals(actualStatus, expectedStatus);
				
				System.out.println("Order created with complete status..");
			}
			Login.driver.quit();

		}catch (Exception ex){
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace(); 
			Login.driver.quit();
		}
	}
}
