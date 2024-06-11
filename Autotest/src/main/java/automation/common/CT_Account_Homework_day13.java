package automation.common;

import org.openqa.selenium.By;

public class CT_Account_Homework_day13 {
	public static By EMAIL_ELEMENT = By.id("email");
	public static By PASS_ELEMENT = By.id("password");
	public static By BUTTON_LOGIN = By.xpath("//button[@type='submit']");
	public static By DASHBOARD_LOGIN = By.xpath("//a[text()='Dashboard']");
	public static By LABEL_BLANK = By.xpath("//strong[text()='The email field is required when phone is not present.']");
	public static By LABEL_EMAIL_UNREGISTER = By.xpath("//span[text()='Invalid login credentials']");
	
	//public static By IMAGE_LOGIN = By.xpath("//span[text()='admin']");
	
	public static String EMAIL = "admin@example.com";
	public static String PASS = "123456";

}
