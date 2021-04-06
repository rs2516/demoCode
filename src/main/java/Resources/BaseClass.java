package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	public WebDriver initialiseDriver()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
