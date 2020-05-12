package saurabh.CashifyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginPage extends DeviceSetup {
	
	@FindBy(id = "collegues.Demo.com.Login:id/et_user_name")
	private WebElement loginPageUserName;

	@FindBy(id = "collegues.Demo.com.Login:id/et_password")
	private WebElement loginPagePassword;
	@FindBy(id = "collegues.Demo.com.Login:id/ch_rememberMe")
	private WebElement LoginPageRememberMeCheckBox;
	@FindBy(id = "collegues.Demo.com.Login:id/btn_sign_in")
	private WebElement signinButton;

	@FindBy(id = "collegues.Demo.com.Login:id/btn_facebook")
	private WebElement facebookButton;
	@FindBy(id = "collegues.Demo.com.Login:id/btn_google")
	private WebElement GoogleButton;
	@FindBy(id = "collegues.Demo.com.Login:id/tv_sign_up")
	private WebElement signUp;

	@FindBy(id = "user-email-address")
	private WebElement loginss;
	@FindBy(id = "user-password")
	private WebElement pass;

//loading values at time of object creation	
	public LoginPage() {
		//DeviceSetup.WebAppSetup();
		PageFactory.initElements(webDriver, this);
			}
	
	public void Login(String username, String Password) {
		SoftAssert softAssert = new SoftAssert();

		webDriver.navigate().to("http://acpt-backlog-webapp.agilecockpit.com/");
		//softAssert.assertNull(username);
		//Assert.assertNotNull(Password);
		//Assert.assertEquals("testUserABMAdmin123@getnada.com", username);
		// driver.findElement(By.id("user-email-address")).sendKeys(username);
		// driver.findElement(By.id("user-password")).sendKeys(Password);
		loginss.sendKeys(username);
		pass.sendKeys(Password);
		webDriver.findElement(By.id("login-button")).click();

	}

}
