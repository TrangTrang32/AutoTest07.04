package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_Account;
import automation.page.LoginPageFactory;
import automation.page.Tedu_UpdatePasswordPage;

public class UpdatePass_JSExecutor_Test extends CommonBase {
	@BeforeMethod
	public void openPage() {
		driver = initChromeTest(CT_PageURL.URL_TEDU);
	}
	@Test(priority = 1)
	public void UpdatePassword() throws InterruptedException{
		Tedu_UpdatePasswordPage  teduPage = new Tedu_UpdatePasswordPage(driver);
		//Register	
//		teduPage.registerTeduFunction("Phạm Trang", "01/01/2000", "doibuon28122013@gmail.com", "123456aA@");
//		Thread.sleep(3000);
		teduPage.LoginTeduFunction("doibuon28122013@gmail.com", "123456");
		teduPage.UpdatePasswordFunction("123456", "123456a", "123456a");
		Thread.sleep(3000);
	}
	@Test(priority = 2)
	public void Search() throws InterruptedException{
		Tedu_UpdatePasswordPage teduPage = new Tedu_UpdatePasswordPage(driver);
		teduPage.LoginTeduFunction("doibuon28122013@gmail.com", "123456a");
		Thread.sleep(3000);
		teduPage.SearchCoursesFunction("ASP Net");
		assertTrue(driver.findElement(By.xpath("//h3[@class='md']/a")).isDisplayed());
		/*assertTrue(driver.findElement(By.xpath("(//a[@title='Bài 52: Gửi phản hồi và gửi mail trong ASP NET sử dụng SMTP'])[1]"))
				.isDisplayed());
		assertTrue(driver.findElement(By.xpath("((//a[@title='Lập trình dự án Website bán hàng ASP.NET MVC 4'])[1]"))
				.isDisplayed());
		*/
	}

}
