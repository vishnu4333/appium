package webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class capabilities {
	
	public static AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void BT() throws MalformedURLException
	{
    DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C://Users//hp//Downloads//chromedriver_win32 (1)//chromedriver.exe/");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/Wed/hub"),dc);
	
	}
	
	@Test
	public void test1() {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Moolyaed");
		Actions as=new Actions(driver);
		as.sendKeys(Keys.ENTER).build().perform();
		
		List<AndroidElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			System.out.println(list.get(i).getAttribute("href"));

		}
		WebElement we=driver.findElement(By.xpath("//div[contains(text(),'MoolyaEd | Linkedin')]"));
		JavascriptExecutor jy = (JavascriptExecutor)driver;
		jy.executeScript("arguments[0].scrollIntoView(true)",we);
		we.click();
		System.out.println(driver.getTitle());
	}
}
