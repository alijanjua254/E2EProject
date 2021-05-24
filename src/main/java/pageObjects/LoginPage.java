package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	By email = By.id("login1");
	By password = By.id("password");
	By submit = By.name("proceed");
	By forgotPassword = By.linkText("Forgot Password?");

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement submitbtn() {
		return driver.findElement(submit);
	}
	public ForgotPassword forgotPasswrod() {
		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);
	}

}
