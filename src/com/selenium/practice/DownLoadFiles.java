package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownLoadFiles {

	public static void main(String[] args) {
		
		

		// below providing driver configuration
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
		
		// below creating webdriver instance
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://messenger.yahoo.com/");
		
		WebElement download=driver.findElement(By.id("download-btn"));
		
		System.out.println(download.getAttribute("href"));
		
	    // storing the href of id  into a string
		String idhref=download.getAttribute("href");
		
		// storing wget command into another string
		String wget_command="cmd /c wget64 -P C:" + idhref;
		
		
		// executing we get command using process
		
		try {
			
			Process exec=Runtime.getRuntime().exec(wget_command);
		int time=	exec.waitFor();
		
		System.out.println("exit value "+time);
			
		} catch (Exception e) {
			System.out.println("time exceed or incorrect command");
		} 
	

	}

}
