package saurabh.CashifyTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DeviceSetup {
	public static WebDriver webDriver;
	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities capabilities;

	public static void androidLaunchApp() throws MalformedURLException {
		capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "5203b974ec56ft");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("app", "G:/DemoApp.apk");
		capabilities.setCapability("appPackage", "collegues.abc.com.xyz");
		capabilities.setCapability("appActivity", "com.abc.colleagues.splash.view.SplashScreenActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		Assert.assertNotNull(driver);
	
	}

	public static void WebAppSetup() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\selenium\\drivers\\chromedriver.exe");

		webDriver = new ChromeDriver();
		webDriver.manage().deleteAllCookies();

	}


	public void CloseApp() {
		webDriver.quit();
	}

}
