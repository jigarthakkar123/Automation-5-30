import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_And_ID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("jigar");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("jigar");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name=login]")).click();
		Thread.sleep(10000);
		driver.close();
	}
}
