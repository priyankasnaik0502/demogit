package com.seleniumtest.qa.selenium_testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Using_Text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Crome_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()=\"Show password\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Sign in instead\"]")).click();
		
	}

}
