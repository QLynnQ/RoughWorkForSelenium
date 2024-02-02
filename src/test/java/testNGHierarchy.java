import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGHierarchy {

	@BeforeSuite
	public void connectToDB() {
		System.out.println("BS -- database connection established!");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- User creation successful!");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- Browser is launched!");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM - Login successful!");
	}
	
	@Test
	public void searchUser() {
		System.out.println("User has been found!");
	}
	
	@Test
	public void buyAirtime() {
		System.out.println("Airtime purchase successful!");
	}
	
	@Test
	public void createTemplate() {
		System.out.println("Template created!");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("AM -- logout successful!");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- browser has been closed!");
	}
	
	@AfterTest
	public void destroyUser() {
		System.out.println("AT -- user destroyed!");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS -- database connected lost!");
	}
	
}
