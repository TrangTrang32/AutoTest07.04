package automation.page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.testsuite.CT_PageURL;

public class Tedu_UpdatePasswordPage {
	WebDriver driver;
	@FindBy(id = "UserName") WebElement emailElement;
	@FindBy(id = "Password") WebElement passElement;
	@FindBy(xpath = "//button[text()='Đăng nhập']") WebElement buttonDN;
	@FindBy(xpath = "(//a[@title='Tài khoản'])[1]") WebElement iconMyAccount;
	
	//Register Account access Tedu
	@FindBy(xpath="//a[@title='Đăng ký']") WebElement btnDangKy;
	@FindBy(id = "FullName") WebElement hoTenDKElement;
	@FindBy(id = "DOB") WebElement ngaysinhDKElement;
	@FindBy(id = "Email") WebElement emailDKElement;
	@FindBy(id = "Password") WebElement passDKElement;
	@FindBy(xpath = "//div[text()='reCAPTCHA']") WebElement recapcha;
	@FindBy(xpath = "//iframe[@title='reCAPTCHA']") WebElement capcha;
	@FindBy(xpath = "(//a[@title='Đăng nhập'])[2]/parent::div") WebElement btnTroThanhTV;
	
	//Update Pass
	@FindBy(xpath = "//button[@id='onesignal-slidedown-cancel-button']") WebElement btnLater;
	@FindBy(xpath = "//a[@title='Đổi mật khẩu']") WebElement btnDoiMk;
	@FindBy(id = "OldPassword") WebElement oldPassElement;
	@FindBy(id = "NewPassword") WebElement newPassElement;
	@FindBy(id = "ConfirmNewPassword") WebElement renewPassElement;
	@FindBy(xpath = "//input[@value='Cập nhật']") WebElement btnCapNhat;
	
	//Search courses
	@FindBy(name = "keyword") WebElement inputSearchElement;
	@FindBy(xpath = "//button[@class='button-search btn btn-primary']") WebElement btnSearch;
	public Tedu_UpdatePasswordPage(WebDriver _driver) {
		
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	public void registerTeduFunction(String name, String birth, String email, String pass){
		//Thread.sleep(3000);
		btnDangKy.click();
		hoTenDKElement.sendKeys(name);
		ngaysinhDKElement.sendKeys(birth);
		emailDKElement.sendKeys(email);
		passDKElement.sendKeys(pass);
		//capcha
		driver.switchTo().frame(capcha);
		recapcha.click();
		btnTroThanhTV.click();
	}
	public void LoginTeduFunction(String email, String pass) {
		emailElement.clear();
		emailElement.sendKeys(email);
		
		passElement.clear();
		passElement.sendKeys(pass);
		
		buttonDN.click();
		
	}

	public void UpdatePasswordFunction(String oldPass, String newPass, String renewPass) throws InterruptedException {
		Thread.sleep(3000);
		btnLater.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", iconMyAccount);
		btnDoiMk.click();
		Thread.sleep(3000);
		oldPassElement.sendKeys(oldPass);
		newPassElement.sendKeys(newPass);
		renewPassElement.sendKeys(renewPass);
		if(renewPass == newPass )
			btnCapNhat.click();
		else
			renewPassElement.clear(); //em không thấy có validate case này
	}
	public void SearchCoursesFunction(String course) throws InterruptedException {
		//btnLater.click();
		inputSearchElement.clear();
		inputSearchElement.sendKeys(course);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btnSearch);
		btnSearch.click();
		Thread.sleep(3000);
	}
	

}
