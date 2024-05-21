package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework2_day8 extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeTest(CT_PageURL.URL_AUTOMATIONFC);
	}
	@Test
	public void idElement() {
		WebElement nameId = driver.findElement(By.id("name"));
		System.out.println("Name Id Element is: "+ nameId);
		WebElement addressId = driver.findElement(By.id("address"));
		System.out.println("Password Id Element is: "+ addressId);
		WebElement emailId = driver.findElement(By.id("email"));
		System.out.println("Password Id Element is: "+ emailId);
		WebElement passwordId = driver.findElement(By.id("password"));
		System.out.println("Password Id Element is: "+ passwordId);
	}
	@Test
	public void nameElement() {
		WebElement nameName = driver.findElement(By.name("name"));
		System.out.println("Name Name Element is: "+ nameName);
		WebElement addressName = driver.findElement(By.name("address"));
		System.out.println("Password Name Element is: "+ addressName);
		WebElement emailName = driver.findElement(By.name("email"));
		System.out.println("Password Id Element is: "+ emailName);
		WebElement passwordName = driver.findElement(By.name("password"));
		System.out.println("Mobile Number Name Element is: "+ passwordName);
	}
	@Test
	public void tagNameElement() {
		WebElement inputTagname = driver.findElement(By.tagName("input"));
		System.out.println("Input Element is: "+ inputTagname);
		WebElement textareaTagName = driver.findElement(By.tagName("textarea"));
		System.out.println("Input Element is: "+ textareaTagName);
	}

}

