package com.seleniumtest.qa.selenium_testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Find_Elements_LinkName_id {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Crome_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/free-online-trial");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Try Free")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));
		Thread.sleep(2000);
		driver.findElement(By.id("First Name")).sendKeys("ABCDE");
		Thread.sleep(2000);
		driver.findElement(By.id("Last Name")).sendKeys("XYZ");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("ABCDEXYZ@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Company")).sendKeys("XYZA");
		Thread.sleep(2000);
		
		
		
	}

}
