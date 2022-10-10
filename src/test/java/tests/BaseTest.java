package tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import io.appium.java_client.AppiumDriver;

public class BaseTest extends Tests {
	
	public BaseTest(AppiumDriver driver) {
		this.driver = driver;
		}

	public void MyElementIsVisible(String xpath) {
		driver.findElement(By.xpath(xpath)).isDisplayed();
	}
	
	public void TapMyElement(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void FillMyField(String xpath, String keys) {
		driver.findElement(By.xpath(xpath)).sendKeys(keys);
	}
	
	public void PressGoOnKeyboard(String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
	}
	
	public void WaitFor(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
}
