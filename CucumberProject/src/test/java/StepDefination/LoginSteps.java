package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObject.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LoginSteps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("Launch {string} Browser")
	public void Launch_Browser(String Browser) {
	
		if(Browser.toLowerCase().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			 driver =new ChromeDriver();
				lp=new LoginPage(driver);
			
		}else if(Browser.toLowerCase().contains("edge")) {
			System.setProperty("Webdriver.edge.driver","Drivers//msedgedriver.exe");
			driver =new EdgeDriver();
			
		}else if(Browser.toLowerCase().contains("firefox")) {
			System.out.println("firefox");
		}
		lp=new LoginPage(driver);
		
	}
	@And("Open URL {string}")
	public void Open_URL(String URL) {
		driver.get(URL);
	}
	@And("Enter UserName as {string} and Password as {string}")
	public void Enter_UserName_as_and_Password_as(String Unme, String PWD) throws InterruptedException {
		Thread.sleep(1000);
		lp.setUserName(Unme);
		lp.setPassword(PWD);
	}
	@And("Click on Login button")
	public void Click_on_Login_button() {
		lp.LoginBtn();
		
	}
	
	
	
	
	

}
