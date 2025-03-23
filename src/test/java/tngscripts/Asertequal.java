package tngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asertequal {
	WebDriver driver;
	
	@Test
	public void aserteqal() {
		driver=new ChromeDriver ();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("HTML")).click();
		/*String expectedTitle="HTML Tutorial";
		String actualTitle="HTML Tutorial";*/
		String expectedTitle="HTML Tutorial";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
		
	}

}
