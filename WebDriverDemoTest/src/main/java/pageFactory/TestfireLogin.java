package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestfireLogin {

	WebDriver driver;

	@FindBy(name = "uid")
	WebElement userTestfireName;

	@FindBy(name = "passw")
	WebElement passwordTestfire;

	@FindBy(name = "btnSubmit")
	WebElement login;

	public TestfireLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String strUserName) {
		userTestfireName.sendKeys(strUserName);

	}

	public void setPassword(String strPassword) {
		passwordTestfire.sendKeys(strPassword);
	}

	public void clickLogin() {
		login.click();
	}

	public void loginTestfire(String strUserName, String strPasword) {
		// Fill user name
		this.setUserName(strUserName);
		// Fill password
		this.setPassword(strPasword);
		// Click Login button
		this.clickLogin();

	}

}
