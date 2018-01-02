package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String FURL = "https://www.facebook.com/";
		driver.get(FURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement firstname = driver.findElement(By.xpath("//*[@id='u_0_1']"));
		try {
			firstname.clear();
			firstname.isDisplayed();
			System.out.println(firstname.isEnabled());
			System.out.println(firstname.getClass());
			firstname.sendKeys("Raju");
		} catch (ElementNotVisibleException e) {
			System.out.println("element not found");
		}
		WebElement surname = driver.findElement(By.xpath("//*[@id='u_0_3']"));
		try {
			surname.clear();
			surname.isDisplayed();
			System.out.println(surname.isEnabled());
			System.out.println(surname.getClass());
			surname.sendKeys("Dil");
		} catch (ElementNotVisibleException e) {
			System.out.println("element not found");

		}
		
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id='u_0_p']/span[2]/label"));
		
	System.out.println(radiobutton.isEnabled());	//*[@id="u_0_p"]/span[2]/label
	radiobutton.click();
	
	WebElement creatacc=driver.findElement(By.xpath("//*[@id='u_0_h']"));
	System.out.println(creatacc.isDisplayed());
	creatacc.click();
		
		

	}
}
