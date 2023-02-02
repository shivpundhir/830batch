package genericUtitlity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pOMRepo.HomePage;
import pOMRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public WebDriverUtility wUtils = new WebDriverUtility();
	
	@BeforeSuite
	public void bsCounfig() {
		System.out.println("Connect to DB");
		
	}
	@BeforeClass
	public void bcCounfig() {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
	}
	@BeforeMethod
	public void bMCounfig() {
		LoginPage login = new LoginPage(driver);
		login.loginAction("admin", "manager");
		
	}
	@AfterMethod
	public void AmCounfig() {
		
		HomePage home = new HomePage(driver);
		home.logoutAction();
		
	}
	@AfterClass
	public void AcCounfig() {
		driver.quit();
		
	}
	@AfterSuite
	public void AsCounfig() {
		System.out.println("disConnect DB");
		
	}
	

}
