package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.page.Tedu_UpdatePasswordPage;

public class HandleDatePicker extends CommonBase {
	@BeforeMethod
	public void openPage() {
		driver = initChromeTest(CT_PageURL.URL_TRIP);
	}
	@Test(priority = 1)
	public void chooseCheckin_Checkout() throws InterruptedException {
		WebElement checkin = driver.findElement(By.id("checkIn"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('readonly', 'readonly)", checkin);
		checkin.clear();
		checkin.sendKeys("Tue, Jun 18");
		
		WebElement checkout = driver.findElement(By.id("checkOut"));
		js.executeScript("arguments[0].removeAttribute('readonly', 'readonly)", checkout);
		checkout.clear();
		checkout.sendKeys("Tue, Jul 9");
		Thread.sleep(3000);
		
	}

}
