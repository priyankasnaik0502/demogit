package com.seleniumtest.qa.selenium_testdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_login {

	private static FluentWait<WebDriver> wait;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Crome_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.id("identifierId")).sendKeys("priyankasnaik0502@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierNext")).click();
		
		 driver.findElement(By.xpath("//*[@id=\\\"identifierNext\\\"]/div/button/span")).click();         

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));

	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("your password");
	        Thread.sleep(3000);

	        

	        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click(); 
	            
	     
	}

}
