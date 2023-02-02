package genericUtitlity;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void  waitForTheTitle(WebDriver driver, Duration duration, String title) {
		
		WebDriverWait wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.titleContains(title));
	}
	
}
