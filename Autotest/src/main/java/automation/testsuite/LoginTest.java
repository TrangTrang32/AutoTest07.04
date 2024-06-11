package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_Account;

public class LoginTest extends CommonBase{
	@BeforeMethod
	public void openPage() {
		driver = initChromeTest(CT_PageURL.URL_ALADA);
	}
	@Test
	public void LoginSuccessfully() {
		WebElement emailTxt = driver.findElement(CT_Account.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys(CT_Account.EMAIL);
		WebElement passwordTxt = driver.findElement(CT_Account.PASSWORD_ELEMENT);
		if(passwordTxt.isEnabled())
			passwordTxt.sendKeys(CT_Account.PASS);
		WebElement buttonLogin = driver.findElement(CT_Account.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();
		assertTrue(driver.findElement(CT_Account.TEXT_KHOAHOCCUATOI).isDisplayed());
	}
	@Test
	public void LoginFail_BlankEmail_Pass() {
		WebElement emailTxt = driver.findElement(CT_Account.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys("");
		WebElement passwordTxt = driver.findElement(CT_Account.PASSWORD_ELEMENT);
		if(passwordTxt.isEnabled())
			passwordTxt.sendKeys("");
		WebElement buttonLogin = driver.findElement(CT_Account.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();
		assertTrue(driver.findElement(CT_Account.LABEL_EMAIL_EMPTY).isDisplayed());
		assertTrue(driver.findElement(CT_Account.LABEL_PASS_EMPTY).isDisplayed());
	}
	@Test
	public void LoginFail_Unregistered() {
		WebElement emailTxt = driver.findElement(CT_Account.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys("trang123@gmail.com");
		WebElement passwordTxt = driver.findElement(CT_Account.PASSWORD_ELEMENT);
		if(passwordTxt.isEnabled())
			passwordTxt.sendKeys("123456");
		WebElement buttonLogin = driver.findElement(CT_Account.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();
		assertTrue(driver.findElement(CT_Account.LABEL_EMAIL_UNREGISTER).isDisplayed());
	}
	@Test
	public void LoginFail_FormatEmail() {
		WebElement emailTxt = driver.findElement(CT_Account.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys("trang123");
		WebElement buttonLogin = driver.findElement(CT_Account.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();
		assertTrue(driver.findElement(CT_Account.LABEL_EMAIL_UNFORMATED).isDisplayed());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Test
	public void LoginFail_IncorrectPass() {
		WebElement emailTxt = driver.findElement(CT_Account.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys(CT_Account.EMAIL);
		WebElement passwordTxt = driver.findElement(CT_Account.PASSWORD_ELEMENT);
		if(passwordTxt.isEnabled())
			passwordTxt.sendKeys("123456");
		WebElement buttonLogin = driver.findElement(CT_Account.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();
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
