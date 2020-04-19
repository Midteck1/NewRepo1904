package NewTesting.Jtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {

	
	@Test
	public void abc() {
		String current = System.getProperty("user.dir")+"\\"+"chromedriver.exe";
		System.out.println(current);
		System.setProperty("webdriver.chrome.driver",current);
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://google.com");
	}
}
