package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework1_day8 extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeTest(CT_PageURL.URL_SELECTORHUB);
		
	}
	@Test
	public void idElement() {
		//WebElement userEmailId = driver.findElement(By.id("shub46"));
		//System.out.println("User Email Id Element is: "+ userEmailId); //--> fail, có phải do input Email readonly ko ạ???
		WebElement passwordId = driver.findElement(By.id("passwordId"));
		System.out.println("Password Id Element is: "+ passwordId);
	}
	@Test
	public void nameElement() {
		WebElement userEmailName = driver.findElement(By.name("email"));
		System.out.println("User Email Name Element is: "+ userEmailName);
		WebElement passwordName = driver.findElement(By.name("Password"));
		System.out.println("Password Name Element is: "+ passwordName);
		WebElement companyName = driver.findElement(By.name("company"));
		System.out.println("Company Name Element is: "+ companyName);
		WebElement mobileNumberName = driver.findElement(By.name("mobile number"));
		System.out.println("Mobile Number Name Element is: "+ mobileNumberName);
	}
	@Test
	public void classNameElement() {
		WebElement userEmailClassName = driver.findElement(By.className("jsSelector"));
		System.out.println("User Email Class Name Element is: "+ userEmailClassName);
		WebElement passwordClassName = driver.findElement(By.className("jsSelector"));
		System.out.println("Password Class Name Element is: "+ passwordClassName);
		WebElement companyClassName = driver.findElement(By.className("form-control"));
		System.out.println("Company Class Name Element is: "+ companyClassName);
		WebElement mobileNumberClassName = driver.findElement(By.className("form-control"));
		System.out.println("Mobile Number Class Name Element is: "+ mobileNumberClassName);
	}
	@Test
	public void tagNameElement() {
		WebElement inputTagname = driver.findElement(By.tagName("input"));
		System.out.println("Input Element is: "+ inputTagname);
	}
	@Test
	public void linkTextElement() {
		WebElement textConceptTest = driver.findElement(By.linkText("Click to Download PNG File"));
		System.out.println("Text Concep Test Element is: "+ textConceptTest);
	}
	@Test
	public void partialLinkTextEelement() {
		WebElement textConceptTestPartial = driver.findElement(By.partialLinkText("PNG Fil"));
		System.out.println("Partial Text Concep Test Element is: "+ textConceptTestPartial);
	}

}
