package com.seleniumtest.qa.selenium_testdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Crome_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.irctc.com/");
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();

		String str=driver.getCurrentUrl();
		System.out.println(str);
		driver.close();
	}

}
