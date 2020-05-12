package saurabh.CashifyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest extends DeviceSetup {

	// public static WebDriver webDriver;

		@BeforeSuite
	public void beforeSuite() throws Exception {
		// App Launch
		// DeviceSetup.androidLaunchApp();
		DeviceSetup.WebAppSetup();
	}

	@BeforeTest
	public void beforeTest() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@Test
	@Parameters({ "emailId", "password", "LoggedInSuccessfully" })
	public void logingIntoApp(String emailId, String password, String LoggedInSuccessfully) {
		LoginPage loginPage = new LoginPage();
		loginPage.Login(emailId, password);
		Assert.assertEquals(webDriver.findElement(By.xpath("//span[@class='js-astext']")).getText(), LoggedInSuccessfully);

		/*
		 * try{ Assert.assertEquals(
		 * webDriver.findElement(By.id("invalid-user-message")).getText(),errorMessage);
		 * }catch(AssertionError e){ Log error;
		 * 
		 * }
		 */
	}

	@Test(priority = 6, dependsOnMethods = { "logingIntoApp" })
	public void DashboardClickItems() {
		DashboardItemsClick dashboardItemsClick = new DashboardItemsClick();
		dashboardItemsClick.dashboardItemClickAcceleratorApp();
		
	}

	@Test(priority = 2, dependsOnMethods = { "DashboardClickItems", "logingIntoApp" })
	public static void CloseTheApp() {

	}

	@AfterMethod
	public void afterMethod() {
	}
	
@AfterClass
public void cleanUp() {
	
}
	@AfterTest
	public void afterTest() {
	}

	@AfterSuite
	public void afterSuite() {
		 DeviceSetup deviceSetup = new DeviceSetup();
		deviceSetup.CloseApp();
	}

}
