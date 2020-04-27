package test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageFactory.TestfireIndex;
import pageFactory.TestfireLogin;
import pageFactory.TestfireMain;




public class TestfireLoginTest {

	WebDriver driver;
	TestfireLogin testfireLogin;
	TestfireIndex testfireIndex;
	TestfireMain testfireMain;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.testfire.net/Index.jsp");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//create Index page object
		testfireIndex = new TestfireIndex(driver);
		//click the link named "sign in"
		testfireIndex.clickLoginLink();
		//create Login page object
		testfireLogin = new TestfireLogin(driver);
		//Authenticate and login
		testfireLogin.loginTestfire("admin", "admin");
		//create the main page object
		testfireMain = new TestfireMain(driver);
		//Determine whether a string exists
		Assert.assertTrue(testfireMain.getWelcomeWord().contains("Congratulations"));
		
		}
	}


