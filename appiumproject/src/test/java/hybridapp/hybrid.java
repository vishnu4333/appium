package hybridapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class hybrid {
	
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
	
	@Test(enabled=false)
	public void negtestcase() throws InterruptedException
	{
		driver.findElement(MobileBy.id("android:id/text1")).click();
	   	 Thread.sleep(3000);
	  //scroll
	   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))").click();
	   	 Thread.sleep(2000);
	 	//driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("vishnu");
	   	Thread.sleep(2000);
	   	
	   	driver.findElement(MobileBy.className("android.widget.RadioButton")).click();	
	   	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	   
	   	String Toast =driver.findElement(MobileBy.xpath("//android.widget.Toast[1]")).getText();
	   	System.out.println(Toast);
	   	
	   	}
	@Test(enabled=true)
	public void postestcase() throws InterruptedException
	{
		 driver.findElement(MobileBy.id("android:id/text1")).click();
	   	 Thread.sleep(3000);
	  //scroll
	   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))").click();
	   	 Thread.sleep(2000);
	 	 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("vishnu");
	   	Thread.sleep(2000);
	   	
	   	driver.findElement(MobileBy.className("android.widget.RadioButton")).click();	
	   	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(3000);
		 Thread.sleep(3000);
		 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 Thread.sleep(3000);
		//1st product price
		 String price1 = driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		 price1 = price1.substring(1);
		
		 Double product1 = Double.parseDouble(price1);
		 System.out.println("product1 price = " + product1);
		//2nd product price
		 String price2 = driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		 price2 = price2.substring(1);
		
		 Double product2 = Double.parseDouble(price2);
		 System.out.println("product2 price = " + product2);
		
		 Double Totalprice = product1 + product2;
		 System.out.println("total price = " + Totalprice);
		 Thread.sleep(2000);
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Send me e-mails on discounts related to selected products in future\")")).click();
		
		 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnProceed")).click();
   	}
	@Test(enabled=true)
	public void testcase() throws InterruptedException
	{
		 driver.findElement(MobileBy.id("android:id/text1")).click();
	   	 Thread.sleep(3000);
	  //scroll
	   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))").click();
	   	 Thread.sleep(2000);
	 	 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("vishnu");
	   	Thread.sleep(2000);
	   	
	   	driver.findElement(MobileBy.className("android.widget.RadioButton")).click();	
	   	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(3000);
		 Thread.sleep(3000);
		 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 Thread.sleep(3000);

			String price1 = driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
			price1 = price1.substring(1);
			
			Double firstproduct = Double.parseDouble(price1);
			System.out.println(firstproduct);
			
			String price2 = driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
			price2 = price2.substring(1);
			
			Double secondproduct = Double.parseDouble(price2);
			System.out.println(secondproduct);
			
			Double totalprice = firstproduct + secondproduct;
			System.out.println(totalprice);
			
	        String actualprice=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
			
			actualprice=actualprice.substring(1);
			
			double actualprice1=Double.parseDouble(actualprice);
			
			System.out.println(actualprice1);
			
			if(totalprice.equals(actualprice1))
			{
				
				System.out.println("expected price is equal to actual price");
			}
			else
			{
				
				System.out.print("expected price is not equal to actual price");
			}
			Thread.sleep(6000);
			
			driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
			driver.findElement(MobileBy.className("android.widget.Button")).click();
			
	}
}


