package Practice;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class SortTableByStream extends BaseClass {

	static WebDriver driver;

	@BeforeMethod
	public void runBeforeMethod() {
		SortTableByStream st = new SortTableByStream();
		driver = st.initialiseDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	}

	@Test
	public static void sortTable() {
		driver.findElement(By.xpath("//thead//tr//th")).click();
		List<WebElement> element = driver.findElements(By.xpath("//tbody//tr//td[1]"));
		List<String> originalList = element.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(sortedList.equals(originalList));

		List<String> price;

		do {
			List<WebElement> element1 = driver.findElements(By.xpath("//tbody//tr//td[1]"));
			price = element1.stream().filter(s -> s.getText().contains("Rice")).map(s -> getVeggiePrice(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));

			if (price.size() < 1) {
				driver.findElement(By.xpath("//a[@aria-label=\"Last\"]")).click();
			}
		} while (price.size() < 1);

	}

	private static String getVeggiePrice(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
