package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	private WebDriver driver;
	@FindBy(id = "txtLoginUsername") @CacheLookup WebElement emailElement;
	@FindBy(id = "txtLoginPassword") @CacheLookup WebElement passwordElement;
	@FindBy(xpath = "//button[text()='ĐĂNG NHẬP' and @type='submit']") @CacheLookup WebElement buttonLoginElement;
	
	public LoginPageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	public void LoginFunction(String email, String pass) {
		emailElement.sendKeys(email);
		emailElement.getText();
		passwordElement.sendKeys(pass);
		buttonLoginElement.click();
	}

}
