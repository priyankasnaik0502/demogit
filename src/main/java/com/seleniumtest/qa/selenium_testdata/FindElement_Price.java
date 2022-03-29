package com.seleniumtest.qa.selenium_testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_Price {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Crome_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("barbie dolls");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Pet Boutique Playset with 4 Pets")).click();
		Thread.sleep(2000);
		String Product_Name=driver.findElement(By.id("Product Title")).getText();
		String Product_Price=driver.findElement(By.xpath("//*[@id=\"olp_feature_div\"]/div[2]/span/a/span[2]")).getText();
		System.out.println("Product Name:" +Product_Name);
		System.out.println("Product Price:" +Product_Price);
		
		
	}

}
