package app2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestApp {
	
	@Parameters("Browser")
	@Test
	public void test_01(String browser) throws IOException
	{
		Reporter.log("Test Started in browser "+browser, true);
		
		Properties props = new Properties();
		props.load(TestApp.class.getClassLoader().getResourceAsStream("config.properties"));
		System.out.println(props.getProperty("Name")+ "  "+props.getProperty("Passward"));
		System.out.println("Ended");
	}

}
