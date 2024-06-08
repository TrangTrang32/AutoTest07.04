package automation.testsuite;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day12_Checkbox extends CommonBase{
	@BeforeMethod
	public void openBrowser()
	{
		driver = initChromeTest(CT_PageURL.URL_SELENIUM_EASY_CHECKBOX);
	}
	@Test
	public void HandleSingleCheckbox() {
		//TC1: Check default value
		boolean isChbx1Selected = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/child::input")).isSelected();
		assertEquals(isChbx1Selected, true);
		//TC2: If checkbox is not checked, check to it:
		WebElement checkbox2 = driver.findElement(By.id("isAgeSelected"));
		boolean isChbx2Selected = checkbox2.isSelected();
		if(isChbx2Selected == false)
			checkbox2.click();
	}
	@Test
	public void multiCheckbox1() throws InterruptedException {
		//1. Get list checkbox
		List<WebElement> listCheckbox = driver.findElements(By.xpath("//div[text()='Multiple Checkbox Demo']/following-sibling::div[@class='panel-body']/child::div[@class='checkbox']//input"));
		//2. Duyet list tren de lay tung checkbox trong list cac checkbox
		for(int i=0; i < listCheckbox.size(); i++)
		{
			WebElement checkbox = listCheckbox.get(i);
			if(checkbox.isSelected() == true)
				System.out.println("Checkbox ở vị trí thứ " + (i+1) + " đã được checked");
			else	checkbox.click();
			Thread.sleep(3000);
			}
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
