package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_Account_Homework_day13;

public class Login_HW13_Activeitzone extends CommonBase{
	@BeforeMethod
	public void openPage() {
		driver = initChromeTest(CT_PageURL.URL_ACTIVEZONE);
	}
	@Test
	public void LoginSuccessfully() {
		WebElement emailTxt = driver.findElement(CT_Account_Homework_day13.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys(CT_Account_Homework_day13.EMAIL);
		WebElement passwordTxt = driver.findElement(CT_Account_Homework_day13.PASS_ELEMENT);
		if(passwordTxt.isEnabled())
			passwordTxt.sendKeys(CT_Account_Homework_day13.PASS);
		WebElement buttonLogin = driver.findElement(CT_Account_Homework_day13.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();
		assertTrue(driver.findElement(CT_Account_Homework_day13.DASHBOARD_LOGIN).isDisplayed());
	}
	
	@Test
	public void LoginFail_BlankEmail_Pass() {
		WebElement emailTxt = driver.findElement(CT_Account_Homework_day13.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys("");
		WebElement passwordTxt = driver.findElement(CT_Account_Homework_day13.PASS_ELEMENT);
		if(passwordTxt.isEnabled())
			passwordTxt.sendKeys("");
		WebElement buttonLogin = driver.findElement(CT_Account_Homework_day13.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();
		assertTrue(driver.findElement(CT_Account_Homework_day13.LABEL_BLANK).isDisplayed());
	}
	
	@Test
	public void LoginFail_Unregistered() {
		WebElement emailTxt = driver.findElement(CT_Account_Homework_day13.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys("trang123@gmail.com");
		WebElement passwordTxt = driver.findElement(CT_Account_Homework_day13.PASS_ELEMENT);
		if(passwordTxt.isEnabled())
			passwordTxt.sendKeys("123456");
		WebElement buttonLogin = driver.findElement(CT_Account_Homework_day13.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();
		assertTrue(driver.findElement(CT_Account_Homework_day13.LABEL_EMAIL_UNREGISTER).isDisplayed());
	}
	/*@Test
	public void LoginFail_FormatEmail() {
		WebElement emailTxt = driver.findElement(CT_Account_Homework_day13.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys("trang123");
		WebElement buttonLogin = driver.findElement(CT_Account_Homework_day13.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();
		assertTrue(driver.findElement(CT_Account_Homework_day13.LABEL_EMAIL_UNFORMATED).isDisplayed());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}*/
	@Test
	public void LoginFail_IncorrectPass() {
		WebElement emailTxt = driver.findElement(CT_Account_Homework_day13.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys(CT_Account_Homework_day13.EMAIL);
		WebElement passwordTxt = driver.findElement(CT_Account_Homework_day13.PASS_ELEMENT);
		if(passwordTxt.isEnabled())
			passwordTxt.sendKeys("123456");
		WebElement buttonLogin = driver.findElement(CT_Account_Homework_day13.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();
		assertTrue(driver.findElement(CT_Account_Homework_day13.LABEL_EMAIL_UNREGISTER).isDisplayed());
	}	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
