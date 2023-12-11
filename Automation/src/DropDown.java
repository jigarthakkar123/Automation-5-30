import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Select fruits=new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		Thread.sleep(3000);
		fruits.selectByValue("orange");
		Thread.sleep(3000);
		
		fruits.deselectByVisibleText("Banana");
		Thread.sleep(3000);
		fruits.deselectByValue("orange");
		Thread.sleep(3000);
		driver.close();
	}
}
