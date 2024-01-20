import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * 
 * @author Quadri BrowserUtil is having some browser generic methods
 *
 */
public class BrowserUtils {
	private WebDriver driver;

	public WebDriver launchBrowser(String browserName) {
		System.out.println("Browser name is " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.print("Please pass the right browser for this test");

		}

		return driver;
	}

	public void launchURL(String URL) {

		if (URL == null) {
			System.out.print("URL provided is null");
		} else if (URL.indexOf("http") == 0) {
			driver.get(URL);
		}

		else {
			System.out.print("Wrong URL value is provided");
		}

	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getURL() {
		String title = driver.getTitle();
		return title;
	}

	public String getPageSource(String value) {
		String pageSource = driver.getPageSource();
		if (pageSource.contains(value)) {
			return "PASS";
		}
		return "FAIL";

	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
