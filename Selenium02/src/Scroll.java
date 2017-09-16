import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {


	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/eclipse/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("google expansion");
		//driver.findElement(By.name("btnG")).click();
		Robot robot = new Robot();
		    robot.keyPress(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER);
		    driver.findElement(By.xpath("//*[@id='rso']/div/div/div[1]/div/div/h3/a")).click();
		    Thread.sleep(2000);
 ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 

	}

}
