package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseSeriesOfActions {

	public static void main(String[] args) throws InterruptedException {
	
		// below providing driver configuration
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
		
		// below creating webdriver instance
		WebDriver driver = new ChromeDriver();
		
		// below opening the URL
		driver.get("https://www.facebook.com/");
		
		//maximize windows
		driver.manage().window().maximize();
		
		//below finding a webelement using findby method and storing
		WebElement emailbox= driver.findElement(By.xpath("//input[@id='email']"));
		
		
	   // below creating Actions class object
		Actions builder= new Actions(driver);
		
		//put sometime sleep
		Thread.sleep(5000);
		
		//below instantiating Action object using Actions object reference and doing series of actions
		// below movetoelement means mouse will move to emailbox element and click the box
		//keydown keyup are shiftin and conveting values to uppercase letters
		// double click clicks the entervalue
		//contexttext is what text we enter into the elementbox
		// build() means it will build all the above actions as single task
		
		// perform is we have to perform the action
		
		Action seriesOfActions=
				builder.moveToElement(emailbox).click().
				//keyUp(emailbox, Keys.SHIFT).
				//keyDown(emailbox, Keys.SHIFT).
				//sendKeys(emailbox, "CHINtu").
				//keyUp(emailbox, Keys.SHIFT).
				keyDown(emailbox, Keys.SHIFT).
				sendKeys(emailbox, "chintu").
				doubleClick().contextClick().build();
		
		
		// below we are performing the actions 
		seriesOfActions.perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
