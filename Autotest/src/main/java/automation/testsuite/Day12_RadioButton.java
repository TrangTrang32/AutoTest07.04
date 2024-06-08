package automation.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day12_RadioButton extends CommonBase{
	
	@BeforeMethod
	public void openBrowser()
	{
		driver = initChromeTest(CT_PageURL.URL_SELENIUM_EASY_RADIO);
	}
	@Test
	public void checkRadioButton() throws InterruptedException {
		//driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		//driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']")).click();
		WebElement rdo0to5 = driver.findElement(By.xpath("//input[@value='0 - 5']"));
		WebElement rdo5to15 = driver.findElement(By.xpath("//input[@value='5 - 15']"));
		WebElement rdo15to50 = driver.findElement(By.xpath("//input[@value='15 - 50']"));
		if(rdo0to5.isEnabled() == true && rdo0to5.isSelected() == false)
		{
			rdo0to5.click();
			Thread.sleep(3000);
		}
		if(rdo5to15.isEnabled() == true && rdo5to15.isSelected() == false)
		{
			rdo5to15.click();
			Thread.sleep(3000);
		}
		if(rdo15to50.isEnabled() == true && rdo15to50.isSelected() == false)
		{
			rdo15to50.click();
			Thread.sleep(3000);
		}
			
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
