package com.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksInPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		String sele = "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// below we declared list to store all links
		List<WebElement> elements = driver.findElements(By.tagName("a"));

		String[] str = new String[elements.size()];

		int i = 0;
		// extract the link texts of each link element
		for (WebElement e : elements) {

			str[i] = e.getText();

			i++;

		}
		// test each Link

		for (String string : str) {

			driver.findElement(By.linkText(string)).click();
			if (driver.getTitle().equals(sele))
			{
				System.out.println("\"" + string + "\"" + "is working. ");

			} 
			
			else 
			{
				System.out.println("\"" + string + "\"" + "is not working .");
			}
driver.navigate().back();
		}
driver.quit();
	}

}
