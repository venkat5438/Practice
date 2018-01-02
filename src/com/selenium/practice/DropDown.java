package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String bUrl="http://gmail.com";
		driver.get(bUrl);
		driver.manage().window().maximize();
		
		
		//importing Select package for dropdown and creating an instance
		
		Select dropdown= new Select(driver.findElement(By.xpath("//select[@name='country']")));
		dropdown.selectByVisibleText("BAHRAIN");//we can use selectvisibleby text OR select by index also
		Thread.sleep(5000);
		dropdown.selectByIndex(17);
	/*if (dropdown.isMultiple()) {
		dropdown.selectByIndex(15);
		dropdown.selectByIndex(16); 
		
	} else {
		
		dropdown.deselectAll();

	}*/
		Thread.sleep(5000);
		driver.quit();

	}

}
