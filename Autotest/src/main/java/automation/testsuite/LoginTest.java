package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_Account;
import automation.page.LoginPage;
import automation.page.LoginPageFactory;

public class LoginTest extends CommonBase{
	@BeforeMethod
	public void openPage() {
		driver = initChromeTest(CT_PageURL.URL_ALADA);
	}
	@Test
	public void LoginSuccessfully() {
		//POM với LoginPage findElement
		/*LoginPage login = new LoginPage(driver);
		login.LoginFunction(CT_Account.EMAIL, CT_Account.PASS);*/
		//POM với LoginPageFactory findBy
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction(CT_Account.EMAIL, CT_Account.PASS);
		assertTrue(driver.findElement(CT_Account.TEXT_KHOAHOCCUATOI).isDisplayed());
	}
	@Test
	public void LoginFail_BlankEmail_Pass() {
		//POM với LoginPage findElement
		/*LoginPage login = new LoginPage(driver);
		login.LoginFunction("", "");*/
		//POM với LoginPageFactory findBy
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction("", "");
		assertTrue(driver.findElement(CT_Account.LABEL_EMAIL_EMPTY).isDisplayed());
		assertTrue(driver.findElement(CT_Account.LABEL_PASS_EMPTY).isDisplayed());
	}
	@Test
	public void LoginFail_Unregistered() {
		//POM với LoginPage findElement
		/*LoginPage login = new LoginPage(driver);
		login.LoginFunction("trang123@gmail.com", "123456");*/
		//POM với LoginPageFactory findBy
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction("trang123@gmail.com", "123456");
		assertTrue(driver.findElement(CT_Account.LABEL_EMAIL_UNREGISTER).isDisplayed());
	}
	@Test
	public void LoginFail_FormatEmail() {
		/*WebElement emailTxt = driver.findElement(CT_Account.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys("trang123");
		WebElement buttonLogin = driver.findElement(CT_Account.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();*/
		//POM với LoginPage findElement
		/*LoginPage login = new LoginPage(driver);
		login.LoginFunction("trang123", "123456");*/
		//POM với LoginPageFactory findBy
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction("trang123", "123456");
		assertTrue(driver.findElement(CT_Account.LABEL_EMAIL_UNFORMATED).isDisplayed());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Test
	public void LoginFail_IncorrectPass() {
		/*WebElement emailTxt = driver.findElement(CT_Account.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys(CT_Account.EMAIL);
		WebElement passwordTxt = driver.findElement(CT_Account.PASSWORD_ELEMENT);
		if(passwordTxt.isEnabled())
			passwordTxt.sendKeys("123456");
		WebElement buttonLogin = driver.findElement(CT_Account.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();*/
		//POM với LoginPage findElement
		/*LoginPage login = new LoginPage(driver);
		login.LoginFunction(CT_Account.EMAIL, "123456");*/
		//POM với LoginPageFactory findBy
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction(CT_Account.EMAIL, "123456");
		assertTrue(driver.findElement(CT_Account.LABEL_PASS_FAIL).isDisplayed());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}	
	
	@Test
	public void placeholder_Email() {
		WebElement emailTxt = driver.findElement(CT_Account.EMAIL_ELEMENT);
		if(emailTxt.isDisplayed() && emailTxt == null)
			assertTrue(driver.findElement(CT_Account.PLACEHOLDER_EMAIL).isDisplayed());
	}
	@Test
	public void placeholder_Pass() {
		WebElement passwordTxt = driver.findElement(CT_Account.PASSWORD_ELEMENT);
		if(passwordTxt.isDisplayed() && passwordTxt == null)
			assertTrue(driver.findElement(CT_Account.PLACEHOLDER_PASS).isDisplayed());
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
