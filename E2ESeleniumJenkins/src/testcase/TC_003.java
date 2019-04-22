package testcase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {

	@Test
	public void testCase()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("abc@gmail.com");
		driver.findElementById("pass").sendKeys("123456");
		driver.quit();
		
	}
	
}
