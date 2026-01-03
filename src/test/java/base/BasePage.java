package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;	

import utils.WaitUtils;

public class BasePage {
	
	protected WebDriver driver;
	protected WaitUtils wait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtils(driver);
	}
	
	public void click(By locator) {
		wait.waitForElementClickable(locator).click();
		//driver.findElement(locator).click();
	}
	
	public void type(By locator, String text) {
		wait.waitForElementVisible(locator).sendKeys(text);
		driver.findElement(locator).sendKeys(text);
	}
	
	public String getText(By locator) {
		return wait.waitForElementVisible(locator).getText();
		//return driver.findElement(locator).getText();
	}

}
