package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestfireIndex {

	WebDriver driver;
	
	@FindBy(id="LoginLink")
	WebElement loginLink;
	
	public TestfireIndex(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginLink() {
		loginLink.click();
	}
}
