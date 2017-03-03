package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingGuiElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*String baseUrl = "http://www.facebook.com";
		String tagline = "";
		driver.get(baseUrl);
		tagline = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagline);*/
		// System.out.println(driver.getPageSource());//it gives complete source
		// code of the page
		// System.out.println(driver.getTitle());//it gives page title
		// System.out.println(driver.getWindowHandle());//print like this
		// "CDwindow-38b5da06-57a3-4bfa-9979-08d2337b2888"
		// System.out.println(driver.getClass());//it prints the webpage class
		// like "class org.openqa.selenium.chrome.ChromeDriver"
		//System.out.println(driver.getCurrentUrl());// print like this
													// https://www.facebook.com/
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a")).click();;
        Thread.sleep(10000);
		driver.quit();

	}

}
