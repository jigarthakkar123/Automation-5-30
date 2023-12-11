import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> cols=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Total Column : "+cols.size());
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		System.out.println("Total Rows : "+rows.size());
		for(WebElement e:rows)
		{
			Thread.sleep(100);
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		driver.close();
	}
}
