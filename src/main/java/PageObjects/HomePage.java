package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
	}

	By loginLink = By.xpath("//span[text()='Login']");
	By popUpNoThanks= By.xpath("//button[text()='NO THANKS']");

	public WebElement getLoginLink() 
	{
		return driver.findElement(loginLink);
	}
	
	public int popupSize()
	{
		return driver.findElements(popUpNoThanks).size();
	}
	
	public WebElement popupNoThanks()
	{
		return driver.findElement(popUpNoThanks);
	}

}
