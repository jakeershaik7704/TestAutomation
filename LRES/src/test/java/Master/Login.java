package Master;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import POM.ClientPage.CreateClient;
import POM.Login.LoginPage;

public class Login {

	public static WebDriver driver;

	public static Properties prop;

	public static WebDriverWait wait ;
	
	public static  String projectPath ;

	public static void  login() throws Exception {

		projectPath = System.getProperty("user.dir");   // return project folder path

		System.out.println(projectPath);

		String driverpath = projectPath + "\\drivers\\chromedriver.exe";   // return driver folder path 

		System.setProperty("webdriver.chrome.driver", driverpath );

		driver = new ChromeDriver();

		// open browser 

		driver.navigate().to("https://genesis.qa.lrescorp.com/");

		wait = new WebDriverWait(driver, 5);

		// to read url, user name and password

		prop = new Properties();

		prop.load(new FileInputStream("src/main/java/config/config.properties"));

		String URL = prop.getProperty("url");
		System.out.println(URL);
		String userName = prop.getProperty("userName");
		System.out.println(userName);
		String password = prop.getProperty("password");
		System.out.println(password);

		try {
			driver.navigate().to(URL);

			System.out.println("Browser opened..");

			Thread.sleep(3000);

			driver.manage().window().maximize();

			WebElement userNameElement =LoginPage.userName(driver);

			wait.until(ExpectedConditions.visibilityOf(userNameElement));

			LoginPage.userName(driver).sendKeys(userName);

			Thread.sleep(2000);

			LoginPage.password(driver).sendKeys(password);

			Thread.sleep(2000);

			LoginPage.loginButton(driver).click();

			WebElement clients =CreateClient.clients(driver);

			wait.until(ExpectedConditions.visibilityOf(clients));

			Assert.assertEquals(true, clients.isDisplayed());

		}catch (Exception ex){
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace(); 
			driver.quit();
		}
	}

}

