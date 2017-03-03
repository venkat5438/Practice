package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Lib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String Popup="";
		driver.get("http://jsbin.com/usidix/1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(5000);// we should not use thread.sleep because it depends on system configuration ...
		//instead of that we can use implicit/explicit waits depends on situation
		//Implicit wait - used to set the default waiting time throughout the program
		//Explicit wait - used to set the waiting time for a particular instance/ elements only
		//Explicit waits are done using the WebDriverWait and ExpectedCondition classes.
		
		Popup=driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		System.out.println(Popup);
		driver.quit();
		

	}

}
