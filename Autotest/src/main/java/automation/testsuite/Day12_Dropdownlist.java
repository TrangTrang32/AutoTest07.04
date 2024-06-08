package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day12_Dropdownlist extends CommonBase{
		@BeforeMethod
		public void openBrowser()
		{
			driver = initChromeTest(CT_PageURL.URL_SELENIUM_EASY_DROPDOWNLIST);
		}
		@Test
		public void chooseDropdownList() throws InterruptedException{
			Select dropdownday = new Select(driver.findElement(By.id("select-demo")));
			//TC1: Kiểm tra dropdownlist có 8 phần tử
			int size = dropdownday.getOptions().size();
			assertEquals(size, 8);
			//TC2: Chọn cá option theo 3 cách:
			dropdownday.selectByVisibleText("Monday");
			String text1 = dropdownday.getFirstSelectedOption().getText();
			assertEquals(text1, "Monday");
			Thread.sleep(3000);
			dropdownday.selectByValue("Tuesday");
			String text2 = dropdownday.getFirstSelectedOption().getText();
			assertEquals(text2, "Tuesday");
			Thread.sleep(3000);
			dropdownday.selectByIndex(5);
			String text3 = dropdownday.getFirstSelectedOption().getText();
			assertEquals(text3, "Thursday");
			Thread.sleep(3000);
		}
		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}
}
