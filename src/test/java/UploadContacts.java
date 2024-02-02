import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadContacts {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://qa-frontend.eBanqo.io");
		
	}
	
	@Test
	public void verifyLogoIsVisibleTest() {
		boolean flag = driver.findElement(By.xpath("//img[@src='/static/media/ebqLogo.7fd8951e.svg']")).isDisplayed();
		Assert.assertEquals(true, flag);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
