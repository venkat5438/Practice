package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Lib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// below we are giving 10 seconds for whole program using webdriver instance
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String text;
		String alert;
		text=driver.findElement(By.xpath("//input[@id='email']")).getTagName();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("venkatramreddy108@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		driver.findElement(By.id("u_0_q")).click();
		driver.manage().window().maximize();
	    System.out.println(text);
	    driver.quit();
		

	}

}
