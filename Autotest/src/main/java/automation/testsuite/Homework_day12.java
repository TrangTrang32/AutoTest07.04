package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework_day12 extends CommonBase{
	@BeforeMethod
	public void openBrowser()
	{
		driver = initChromeTest(CT_PageURL.URL_SELENIUM_EASY_INPUT_FORM);
	}
	@Test
	public void chooseDropdownListandRadioButton() throws InterruptedException{
		//-> Hiển thị giá trị trong dropdownlist
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		//---> Kiểm tra dropdownlist có 52 phần tử
		int size = dropdownState.getOptions().size();
		assertEquals(size, 52);
		//---> Chọn State có giá trị là District of Columbia
		dropdownState.selectByVisibleText("Florida");
		String option = dropdownState.getFirstSelectedOption().getText();
		assertEquals(option, "Florida");
		Thread.sleep(3000);
		
		//-> Chọn giá trị radioButton
		WebElement rdoYes = driver.findElement(By.xpath("//input[@value='yes']"));
		WebElement rdoNo = driver.findElement(By.xpath("//input[@value='no']"));
		if(rdoYes.isEnabled() == true && rdoYes.isSelected() == false)
		{
			rdoYes.click();
			Thread.sleep(3000);
		}
		if(rdoNo.isEnabled() == true && rdoNo.isSelected() == false)
		{
			rdoNo.click();
			//Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		}
	}
	
	/*public void checkRadioButton() throws InterruptedException {
		WebElement rdoYes = driver.findElement(By.xpath("//input[@value='yes']"));
		WebElement rdoNo = driver.findElement(By.xpath("//input[@value='no']"));
		if(rdoYes.isEnabled() == true && rdoYes.isSelected() == false)
		{
			rdoYes.click();
			//Thread.sleep(3000);
		}
		if(rdoNo.isEnabled() == true && rdoNo.isSelected() == false)
		{
			rdoNo.click();
			//Thread.sleep(3000);
		}
			
	}*/
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
