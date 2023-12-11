import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();	
        driver.findElement(By.xpath("/html/body/p/a")).click();
		Thread.sleep(2000);
		String mainWindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		while(itr.hasNext())
		{
			String childWindow=itr.next();
			if(!mainWindow.equals(childWindow))
			{
				Thread.sleep(2000);
				driver.switchTo().window(childWindow);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("jigar@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(mainWindow);
		driver.close();
	}
}
