package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestfireMain {

	WebDriver driver;
	
	@FindBy(xpath="//*")
	WebElement welcomeWord;
	
	
	public TestfireMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getWelcomeWord(){
		 return	welcomeWord.getText();
		}
}
