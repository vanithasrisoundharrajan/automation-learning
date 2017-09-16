import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DownloadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/eclipse/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.java2s.com/Code/Jar/o/Downloadojdbc142jar.htm");
		driver.findElement(By.linkText("ojdbc/ojdbc-1.4.2.jar.zip( 1,454 k)")).click();
		
		
	}

}
