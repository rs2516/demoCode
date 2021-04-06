package StepDefinations;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Resources.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends BaseClass {
	
	WebDriver driver;
	
	@Given("^Open the URL \"([^\"]*)\" in browser$")
    public void open_the_url_something_in_browser(String url) throws Throwable 
	{
        LoginTest lt = new LoginTest();
       driver =  lt.initialiseDriver();
       driver.get(url);
    }

    @When("^Click on the login link$")
    public void click_on_the_login_link() throws Throwable 
    {
       HomePage hp = new HomePage(driver);
       if(hp.popupSize()>0)
       {
    	   hp.popupNoThanks().click();
       }
       else
       {
    	   hp.getLoginLink().click();
       }
    }
    
    @And("^Enter emailid (.+) and password (.+)$")
    public void enter_emailid_and_password(String email, String password) throws Throwable 
    {
    	LoginPage lp = new LoginPage(driver);
    	lp.getEmailField().sendKeys(email);
    	lp.getPasswordField().sendKeys(password);
    	lp.getLoginBtn().click();
    }

    @Then("^Verify login page displayed$")
    public void verify_login_page_displayed() throws Throwable 
    {
       LoginPage lp = new LoginPage(driver);
       if(lp.getEmailField().isDisplayed())
       {
    	   System.out.println("Email text field displayed");
       }
       driver.quit();
    }

}
