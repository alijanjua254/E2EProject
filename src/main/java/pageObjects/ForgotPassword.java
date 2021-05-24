package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	public WebDriver driver;
	By email = By.id("txtlogin");
	By submit = By.name("next"); 
	
	
	public ForgotPassword(WebDriver driver) {
		this.driver = driver;
	}
		
		public WebElement getEmail() {
			return driver.findElement(email);
		}
		public WebElement submit() {
			return driver.findElement(submit);
		}
	
	
	

}
