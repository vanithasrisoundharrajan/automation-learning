package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TimeCalculation {
	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;
	@BeforeSuite
	public void openBrowser (){
	starttime=System.currentTimeMillis();
      System.setProperty("webdriver.chrome.driver","D:/eclipse/selenium/chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().window().maximize(); 
	}
	
	@Test
	public void openGoogle (){
		driver.get("http://www.google.co.in");
	}
	
	@Test
	public void openBing (){
		driver.get("http://www.bing.co.in");
	}
	
	@AfterSuite
	public void close(){
		driver.quit();
	
	
	
	 endtime=System.currentTimeMillis();
	 totaltime=endtime-starttime;
	System.out.println(totaltime/1000.0 + "seconds"); 

}
}