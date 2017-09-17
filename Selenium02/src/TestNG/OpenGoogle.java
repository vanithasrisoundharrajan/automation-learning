package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogle {
	@Test(priority=1)
	public  void openGoogle(){
		System.setProperty("webdriver.chrome.driver","D:/eclipse/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.co.in");
		driver.manage().window().maximize();
		
		
	}
	@ Test(priority=2)
	public void openBing(){
		System.setProperty("webdriver.chrome.driver","D:/eclipse/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.bing.com");
		driver.manage().window().maximize();
	}

}
