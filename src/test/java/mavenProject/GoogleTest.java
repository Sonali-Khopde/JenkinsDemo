package mavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@Test
	public void launchTest() {
		String expected="Google";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Sonali\\Ignite Selenium\\Selenium jars - all\\browser drivers\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	

}
