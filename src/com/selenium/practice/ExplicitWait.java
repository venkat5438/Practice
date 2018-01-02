package com.selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Lib\\chromedriver.exe");
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("tutorial");
		// This step will result in an alert on screen  
		String text="";
		text=driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click(); 
		*/
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[16]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

		Alert promptAlert  = driver.switchTo().alert();
		String alertText = promptAlert .getText();
		System.out.println("Alert text is " + alertText);
		//Send some text to the alert
		promptAlert .sendKeys("Accepting the alert");
		Thread.sleep(4000); //This sleep is not necessary, just for demonstration
		promptAlert .accept();
		
		

	}
	
	
	

}
