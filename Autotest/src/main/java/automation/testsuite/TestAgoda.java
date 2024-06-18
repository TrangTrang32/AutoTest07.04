package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAgoda extends CommonBase {
	@BeforeMethod
	public void openPage() {
		driver = initChromeTest(CT_PageURL.URL_AGODA);
	}
	@Test
	public void DropdownlistHanhKhach() throws InterruptedException {
		WebElement dropHanhKhach = 
				driver.findElement(By.xpath("//div[@class='SearchBoxTextDescription__title' and text()='1 Hành khách']"));
		dropHanhKhach.click();
		WebElement themNguoiLon = driver.findElement(By.xpath("//span[@data-element-name='flight-occupancy-adult-increase']"));
		Thread.sleep(3000);
		themNguoiLon.click();
		WebElement themTreEm = driver.findElement(By.xpath("//span[@data-element-name='flight-occupancy-children-increase']"));
		themTreEm.click();
		String soLuongHK = dropHanhKhach.getText();
		assertEquals(soLuongHK, "3 Hành Khách");
	}

}
