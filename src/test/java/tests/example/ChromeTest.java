package tests.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ChromeTest {
	@Test
	public void as()
	{
	        System.setProperty("webdriver.chrome.driver", "/Users/muktaaphale/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.google.com");

		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		element.submit();
		System.out.println("Page title is: " + driver.getTitle());
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith("cheese!");
			}
		});	
		// Should see: "cheese! - Google Search"
		Assert.assertEquals("Cheese! - Google Search", driver.getTitle());
		//Close the browser
		driver.quit();
	}

}
