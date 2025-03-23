package tngscripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asrtrue {
	WebDriver driver;
	
	@Test
	public void asrtrue() {
		
		driver=new ChromeDriver ();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement cart = driver.findElement(By.id("shopping_cart_container"));
		//Assert.assertTrue(cart.isDisplayed(), "failed");//assert true
		Assert.assertFalse(cart.isDisplayed(), "This test will fail");
		driver.quit();
	}

}
