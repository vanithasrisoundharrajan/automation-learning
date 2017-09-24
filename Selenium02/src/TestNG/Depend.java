package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Depend {
	WebDriver driver;
	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:/Vanitha/chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@Test(dependsOnMethods={"launchBrowser"})
	public void openGoogle()
	{
	driver.get("http://www.google.co.in");
	
}}