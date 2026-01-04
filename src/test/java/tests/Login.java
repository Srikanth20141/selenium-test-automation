package tests;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.JSONReader;

public class Login extends BaseTest{
	
	LoginPage loginPage;
	
	@Test
	public void test01() {	
		
		JSONObject data = JSONReader.getJsonData("src/test/resources/testdata/loginData.json");
		String firstname = (String) data.get("firstname");
		String email = (String) data.get("email");
		
		LoginPage login = new LoginPage(driver);
		login.clickEle();
		login.clickTextBox();
		login.fillForm(firstname,email);
	}

}
