import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/eclipse/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://filehosting.org");
		WebElement  uploadfile=driver.findElement(By.name("upload_file"));
		uploadfile.click();
		
		String filelocation="D:\\vanitha\\auto.txt";
		StringSelection stringSelection=new StringSelection(filelocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		
		Thread.sleep(2000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement  uploadfile1=driver.findElement(By.name("uploader_email"));
		uploadfile1.click();
		 
		uploadfile1.sendKeys("vanithasrisoundharrajan@gmail.com");
		    WebElement  uploadfile2=driver.findElement(By.name("accept_tos"));
			uploadfile2.click();
			
			  WebElement  uploadfile3=driver.findElement(By.name("submit"));
				uploadfile3.click();
				 	 
		    
		    
		    
	}
	


		
		
		
		
	}


