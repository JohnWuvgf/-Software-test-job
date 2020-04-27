import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriver {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com/");
		
		System.out.println("Home Page Title:" +driver.getTitle());
//		第一种定位页面元素方式
		WebElement element_keyword = driver.findElement(By.id("kw"));
		element_keyword.sendKeys("水笙");
//		第二种定位页面元素方式
		WebElement element_search = driver.findElement(By.cssSelector("#su"));
		element_search.submit();
		Thread.sleep(5000);
		driver.quit();
		
	}
}
