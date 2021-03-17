package POM.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public static WebElement userName(WebDriver driver)
	{
		WebElement userName = driver.findElement(By.xpath("//input[@id='UserName']"));
		
		return userName;
	}
	
	public static WebElement password(WebDriver driver)
	{
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		
		return password;
	}

	public static WebElement loginButton(WebDriver driver)
	{
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		return loginButton;
	}

}
