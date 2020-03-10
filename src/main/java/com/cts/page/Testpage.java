package com.cts.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Testpage {

		public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.jainbookagency.com/login.aspx");
		//driver.findElement(By.id("ContentPlaceHolder1_TextBox1")).sendKeys("karanammahesh321@gmail.com");
		//driver.findElement(By.id("ContentPlaceHolder1_TextBox2")).sendKeys("Mahesh1234");
		driver.findElement(By.id("ContentPlaceHolder1_btnlogin")).click();
		Thread.sleep(2000);
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//li[@class='dropdown dropdown-large']"))).build().perform();
//		driver.findElement(By.xpath("//a[text()='Biographies & Memoirs']")).click();
//		Select sortby = new Select(driver.findElement(By.id("ContentPlaceHolder1_sortby")));
//		sortby.selectByVisibleText("New & Popular");
		//driver.findElement(By.xpath("//a[@id='grid']")).click();
		//driver.findElement(By.id("txtswr")).sendKeys("sridevi");
//		driver.findElement(By.id("Button1")).click();
//		Thread.sleep(2000);
//		Actions act = new Actions(driver); 
//		act.moveToElement(driver.findElement(By.linkText("My Account"))).build().perform();
		//driver.findElement(By.id("logout")).click();
		}
		}

