package NewTesting.Jtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {

	
	@Test
	public void abc() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ManojPadhan\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://google.com");
	}
}
