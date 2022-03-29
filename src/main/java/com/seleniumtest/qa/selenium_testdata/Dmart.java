package com.seleniumtest.qa.selenium_testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dmart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Crome_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("Search for restaurant, cuisine or a dish")).sendKeys("Highway Break");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[3]/input")).click();
		Thread.sleep(2000);
		

	}

}
