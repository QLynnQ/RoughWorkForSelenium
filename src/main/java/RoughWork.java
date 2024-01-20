import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoughWork {

	static WebDriver driver = null;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		/*
		 * WebElement email = driver.findElement(By.id("input-email")); WebElement pswd
		 * = driver.findElement(By.id("input-password"));
		 */

		By eId = By.id("input-email");
		By psd = By.id("input-password");
		By btn = By.xpath("//input[@type='submit']");

		// WebElement userEmail = getElement(eId);
		// WebElement userPswd = getElement(psd);

		// userEmail.sendKeys("test@gmail.com");
		// userPswd.sendKeys("test@123");

		// getElement(eId).sendKeys("test@gmail.com");
		// getElement(psd).sendKeys("test@123");

		ElementUtils eleUtil = new ElementUtils(driver);

		eleUtil.doSendKeys(eId, "test@gmail.com");
		eleUtil.doSendKeys(psd, "test@123");

		eleUtil.doClick(btn);

		/*
		 * doSendKeys(eId, "test@gmail.com"); doSendKeys(psd, "test@123");
		 */
	}
	
	public String doElementGetText(By locator) {
		return getElement(locator).getText();
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
