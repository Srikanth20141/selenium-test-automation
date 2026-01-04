package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage{

	private By elementBtn = By.xpath("(//div[@class='card-up'])[1]");
	private By textBoxlbl = By.xpath("//li[@id='item-0']//span[contains(text(),'Text Box')]");
	private By txtfirstname = By.xpath("//input[@id='userName']");
	private By txtEmail = By.xpath("//input[@id='userEmail']");
	private By btnSubmit = By.xpath("//button[@id='submit']");
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickEle()
	{
		click(elementBtn);
	}
	
	public void clickTextBox() {
		click(textBoxlbl);
	}
	
	public void fillForm(String firstname, String email) {
		type(txtfirstname, firstname);
		type(txtEmail, email);
		click(btnSubmit);
	}
	

}
