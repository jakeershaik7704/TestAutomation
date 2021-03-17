package POM.ProductsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddMilestonesToProduct {

	public static WebElement addMilestones(WebDriver driver)
	{
		WebElement addMilestones = driver.findElement(By.xpath("//button[@onclick=\"$('#milestoneModal').data('bs.modal').show();\"]"));

		return addMilestones;
	}

	public static WebElement selectMilestones(WebDriver driver)
	{
		WebElement selectMilestones = driver.findElement(By.xpath("//select[@id='ProductMilestone_MilestoneID']"));

		return selectMilestones;
	}

	public static WebElement allotedHours(WebDriver driver)
	{
		WebElement allotedHours = driver.findElement(By.xpath("//input[@id='ProductMilestone_TimeInHours']"));

		return allotedHours;
	}

	public static WebElement save(WebDriver driver)
	{
		WebElement save = driver.findElement(By.xpath("//button[@onclick=\"$('#milestoneModal').data('bs.modal').save();\"]"));

		return save;
	}

}
