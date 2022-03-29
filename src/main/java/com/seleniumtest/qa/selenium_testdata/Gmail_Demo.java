package com.seleniumtest.qa.selenium_testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Demo {

	private static final WebElement password = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Crome_Drivers\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();

		    driver.manage().window().maximize();
		    driver.get("https://accounts.google.com/signin");

		    Thread.sleep(3000);

		   driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("priyankas0502@gmail.com");
		    Thread.sleep(3000);

		   // driver.findElement(By.id("identifierNext")).click();
		    Thread.sleep(3000);

		   // driver.findElement(By.xpath("//input[@name='password']"));

		   WebDriverWait wait = new WebDriverWait(driver, 20);

		   wait.until(ExpectedConditions.elementToBeClickable(password));

		    password.sendKeys("Sainath@123");

		    driver.findElement(By.id("passwordNext")).click();
	}
}
