package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	
	public WebDriver driver;
	@BeforeMethod
	public void lunchBroweser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/");
	
	}
	
	@AfterTest
	public void tearDown() { 
		driver.quit(); 
	}

}
