package com.seleniumtest.qa.selenium_testdata;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Crome_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		int link; 
		list <WebElement> links=driver.findElement(By.cssSelector("a"));
		for(WebElement link:links)
		{
			System.out.println(link.getText());
			System.out.println("-------------------");
		}

	}

}
