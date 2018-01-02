package com.selenium.practice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://www.echoecho.com/htmlforms09.htm";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 3);
		driver.switchTo().frame(driver.findElement(By.className("table5")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Milk']")));
		try {
			for (int i = 0; i < 2; i++) {

				driver.findElement(By.xpath("//input[@value='Milk']")).click();
				System.out.println(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
			}
		} catch (NoSuchElementException ne) {

			System.out.println("no such element");
		}

		driver.quit();
	}

}
