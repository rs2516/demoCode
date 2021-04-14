package Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class FileUpload extends BaseClass{
	
	WebDriver driver;
	
	@Test
	public void uploadFile() throws InterruptedException, IOException
	{
		FileUpload fu = new FileUpload();
		driver= fu.initialiseDriver();
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec(".//AutoItScripts//fileupload.exe");
		
		
	}
	

}
