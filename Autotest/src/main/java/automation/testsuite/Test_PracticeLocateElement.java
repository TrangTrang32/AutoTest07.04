package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_PracticeLocateElement extends CommonBase {
	@BeforeMethod
	public void openFirefox() {
		driver = initChromeTest(CT_PageURL.URL_ALADA);
	}
	@Test
	public void locateElementById() {
		WebElement userNameElement = driver.findElement(By.id("txtLoginUsername"));
		System.out.println("email Element is: "+ userNameElement);
	}
	@Test
	public void locateElementByName() {
		WebElement passwordElement = driver.findElement(By.name("txtLoginPassword"));
		System.out.println("email Element is: "+ passwordElement);
	}
	@Test
	public void locateElementByClassName() {
		WebElement linkQMKElement = driver.findElement(By.className("link_register"));
		System.out.println("link Quên mật khẩu là: "+ linkQMKElement);
	}
	@Test
	public void locateElementByTagName() {
		WebElement butDangNhap = driver.findElement(By.tagName("button"));
		System.out.println("butDangNhap is: "+ butDangNhap);
	}
	@Test
	public void locateElementByLinkText() {
		WebElement textDNGiangVien = driver.findElement(By.linkText("Đăng nhập cho giảng viên"));
		System.out.println("textDNFacebook is: "+ textDNGiangVien);
	}
	@Test
	public void locateElementByPartialLinkText() {
		WebElement textDNPartGV = driver.findElement(By.partialLinkText("giảng viên"));
		System.out.println("textDNPartGV is: "+ textDNPartGV);
	}

}
