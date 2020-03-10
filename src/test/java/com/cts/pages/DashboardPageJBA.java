package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DashboardPageJBA {
	private static By categoryLoc = By.xpath("//li[@class='dropdown dropdown-large']");
	private static By subcategoryLoc =By.linkText("Biographies & Memoirs");
	public static void categoryDetails(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(categoryLoc)).build().perform();
	driver.findElement(subcategoryLoc).click();
}
}
