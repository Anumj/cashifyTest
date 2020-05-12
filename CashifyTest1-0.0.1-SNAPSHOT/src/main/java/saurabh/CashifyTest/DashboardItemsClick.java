package saurabh.CashifyTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardItemsClick extends DeviceSetup {
	
	@FindBy(xpath = "//a[@title='Accelerator']")
	private WebElement dashboardAccelerator;

	{
		PageFactory.initElements(webDriver, this);
	}

	public void dashboardItemClickAcceleratorApp() {
		webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		dashboardAccelerator.click();
	}
	public void dashboardItemClickBacklogVersion1App() {
		webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
	}
	public void dashboardItemClickBacklogVersion2App() {
		webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
	}
}
