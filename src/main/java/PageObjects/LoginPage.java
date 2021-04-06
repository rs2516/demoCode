package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By emailField= By.xpath("//input[@id='user_email']");
	By passwordField= By.xpath("//input[@id='user_password']");
	By loginBtn = By.xpath("//input[@name='commit']");
	By errorMsg= By.xpath("//div[contains(text(), 'Invalid email or password. ')]");
	
	public WebElement getEmailField()
	{
		return driver.findElement(emailField);
	}
	
	public WebElement getPasswordField()
	{
		return driver.findElement(passwordField);
	}
	
	public WebElement getLoginBtn()
	{
		return driver.findElement(loginBtn);
	}
	
	public String geterrorMessage()
	{
		String message = driver.findElement(errorMsg).getText();
		return message;
	}

}
