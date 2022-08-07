package app2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestApp2 {
	
	@Test
	public void testingApp() throws MalformedURLException
	{
		//DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setBrowserName("chrome");
		//System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setCapability("browserName", "chrome");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.117:4444"), opt);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
