package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLinksAccess {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	 	System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//click on the face book logo left side
		driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")).click();
		
		//verifyng that we are reaching the same page or not
		
		if (driver.getTitle().equals("Facebook - Log In or Sign Up")) {
			
			System.out.println("Facebook - Log In or Sign Up");
			
		} else {
System.out.println("we are on different page");
		}
		
		
		
		
	}

}
