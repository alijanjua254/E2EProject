package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePageTest extends base {
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		
	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String email, String password, String text) throws IOException{
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		LoginPage lp =l.getLogin();
		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(password);
		ForgotPassword fp = lp.forgotPasswrod();
		fp.getEmail().sendKeys("heyyyy");
		fp.submit().click();
		
		System.out.println(text);
		//lp.submitbtn().click();
		
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		
		data[0][0] = "non@gmail.com";
		data[0][1] = "nonpass";
		data[0][2] = "non restricted user";
		
		data[1][0] = "restrict@gmail.com";
		data[1][1] = "restrictpass";
		data[1][2] = "nrestricted user";
		
		
		return data;
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
