package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.common.CT_Account;

public class LoginPage {
	private WebDriver driver;//driver cua thuoc tinh
	public LoginPage(WebDriver _driver) {
		this.driver = _driver; //bien cua ham
	}
	//Khởi tạo hàm đăng nhập
	public void LoginFunction(String email, String pass) {
		WebElement emailTxt = driver.findElement(CT_Account.EMAIL_ELEMENT);
		if(emailTxt.isEnabled())
			emailTxt.sendKeys(email);
		WebElement passwordTxt = driver.findElement(CT_Account.PASSWORD_ELEMENT);
		if(passwordTxt.isEnabled())
			passwordTxt.sendKeys(pass);
		WebElement buttonLogin = driver.findElement(CT_Account.BUTTON_LOGIN);
		if(buttonLogin.isEnabled())
			buttonLogin.click();
	}

}
