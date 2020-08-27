package tests;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;

public class ShrineGallery extends BaseClass{
	
	@Test
	public void test1() throws InterruptedException{
		System.out.println("I will start my execution now");
//		Thread.sleep(10000);	
		Actions action = new Actions(driver);
		driver.findElementByXPath("//*[@class='android.view.View'][3]").click();
		Thread.sleep(5000);	
		driver.findElementByXPath("//*[@class='android.widget.EditText'][1]").click();
		Thread.sleep(5000);	
		//driver.findElementByXPath("//*[@class='android.widget.EditText'][1]").sendKeys("abdgmail.com");
		action.sendKeys("abd@gmail.com").perform();
		Thread.sleep(5000);	
		driver.findElementByXPath("//*[@class='android.widget.EditText'][2]").click();
		Thread.sleep(3000);	
		action.sendKeys("absm").perform();
		Thread.sleep(3000);	
		driver.findElementByXPath("//*[@class='android.widget.Button'][2]").click();
		System.out.println("Login succussful. Now I am on home screen");
		
		Thread.sleep(7000);
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Open menu\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"CLOTHING\"]").click();
		Thread.sleep(7000);
		
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Open menu\"]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"ACCESSORIES\"]").click();
		Thread.sleep(7000);
		driver.findElementByXPath("//*[@contentDescription='Shopping basket, no items']/.").click();
	
	}
	
	
	
	
}
