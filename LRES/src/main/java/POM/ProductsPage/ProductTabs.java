package POM.ProductsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductTabs {

	public static WebElement milestones(WebDriver driver)
	{
		WebElement milestones = driver.findElement(By.xpath("//*[@id=\"expectedMilestonesTab\"]/a"));

		return milestones;
	}

	public static WebElement automatedAssignment(WebDriver driver)
	{
		WebElement automatedAssignment = driver.findElement(By.xpath("//li[@id='automatedAssignmentTab']/a"));

		return automatedAssignment;
	}

}
