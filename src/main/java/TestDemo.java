import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestDemo {
	
	public static void main(String[] args) {
		WebDriver driver;
		BrowserUtils br = new BrowserUtils();		
		
		driver = br.launchBrowser("firefox");
		ElementUtils eleUtils = new ElementUtils(driver);

		br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By pswd = By.name("password");
		By btn = By.xpath("//input[@type='submit']");
		
		br.getPageSource("New Customer");
		
		//Invalid email/password scenario
		eleUtils.doSendKeys(emailId, "mrtester@email.com");
		eleUtils.doSendKeys(pswd, "mrtester77");
		eleUtils.doClick(btn);
		
		
		//br.closeBrowser();

	}
	
	//create the element + perform the action
	//getElement + click
	//getElement + sendKeys
	
}
