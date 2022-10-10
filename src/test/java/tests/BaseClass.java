package tests;
import java.net.URL;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
public class BaseClass {

	AppiumDriver driver;
	@BeforeTest
	public void setup() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
			caps.setCapability("useNewWDA", true);
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.5");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "appiumTest-AC982241-9D04-48ED-B233-5B21DA2BBAC2-iPhone X");
			caps.setCapability(MobileCapabilityType.UDID, "7A86085A-FB7C-4B6F-814E-F6248664897C");
			caps.setCapability("browserName", "Safari");
			MutableCapabilities sauceOptions = new MutableCapabilities();
			sauceOptions.setCapability("appiumVersion", "1.22.3");
			caps.setCapability("sauce:options", sauceOptions);
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new IOSDriver(url, caps);
		}catch(Exception exp) {
			System.out.println("Problem is: "+exp.getCause());
			System.out.println("Message: "+exp.getMessage());
			exp.printStackTrace();

		}
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
