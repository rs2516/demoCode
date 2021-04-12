package Practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class WindowAuthentication extends BaseClass {

	WebDriver driver;

	@Test
	public void windowAuthPopUp() throws InterruptedException {
		WindowAuthentication wa = new WindowAuthentication();
		driver= wa.initialiseDriver();
		driver.get("http://rahul.singh:Rahul@2516@trac.navyuginfo.com/trac");
	}

}
