package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPageJBA {
	private static By emailLoc = By.id("ContentPlaceHolder1_TextBox1");
	private static By passwordLoc = By.id("ContentPlaceHolder1_TextBox2");
	private static By submitLoc =By.id("ContentPlaceHolder1_btnlogin");
	private static By myaccountLoc = By.linkText("My Account");
	private static By logoutLoc = By.id("logout");
	public static void logoutdetails(WebDriver driver)
	{
		Actions act = new Actions(driver); 
		act.moveToElement(driver.findElement(myaccountLoc)).build().perform();
		driver.findElement(logoutLoc).click();
	}
	public static void loginDetails(WebDriver driver, String email, String password)
	{
		driver.findElement(emailLoc).sendKeys(email);
		driver.findElement(passwordLoc).sendKeys(password);
		driver.findElement(submitLoc).click();
		
	}
}