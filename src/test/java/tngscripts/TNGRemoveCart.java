package tngscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import tng.TNG;

public class TNGRemoveCart extends TNG{
	@Test
	public void removecart() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		Thread.sleep(3000);
}
}
