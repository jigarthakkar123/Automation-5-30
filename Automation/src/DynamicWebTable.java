import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String tableData=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(tableData);
		Thread.sleep(2000);
		driver.close();
	}
}
