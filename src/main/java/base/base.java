package base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException {
		
		File f = new File("resources");
		File fs = new File(f, "ApiDemos-debug (1).apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RahulEmulator5");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
//		Calculator:		
//		driver.findElement(By.xpath("//android.widget.Button[@text='2']")).click();
//		driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
//		driver.findElement(By.xpath("//android.widget.Button[@text='3']")).click();
//		driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
//		String total = driver.findElement(By.xpath("android.widget.TextView")).getText();
//		System.out.println(total);
		
//		apiDemos:
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("Rahul");
		WebElement pqr = (WebElement) driver.findElementsByClassName("android.widget.Button").get(1);
		pqr.click();
	}

}
