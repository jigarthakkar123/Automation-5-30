import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement r1=driver.findElement(By.id("vfb-7-1"));
		WebElement r2=driver.findElement(By.id("vfb-7-2"));
		WebElement r3=driver.findElement(By.id("vfb-7-3"));
		Thread.sleep(2000);
		r1.click();
		System.out.println("Radio Button 1 Clicked");
		Thread.sleep(2000);
		r2.click();
		System.out.println("Radio Button 2 Clicked");
		Thread.sleep(2000);
		r3.click();
		System.out.println("Radio Button 3 Clicked");
		
		WebElement c1=driver.findElement(By.id("vfb-6-0"));
		WebElement c2=driver.findElement(By.id("vfb-6-1"));
		WebElement c3=driver.findElement(By.id("vfb-6-2"));
		Thread.sleep(2000);
		c1.click();
		System.out.println("Checkbox 1 Checked");
		Thread.sleep(2000);
		c2.click();
		System.out.println("Checkbox 2 Checked");
		Thread.sleep(2000);
		c3.click();
		System.out.println("Checkbox 3 Checked");
		Thread.sleep(2000);
		c1.click();
		System.out.println("Checkbox 1 UnChecked");
		Thread.sleep(2000);
		c2.click();
		System.out.println("Checkbox 1 UnChecked");
		Thread.sleep(2000);
		c3.click();
		System.out.println("Checkbox 1 UnChecked");
		
		Thread.sleep(2000);
		driver.close();
	}
}
