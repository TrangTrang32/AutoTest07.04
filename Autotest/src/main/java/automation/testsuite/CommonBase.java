package automation.testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonBase {
	public WebDriver driver;
	public WebDriver initFirefoxTest(String url)
	{
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;
		
	}
	public WebDriver initChromeTest(String url)
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;
		
	}
}
