package tng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TNG {
	public WebDriver driver;
	
	@BeforeClass
	public void browser() {
		driver=new ChromeDriver ();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	}@BeforeMethod
	public void login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(3000);
		System.out.println("logout is done");
	}
	@AfterClass
	public void close () {
		driver.quit();
	}

}
