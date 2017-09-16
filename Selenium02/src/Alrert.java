import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alrert {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/eclipse/selenium/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.manage().window().maximize();
		WebElement alrert = driver.findElement(By.name("B2"));
		alrert.click();
		
		
		Thread.sleep(2000);
		Alert alrert1=driver.switchTo().alert();
		alrert1.accept(); 
		
		WebElement  conf= driver.findElement(By.name("B3"));
		 conf.click();
		 
		 Thread.sleep(2000);
		 Alert conf1=driver.switchTo().alert();
		 conf1.accept();
		 conf1.accept();
		 
			WebElement  prompt= driver.findElement(By.name("B4"));
			prompt.click();
			 
			 Thread.sleep(2000);
			 Alert prompt1=driver.switchTo().alert();
			 prompt1.sendKeys("design");
			 prompt1.accept(); 
			 prompt1.accept();

	}

	

		
	}


		
	


