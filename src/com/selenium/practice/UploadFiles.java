package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) throws InterruptedException {
		// below providing driver configuration
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
				
				// below creating webdriver instance
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://www.megafileupload.com/");
				Thread.sleep(5000);
				//System.out.println(driver.findElement(By.id("revslider-835")).getText());
				driver.findElement(By.xpath("//a[@id='revslider-835']/ul/li/div[4]/a")).click();
				WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

				// enter the file path onto the file-selection input field
				uploadElement.sendKeys("C:\\newhtml.html"); // here \\ is mandatory for proper escape for the back slash

				// check the "I accept the terms of service" check box
				driver.findElement(By.id("terms")).click();

				// click the "UploadFile" button
				driver.findElement(By.name("send")).click();
				
				
	}

}
