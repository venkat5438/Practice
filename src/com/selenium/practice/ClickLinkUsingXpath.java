package com.selenium.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinkUsingXpath {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-testid='forgot_account_link']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@data-testid='forgot_account_link']")).getText());
	/*	
	Robot robot=new Robot();
	robot.mouseMove(3, 5);
		robot.keyPress(3);
		robot.keyRelease(4);*/
	
	driver.quit();
		
	}

}
