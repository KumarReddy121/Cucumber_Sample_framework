package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver  rdriver) {
		ldriver =rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "username")
	//(xpath="//input[@name='username']")
	@CacheLookup
	WebElement  Username;
	
	@FindBy(name = "password")
	//(xpath="//input[@name='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement Login_Btn; 	 	


	public void setUserName(String UserName) {
		Username.sendKeys(UserName);
	}
	public void setPassword(String PWD) {
		Password.sendKeys(PWD);
	}
	public void LoginBtn() {
		Login_Btn.click();
	}

}
