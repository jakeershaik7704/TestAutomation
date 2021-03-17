package POM.ProductsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomatedAssignments {

	public static WebElement addAssignments(WebDriver driver)
	{
		WebElement addAssignments = driver.findElement(By.xpath("//button[@onclick=\"$('#assignmentOptionModal').data('bs.modal').show(null, getMaximumPassNumber());\"]"));

		return addAssignments;
	}

	public static WebElement Attempt(WebDriver driver)
	{
		WebElement Attempt = driver.findElement(By.xpath("//input[@id='AssignmentOption_PassNumber']"));

		return Attempt;
	}

	public static WebElement assignmentType(WebDriver driver)
	{
		WebElement assignmentType = driver.findElement(By.xpath("//select[@id='AssignmentOption_OptionID']"));

		return assignmentType;
	}

	public static WebElement howManyVendors(WebDriver driver)
	{
		WebElement howManyVendors = driver.findElement(By.xpath("//input[@id='AssignmentOption_OptionCount']"));

		return howManyVendors;
	}

	public static WebElement offerExpires(WebDriver driver)
	{
		WebElement offerExpires = driver.findElement(By.xpath("//select[@id='AssignmentOption_ExpirationHours']"));

		return offerExpires;
	}

	public static WebElement saveAssignment(WebDriver driver)
	{
		WebElement saveAssignment = driver.findElement(By.xpath("//button[@id='btnAddAssignmentOption']"));

		return saveAssignment;
	}

}
