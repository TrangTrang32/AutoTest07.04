package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_Account;
import automation.page.LoginPageFactory;
import automation.page.UpdateInfoFactory;

public class UpdateInfoTest extends CommonBase {
	@BeforeMethod
	public void openPage() {
		driver = initChromeTest(CT_PageURL.URL_ALADA);
	}
	@Test
	public void UpdateInfoSuccessfully() {
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction(CT_Account.EMAIL, CT_Account.PASS);
		assertTrue(driver.findElement(CT_Account.TEXT_KHOAHOCCUATOI).isDisplayed());
		
		UpdateInfoFactory updateInfoPage = new UpdateInfoFactory(driver);
		updateInfoPage.UpdateInfoFunction("Phạm", "Trang", 1, "02-02-2000", "0321456987", "Hà Nội", "Aladin");
		assertTrue(updateInfoPage.labelName.isDisplayed());
	}
	@Test
	public void UpdateInfoSuccessfully2() {
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction(CT_Account.EMAIL, CT_Account.PASS);
		assertTrue(driver.findElement(CT_Account.TEXT_KHOAHOCCUATOI).isDisplayed());
		
		UpdateInfoFactory updateInfoPage = new UpdateInfoFactory(driver);
		updateInfoPage.UpdateInfoFunction("Nguyen", "Quang", 3, "02-01-2000", "0321456987", "Hà Nội", "Aladin");
		assertTrue(updateInfoPage.labelName.isDisplayed());
	}
	
	@AfterMethod
	public void QuitDriver() {
		//driver.quit(); //clear cachelookup
		driver.close(); //chỉ đóng, không clear
	}
}
