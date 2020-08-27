package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static AppiumDriver<MobileElement> driver;

	@BeforeTest
	public static void setup() throws MalformedURLException {
		
		try {
		
		DesiredCapabilities capa = new DesiredCapabilities();	
		
		capa.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		capa.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		capa.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S9+");
		capa.setCapability(MobileCapabilityType.UDID, "45464131554f309");
		capa.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		capa.setCapability("appPackage", "io.flutter.demo.gallery");
		capa.setCapability("appActivity", "io.flutter.demo.gallery.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, capa);
		}catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}
		
	@AfterTest
	public void teardown() {
		
	}
}
