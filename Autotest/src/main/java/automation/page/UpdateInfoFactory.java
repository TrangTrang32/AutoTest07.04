package automation.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UpdateInfoFactory {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='avatar2']") WebElement avatarIcon;
	@FindBy(xpath = "//a[text()='Chỉnh sửa thông tin']") WebElement linkChinhSuaThongTin;
	@FindBy(id="member_lastname") WebElement txtLastName;
	@FindBy(id="member_firstname") WebElement txtFirstName;
	@FindBy(xpath="//label[normalize-space()='Nam']/child::input") WebElement rdbNam;
	@FindBy(xpath="//label[normalize-space()='Nữ']/child::input") WebElement rdbNu;
	@FindBy(id="txtCity") WebElement dropCity;
	@FindBy(id="member_birthday") WebElement txtBirth;
	@FindBy(id="member_tel") WebElement txtPhone;
	@FindBy(id="member_address") WebElement txaAddress;
	@FindBy(id="member_company") WebElement txtCompany;
	@FindBy(xpath = "//button[text()='Lưu thông tin']") WebElement btnLuuThongTin;
	@FindBy(xpath="//div[text()='Phạm Trang']") public WebElement labelName;
	public UpdateInfoFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	public void UpdateInfoFunction(String lastName, String firstName, int city, String ngaySinh, String phone, String address, String company) {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		avatarIcon.click();
		linkChinhSuaThongTin.click();
		txtLastName.clear();
		txtLastName.sendKeys(lastName);
		txtFirstName.clear();
		txtFirstName.sendKeys(firstName);
		if(rdbNam.isEnabled()==true && rdbNu.isSelected()==false)	rdbNu.click();
		Select selectCity = new Select(dropCity);
		selectCity.selectByIndex(city);
		txtBirth.clear();
		txtBirth.sendKeys(ngaySinh);
		txtPhone.clear();
		txtPhone.sendKeys(phone);
		txaAddress.clear();
		txaAddress.sendKeys(address);
		txtCompany.clear();
		txtCompany.sendKeys(company);
		btnLuuThongTin.click();
		
	}
}
