package tests.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxTest {
	@Test
	public void as()
	{
                WebDriver driver = new FirefoxDriver();
                Wait<WebDriver> wait = new WebDriverWait(driver, 30);

		driver.get("http://www.google.com");
                //driver.navigate().to("http://www.google.com");

		driver.findElement(By.name("q")).sendKeys("firefox");
                driver.findElement(By.name("btnG")).click();
                System.out.println("Page title is: " + driver.getTitle());
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith("docker");
			}
		});	
		// Should see: "firefox - Google Search"
		Assert.assertEquals("firefox - Google Search", driver.getTitle());
		//Close the browser
		driver.quit();
	}

}
