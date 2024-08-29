package com.HoverMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hover {
WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/flights.html");
	}
	@Test
	public void Example() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Login or Signup']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Login & check bookings']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
