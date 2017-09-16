
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/eclipse/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.name("dropdownmenu"));
		
	//Select menu=new Select(dropdown);
	
	//menu.selectByVisibleText("Milk");
	
	
	Select menu=new Select(dropdown);
	
	menu.selectByIndex(2);
	

	//Select menu=new Select(dropdown);
	
	//menu.selectByValue("Cheese");
	

	}

}
