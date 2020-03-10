package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomepageJBA {
	private static By sortLoc = By.id("ContentPlaceHolder1_sortby");
	private static By vieweleLoc = By.xpath("//a[@id='grid']");
	private static By gotoLoc =By.id("txtswr");
	private static By gotobuttonLoc = By.id("Button1");
	public static void sortDetails(WebDriver driver,String name)
	{
		new Select(driver.findElement(sortLoc)).selectByVisibleText("New & Popular");
		driver.findElement(vieweleLoc).click();
		driver.findElement(gotoLoc).sendKeys(name);
		driver.findElement(gotobuttonLoc).click();
		
		
	}
}
