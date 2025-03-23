package tngscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import tng.TNG;

public class TNGCart extends TNG{
	@Test
	public void cart() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(3000);
		
	}

}
