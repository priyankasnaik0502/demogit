package com.seleniumtest.qa.selenium_testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_Name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Crome_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.name("field-keywords")).sendKeys("barbie dolls");
		
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(2000);
		
		
		
	}

}
