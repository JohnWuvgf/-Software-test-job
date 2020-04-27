import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriver2 {
	private static WebDriver driver;
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.baidu.com/");
		System.out.println("Home Page Title:" +driver.getTitle());
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testSearch() throws InterruptedException {
		
		
//		第一种定位页面元素方式
		WebElement element_keyword = driver.findElement(By.id("kw"));
		element_keyword.sendKeys("水笙");
//		第二种定位页面元素方式
		WebElement element_search = driver.findElement(By.cssSelector("#su"));
		element_search.submit();
		Thread.sleep(5000);
		
	}
	@Test
	public void testLink() throws InterruptedException{
		WebElement element_link = driver.findElement(By.linkText("学术"));
		element_link.click();
		Thread.sleep(5000);
	}

}
