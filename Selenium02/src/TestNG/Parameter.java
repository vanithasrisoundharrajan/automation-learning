package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	WebDriver driver;
@BeforeSuite
@Parameters("browse")
	public void launch(String browser) {

		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","D:/Vanitha/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","D:/Vanitha/geckodriver.exe");
			driver=new FirefoxDriver();

		}
	}
	@Test
	public void openGoogle() {
		driver.get("http://www.google.co.in");
		
	}

}
