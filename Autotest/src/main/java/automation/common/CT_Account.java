package automation.common;

import org.openqa.selenium.By;

public class CT_Account {
	public static By EMAIL_ELEMENT = By.id("txtLoginUsername");
	public static By PASSWORD_ELEMENT = By.id("txtLoginPassword");
	public static By BUTTON_LOGIN = By.xpath("//button[text()='ĐĂNG NHẬP' and @type='submit']");
	public static By TEXT_KHOAHOCCUATOI = By.xpath("(//a[text()='Khóa học của tôi'])[1]");
	public static By LABEL_EMAIL_EMPTY = By.id("txtLoginUsername-error");
	public static By LABEL_PASS_EMPTY = By.id("txtLoginPassword-error");
	public static By LABEL_EMAIL_UNREGISTER = By.xpath("//p[text()='Email này chưa được đăng ký.']");
	public static By LABEL_EMAIL_UNFORMATED = By.id("txtLoginUsername-error");
	public static By LABEL_PASS_FAIL = By.xpath("//p[text()='Mật khẩu sai.']");
	public static By PLACEHOLDER_EMAIL = By.xpath("//input[@placeholder='Địa chỉ email' and @id='txtLoginUsername']");
	public static By PLACEHOLDER_PASS = By.xpath("//input[@placeholder='Mật khẩu' and @id='txtLoginPassword']");
	
	public static String EMAIL = "doibuon28122013@gmail.com";
	public static String PASS = "buonpham123@";
}
