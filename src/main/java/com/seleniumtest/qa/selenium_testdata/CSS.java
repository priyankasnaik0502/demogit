package com.seleniumtest.qa.selenium_testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Crome_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("i.hm-icon")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Kindle E-readers & Books")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Kindle Kids")).click();
		Thread.sleep(2000);
	String title=driver.findElement(By.cssSelector("span#productTitle")).getText();
	Thread.sleep(1000);
	System.out.println(title);
	if(title.contains("Kindle Kids"))  {
	System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
		driver.close();
	}
} 

		
		

	
