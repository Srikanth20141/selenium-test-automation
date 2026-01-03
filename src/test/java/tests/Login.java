package tests;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class Login extends BaseTest{
	
	LoginPage loginPage;
	
	@Test
	public void test01() {
		LoginPage login = new LoginPage(driver);
		login.clickEle();
		login.clickTextBox();
		login.fillForm();
	}

}
