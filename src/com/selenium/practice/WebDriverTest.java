package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		String baseUrl="http://newtours.demoaut.com";
		String expectedTitle="Welcome: Mercury Tours";
		String actualResult1="";
		String actualResult2="";
		
		driver.get(baseUrl);
		actualResult1=driver.getTitle();
		System.out.println(driver.getTitle());
		if(actualResult1.contentEquals(expectedTitle)){
			
			System.out.println("test id passsed");
			
		
		}else{
			System.out.println("test failed");
			
		}
		
		
		driver.quit();
		
		
	}

}
