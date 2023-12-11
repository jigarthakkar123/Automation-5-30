import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();	
        driver.findElement(By.name("cusid")).sendKeys("53920");		
        Thread.sleep(5000);
        driver.findElement(By.name("submit")).submit();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();		
        String alertMessage= driver.switchTo().alert().getText();		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        alert.accept();
		Thread.sleep(2000);
		driver.close();
	}
}
