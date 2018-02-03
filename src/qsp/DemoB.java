package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoB {
@Test
public void launchB()
{
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	WebDriver d1 = new FirefoxDriver();
	d1.get("http://google.com");
}
}