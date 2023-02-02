package HomePageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtitlity.BaseClass;
import pOMRepo.HomePage;

public class ToVerifyHomePageTitle extends BaseClass {
	
	@Test
	public void toVerifyPageTitleTest() {
		
		String expectedTitle = "actiTIME - Enter Time-Track";
		
		wUtils.waitForTheTitle(driver, 20, expectedTitle);
		
		HomePage home = new HomePage(driver);
		String actualTitle = home.verifyHomePageTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass");
		
		
	}

}
